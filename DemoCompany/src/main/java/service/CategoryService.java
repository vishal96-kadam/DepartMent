// Java Program to Illustrate DepartmentService File

package service;

import java.util.List;

import entity.Categories;
import entity.Department;
// Interface
public interface CategoryService {

	// Save operation
	String saveDepartment(Categories department);

	// Read operation
	List<Categories> fetchDepartmentList();

	// Update operation
	

	// Delete operation
	void deleteDepartmentById(Long departmentId);

	Categories updateDepartment(Categories department);
}
