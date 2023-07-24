// Java Program to Illustrate DepartmentService File

package service;

import java.util.List;

import entity.Categories;
import entity.Department;
// Interface
public interface DepartmentService {

	// Save operation
	String saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	

	// Delete operation
	void deleteDepartmentById(Long departmentId);

	Department updateDepartment(Department department);
}
