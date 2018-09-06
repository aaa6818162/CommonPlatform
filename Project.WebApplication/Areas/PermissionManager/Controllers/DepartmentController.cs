﻿

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.PermissionManager;
using Project.Service.PermissionManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.PermissionManager.Controllers
{
    public class DepartmentController : BaseController
    {

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = DepartmentService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }


        public ActionResult List()
        {
            //int.Parse("ssss");
            return View();
        }

        public MvcJsonResult GetList()
        {
            //int.Parse("ssss");
            var where = new DepartmentEntity();
            where.DepartmentCode = RequestHelper.GetFormString("DepartmentCode");
            where.DepartmentName = RequestHelper.GetFormString("DepartmentName");

            var checkList = new List<int>();
            var userCode = RequestHelper.GetString("UserCode");
            var roleId = RequestHelper.GetInt("RoleId");
            if (!string.IsNullOrWhiteSpace(userCode))
            {
                checkList = UserInfoService.GetInstance().GetFunctionDetailList_Checked(userCode);
            }

            if (roleId > 0)
            {
                checkList = DepartmentService.GetInstance().GetDepartList_Checked(roleId);
            }

            var searchList = DepartmentService.GetInstance().GetList(where);

            searchList.ForEach(p =>
            {
                p.Attr_IsCheck = checkList.Any(y => y == p.PkId);
            });


            var dataGridEntity = new DataGridTreeResponse<DepartmentEntity>(searchList.Count, searchList);
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }

        public MvcJsonResult GetList_Combotree()
        {
            var where = new DepartmentEntity();
            where.DepartmentCode = RequestHelper.GetFormString("DepartmentCode");
            where.DepartmentName = RequestHelper.GetFormString("DepartmentName");
            var searchList = DepartmentService.GetInstance().GetTreeList(where, LoginUserInfo.UserDepartmentList.ToList(), LoginUserInfo.UserCode.ToUpper() == "ADMIN", true);

            return new MvcJsonResult(searchList, new NHibernateContractResolver(new[] { "children" }));
        }
        public MvcJsonResult GetAllist_Combotree()
        {
            var where = new DepartmentEntity();
            where.DepartmentCode = RequestHelper.GetFormString("DepartmentCode");
            where.DepartmentName = RequestHelper.GetFormString("DepartmentName");
            var searchList = DepartmentService.GetInstance().GetTreeList(where, LoginUserInfo.UserDepartmentList.ToList(), true, true);

            return new MvcJsonResult(searchList, new NHibernateContractResolver(new[] { "children" }));
        }

        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<DepartmentEntity> postData)
        {
            var addResult = DepartmentService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<DepartmentEntity>()
            {
                Success = addResult.Item1,
                Result = postData.RequestEntity,
                Error = addResult.Item1 ? null : new ErrorInfo(addResult.Item2)
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit(AjaxRequest<DepartmentEntity> postData)
        {
            var updateResult = DepartmentService.GetInstance().Update(postData.RequestEntity);
            var result = new AjaxResponse<DepartmentEntity>()
            {
                Success = updateResult.Item1,
                Result = postData.RequestEntity,
                Error = updateResult.Item1 ? null : new ErrorInfo(updateResult.Item2)
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = DepartmentService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<DepartmentEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }


        [HttpPost]
        public MvcJsonResult SetRowDepart()
        {
            var t = this.Request["RolePkId"];
            var rolePkId = RequestHelper.GetInt("RolePkId");
            var functionPkId = RequestHelper.GetInt("FunctionPkId");
            var functionDetailPkId = RequestHelper.GetInt("FunctionDetailPkId");
            var isCheck = RequestHelper.GetInt("IsCheck") == 1;
            var addResult = RoleService.GetInstance().SetRowFunction(rolePkId, functionPkId, functionDetailPkId, isCheck);
            var result = new AjaxResponse<RoleEntity>()
            {
                Success = addResult,
                Result = null
            };
            return new MvcJsonResult(result, null);
        }

    }
}




