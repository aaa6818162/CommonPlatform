﻿var pro = pro || {};
(function () {
    pro.PageContentCategory = pro.PageContentCategory || {};
    pro.PageContentCategory.HdPage = pro.PageContentCategory.HdPage || {};
    pro.PageContentCategory.HdPage = {
        initPage: function () {

            pro.PageContentCategoryControl.init({ controlId: "ParentId", required: true });

            $("#btnAdd").click(function () {
                pro.PageContentCategory.HdPage.submit("Add");
            });

            $("#btnEdit").click(function () {
                pro.PageContentCategory.HdPage.submit("Edit");
            });

            $("#btnClose").click(function () {
                parent.pro.PageContentCategory.ListPage.closeTab("");
            });

            if ($("#BindEntity").val()) {
                var bindField = pro.bindKit.getHeadJson();
                var bindEntity = JSON.parse($("#BindEntity").val());
                for (var filedname in bindField) {
                    $("[name=" + filedname + "]").val(bindEntity[filedname]);
                }
                //行项目信息用json绑定控件
                //alert(JSON.stringify(BindEntity.List));
            }

            var parentId = pro.commonKit.getUrlParam("ParentId");
            if (parentId > 0) {
                $("input[name=ParentId]").val(parentId);
            }

        },
        submit: function (command) {
            var postData = {};
            postData.RequestEntity = pro.submitKit.getHeadJson();

            if (pro.commonKit.getUrlParam("PkId") != "") {
                postData.RequestEntity.PkId = pro.commonKit.getUrlParam("PkId");
            }

            this.submitExtend.addRule();
            if (!$("#form1").valid() || !this.submitExtend.logicValidate()) {
                $.alertExtend.error();
                return false;
            }

            abp.ajax({
                url: "/ContentManager/PageContentCategory/" + command,
                data: JSON.stringify(postData)
            }).done(
                function (dataresult, data) {
                    function afterSuccess() {
                        parent.$("#btnSearch").trigger("click");
                        parent.pro.PageContentCategory.ListPage.closeTab();
                    }
                    parent.$.alertExtend.info("", afterSuccess());
                }
            ).fail(
             function (errordetails, errormessage) {
                 //  $.alertExtend.error();
             }
            );

        },
        submitExtend: {
            addRule: function () {
                $("#form1").validate({
                    rules: {
                        ParentId: { required: true },
                        PageContentCategoryName: { required: true }
                      
                    },
                    messages: {
                        PkId: "必填!",
                        PageContentCategoryName: "必填!",
                        ParentId: "必填!",
                        Rank: "层级必填!",
                        Sort: "必填!",
                        Route: "路径必填!",
                        CreatorUserCode: "创建人必填!",
                        CreationTime: "创建时间必填!",
                        LastModifierUserCode: "修改人必填!",
                        LastModificationTime: "修改时间必填!",
                        IsDeleted: "是否删除必填!",
                        DeleterUserCode: "删除人必填!",
                        DeletionTime: "删除时间必填!",
                    },
                    errorPlacement: function (error, element) {
                        pro.commonKit.errorPlacementHd(error, element);
                    },
                    debug: false
                });
            },
            logicValidate: function () {
                return true;
            }
        },

        addTab: function (subtitle, url) {

        }

    };
})();



$(function () {
    pro.PageContentCategory.HdPage.initPage();
});


