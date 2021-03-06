﻿using System;
using System.Text;
using System.Web.Mvc;
using System.Web.Mvc.Filters;
using System.Web.Security;
using Newtonsoft.Json;
using Project.Infrastructure.FrameworkCore.Logging;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Service.CustomerManager.Dto;
using Project.Service.PermissionManager.DTO;

namespace Project.WebSite.Controllers
{
    public class BaseController : Controller
    {

        public BaseController()
        {
            //CustomerDto = new CustomerDto()
            //{
            //    CustomerId = 4,
            //    CustomerName = "Test",
            //    Mobilephone = "电话"
            //};

        }

        /// <summary>
        /// 用户信息
        /// </summary>
        public CustomerDto CustomerDto { get; set; }


        protected override void OnException(ExceptionContext filterContext)
        {
            if (filterContext.ExceptionHandled)
            {
                return;
            }
            var exception = filterContext.Exception ?? new Exception("不存在进一步错误信息");

            LoggerHelper.Error(LogType.ErrorLogger, exception.Message);

            if (Request.IsAjaxRequest())
            {
                filterContext.Result = new MvcJsonResult
                {
                    Data = new AjaxResponse<object>() { Success = false, Error = new ErrorInfo(exception.ToString()) }
                };
            }
            else
            {
                var controllerName = (string)filterContext.RouteData.Values["controller"];
                var actionName = (string)filterContext.RouteData.Values["action"];
                var model = new HandleErrorInfo(exception, controllerName, actionName);
                filterContext.Result = new ViewResult
                {
                    ViewName = "~/Views/Shared/InternalServer.cshtml",
                    ViewData = new ViewDataDictionary<HandleErrorInfo>(model),
                };
            }

            filterContext.ExceptionHandled = true;

        }
    }
}