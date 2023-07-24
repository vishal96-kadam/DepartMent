package service;




import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Categories;
import entity.Department;
import repository.CategoryRepository;
import repository.DepartmentRepository;

// Annotation
@Service

// Class
public class CategoryServiceImpl
	implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	// Save operation
	@Override
	public String saveDepartment(Categories department)
	{
		categoryRepository.save(department);
		 return"success";
	}

	// Read operation
	@Override public List<Categories> fetchDepartmentList()
	{
		return (List<Categories>)
				categoryRepository.findAll();
	}

	// Update operation
	@Override
	public Categories
	updateDepartment(Categories department)
	{
		
		return categoryRepository.save(department);
	}

	// Delete operation
	@Override
	public void deleteDepartmentById(Long departmentId)
	{
		categoryRepository.deleteById(departmentId);
	}

	
	
	public Categories fetchDepartmentListById(long id) {
		
	
		Categories depDB
		= categoryRepository.findById(id)
			.get();
		return depDB;
	}

	

	
}
