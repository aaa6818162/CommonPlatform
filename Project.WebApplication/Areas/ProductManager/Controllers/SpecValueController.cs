﻿

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using AutoMapper;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.ProductManager;
using Project.Service.ProductManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.ProductManager.Controllers
{
    public class SpecValueController : BaseController
    {

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = SpecValueService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

 
        public ActionResult List()
        {
            return View();
        }

        public MvcJsonResult GetList()
        {
            var pIndex = this.Request["page"].ConvertTo<int>();
            var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new SpecValueEntity();
			//where.PkId = RequestHelper.GetFormString("PkId");
			//where.SpecId = RequestHelper.GetFormString("SpecId");
			//where.SpecValueName = RequestHelper.GetFormString("SpecValueName");
			//where.Sort = RequestHelper.GetFormString("Sort");
			//where.ImagePath = RequestHelper.GetFormString("ImagePath");
            var searchList = SpecValueService.GetInstance().Search(where, (pIndex - 1) * pSize, pSize);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Item2,
                rows = searchList.Item1
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<SpecValueEntity> postData)
        {
            var addResult = SpecValueService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<SpecValueEntity>()
               {
                   Success = true,
                   Result = postData.RequestEntity
               };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit( AjaxRequest<SpecValueEntity> postData)
        {
            var newInfo = postData.RequestEntity;
            var orgInfo = SpecValueService.GetInstance().GetModelByPk(postData.RequestEntity.PkId);
            var mergInfo = Mapper.Map(newInfo, orgInfo);
            var updateResult = SpecValueService.GetInstance().Update(mergInfo);
            
            var result = new AjaxResponse<SpecValueEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = SpecValueService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<SpecValueEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }
    }
}




