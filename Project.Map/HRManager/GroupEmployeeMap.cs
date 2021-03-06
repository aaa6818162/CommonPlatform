﻿
 /***************************************************************************
 *       功能：     HRGroupEmployee映射类
 *       作者：     Roy
 *       日期：     2016-01-16
 *       描述：     组成员管理 
 * *************************************************************************/

using Project.Infrastructure.FrameworkCore.DataNhibernate.EntityMappings;
using Project.Model.HRManager;
using Project.Model.PermissionManager;

namespace  Project.Map.HRManager
{
    public class GroupEmployeeMap : BaseMap<GroupEmployeeEntity,int>
    {
        public GroupEmployeeMap():base("HR_GroupEmployee")
        {
            this.MapPkidDefault<GroupEmployeeEntity,int>();
 
            Map(p => p.GroupCode);    
            Map(p => p.EmployeeCode);    
            Map(p => p.CreatorUserCode);    
            Map(p => p.CreatorUserName);    
            Map(p => p.CreateTime);    
        }
    }
}

    
 

