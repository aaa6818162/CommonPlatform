﻿
/***************************************************************************
*       功能：     RMRiverCheck业务处理层
*       作者：     李伟伟
*       日期：     2016/7/23
*       描述：     巡查信息
* *************************************************************************/

using System;
using System.Linq;
using System.Collections.Generic;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Model.PermissionManager;
using Project.Model.RiverManager;
using Project.Repository.PermissionManager;
using Project.Repository.RiverManager;
using Project.Service.HRManager;
using Project.Service.PermissionManager;

namespace Project.Service.RiverManager
{
    public class RiverCheckService
    {

        #region 构造函数
        private readonly RiverCheckRepository _riverCheckRepository;
        private readonly UserDepartmentRepository _userDepartmentRepository;
        private static readonly RiverCheckService Instance = new RiverCheckService();

        public RiverCheckService()
        {
            _userDepartmentRepository = new UserDepartmentRepository();
            this._riverCheckRepository = new RiverCheckRepository();
        }

        public static RiverCheckService GetInstance()
        {
            return Instance;
        }
        #endregion


        #region 基础方法 
        /// <summary>
        /// 新增
        /// </summary>
        /// <param name="entity"></param>
        /// <returns></returns>
        public System.Int32 Add(RiverCheckEntity entity)
        {
            return _riverCheckRepository.Save(entity);
        }


        /// <summary>
        /// 删除
        /// </summary>
        /// <param name="pkId"></param>
        public bool DeleteByPkId(System.Int32 pkId)
        {
            try
            {
                var entity = _riverCheckRepository.GetById(pkId);
                _riverCheckRepository.Delete(entity);
                return true;
            }
            catch
            {
                return false;
            }
        }

        /// <summary>
        /// 删除
        /// </summary>
        /// <param name="entity"></param>
        public bool Delete(RiverCheckEntity entity)
        {
            try
            {
                _riverCheckRepository.Delete(entity);
                return true;
            }
            catch
            {
                return false;
            }
        }

        /// <summary>
        /// 更新
        /// </summary>
        /// <param name="entity"></param>
        public bool Update(RiverCheckEntity entity)
        {
            try
            {
                _riverCheckRepository.Update(entity);
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }


        /// <summary>
        /// 通过主键获取实体
        /// </summary>
        /// <param name="pkId">主键</param>
        /// <returns></returns>
        public RiverCheckEntity GetModelByPk(System.Int32 pkId)
        {
            return _riverCheckRepository.GetById(pkId);
        }


        /// <summary>
        /// 分页
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <param name="skipResults">开始</param>
        /// <param name="maxResults">结束</param>
        /// <returns>获取当前页【巡查信息】和总【巡查信息】数</returns>
        public System.Tuple<IList<RiverCheckEntity>, int> Search(RiverCheckEntity where, int skipResults, int maxResults)
        {
            var expr = PredicateBuilder.True<RiverCheckEntity>();
            #region
            // if (!string.IsNullOrEmpty(where.PkId))
            //  expr = expr.And(p => p.PkId == where.PkId);
            if (where.RiverId > 0)
                expr = expr.And(p => p.RiverId == where.RiverId);
            if (!string.IsNullOrEmpty(where.RiverName))
                expr = expr.And(p => p.RiverName == where.RiverName);
            if (!string.IsNullOrEmpty(where.UserName))
                expr = expr.And(p => p.UserName == where.UserName);
            if (!string.IsNullOrEmpty(where.UserCode))
                expr = expr.And(p => p.UserCode == where.UserCode);
            //if (!string.IsNullOrEmpty(where.Coords))
            //  expr = expr.And(p => p.Coords == where.Coords);
            // if (!string.IsNullOrEmpty(where.IsActive))
            //  expr = expr.And(p => p.IsActive == where.IsActive);
            // if (!string.IsNullOrEmpty(where.CreatorUserCode))
            //  expr = expr.And(p => p.CreatorUserCode == where.CreatorUserCode);
            // if (!string.IsNullOrEmpty(where.CreationTime))
            //  expr = expr.And(p => p.CreationTime == where.CreationTime);
            // if (!string.IsNullOrEmpty(where.LastModifierUserCode))
            //  expr = expr.And(p => p.LastModifierUserCode == where.LastModifierUserCode);
            // if (!string.IsNullOrEmpty(where.LastModificationTime))
            //  expr = expr.And(p => p.LastModificationTime == where.LastModificationTime);
            // if (!string.IsNullOrEmpty(where.Remark))
            //  expr = expr.And(p => p.Remark == where.Remark);
            #endregion

            var expr2 = PredicateBuilder.True<UserDepartmentEntity>();
            if (where.Attr_DepartmentCodes != null && where.Attr_DepartmentCodes.Any())
                expr2 = expr2.And(p => where.Attr_DepartmentCodes.Contains(p.DepartmentCode));

            var query = _riverCheckRepository.Query();
            if (where.Attr_DepartmentCodes != null && where.Attr_DepartmentCodes.Any())
            {
                query = (from a in _riverCheckRepository.Query().Where(expr)
                         from b in _userDepartmentRepository.Query().Where(expr2)
                         where a.UserCode == b.UserCode
                         select a);
            }
            var list = query.Where(expr).OrderByDescending(p => p.CreationTime).Skip(skipResults).Take(maxResults).ToList();

            list.ForEach(p =>
            {
                p.Attr_Lever =
                    DictionaryService.GetInstance()
                        .GetModelByKeyCode("Lever", UserInfoService.GetInstance().GetUserInfo(p.UserCode).Lever)
                        .KeyName;

                p.Attr_RiverDepartmentName = RiverService.GetInstance().GetModelByPk(p.RiverId.GetValueOrDefault()).DepartmentName;
            });

            var count = query.Where(expr).Count();
            return new System.Tuple<IList<RiverCheckEntity>, int>(list, count);
        }

        /// <summary>
        /// 取列表
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <returns>返回列表</returns>
        public IList<RiverCheckEntity> GetList(RiverCheckEntity where)
        {
            var expr = PredicateBuilder.True<RiverCheckEntity>();
            #region
            expr = expr.And(p => p.RiverName == where.RiverName);
            expr = expr.And(p => p.UserCode == where.UserCode);
            expr = expr.And(p => p.CreationTime >= where.Attr_BeginDate && p.CreationTime < where.Attr_EndDate.AddDays(1));
            #endregion
            var list = _riverCheckRepository.Query().Where(expr).OrderBy(p => p.PkId).ToList();
            return list;
        }
        #endregion


        #region 新增方法

        #endregion
    }
}




