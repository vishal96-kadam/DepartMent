package service;




import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Categories;
import entity.Department;
import repository.DepartmentRepository;

// Annotation
@Service

// Class
public class DepartmentServiceImpl
	implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Save operation
	@Override
	public String saveDepartment(Department department)
	{
		 departmentRepository.save(department);
		 return"success";
	}

	// Read operation
	@Override public List<Department> fetchDepartmentList()
	{
		return (List<Department>)
			departmentRepository.findAll();
	}

	// Update operation
	@Override
	public Department
	updateDepartment(Department department)
	{
		
		return departmentRepository.save(department);
	}

	// Delete operation
	@Override
	public void deleteDepartmentById(Long departmentId)
	{
		departmentRepository.deleteById(departmentId);
	}

	
	
	public Department fetchDepartmentListById(long id) {
		
		
		Department depDB
		= departmentRepository.findById(id)
			.get();
		return depDB;
	}

	

	
}
