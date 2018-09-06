﻿

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using AutoMapper;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.ProductManager;
using Project.Service.ProductManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.ProductManager.Controllers
{
    public class SpecController : BaseController
    {

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = SpecService.GetInstance().GetModelByPk(pkId);
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
            var where = new SpecEntity();
            //where.PkId = RequestHelper.GetFormString("PkId");
            where.SpecName = RequestHelper.GetFormString("SpecName");
            where.Remark = RequestHelper.GetFormString("Remark");
            where.SpecType = RequestHelper.GetInt("SpecType");
            where.ShowType = RequestHelper.GetInt("ShowType");
            var searchList = SpecService.GetInstance().Search(where, (pIndex - 1) * pSize, pSize);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Item2,
                rows = searchList.Item1
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }

        public MvcJsonResult GetListAll()
        {
            var searchList = SpecService.GetInstance().GetList(new SpecEntity());
            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Count,
                rows = searchList
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        public MvcJsonResult GetSpecValueList()
        {
            var where = new SpecValueEntity();
            where.SpecId= RequestHelper.GetInt("SpecId");
            var searchList = SpecValueService.GetInstance().GetList(where);
            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Count,
                rows = searchList
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<SpecEntity> postData)
        {
            var addResult = SpecService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<SpecEntity>()
               {
                   Success = true,
                   Result = postData.RequestEntity
               };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit( AjaxRequest<SpecEntity> postData)
        {
            var updateResult = SpecService.GetInstance().Update(postData.RequestEntity);
            
            var result = new AjaxResponse<SpecEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = SpecService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<SpecEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }
    }
}




