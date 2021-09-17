package com.itcoke.designpattern.composite.person;

import java.util.ArrayList;
import java.util.List;

public class PersonClientTest {
    private static final long ORGANIZATION_ROOT_ID = 1;

    public static void main(String[] args) {
        // 创建总部门
        Department root = new Department(ORGANIZATION_ROOT_ID);

        // 创建子部门
        Department branch = new Department(2L);

        // 创建员工
        Employee employee1 = new Employee(21L,2000);
        Employee employee2 = new Employee(22L,4000);

        root.addSubNode(branch);
        branch.addSubNode(employee1);
        branch.addSubNode(employee2);

        double v = root.calculateSalary();
        System.out.println(v);
    }

    private void buildOrganization(Department department){
        // 根据 部门id 查询数据库 所有下属部门 id
        // List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department.getId());
        List<Long> subDepartmentIds = new ArrayList<>();

        for (Long subDepartmentId : subDepartmentIds){
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }

        // 根据部门id 查询数据库 其关联员工所有 id
        // List<Long> employeeIds = employeeRepo.getDepartmentEmployeeIds(department.getId());
        List<Long> employeeIds = new ArrayList<>();
        for (Long employeeId : employeeIds){
            // 根据 employeeId 查询数据库得到 salary
            // 假设为 1000
            double salary = 1000d;
            department.addSubNode(new Employee(employeeId,salary));
        }


    }
}
