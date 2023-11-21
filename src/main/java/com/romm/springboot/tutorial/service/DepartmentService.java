package com.romm.springboot.tutorial.service;

import com.romm.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
