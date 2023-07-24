// Java Program to Illustrate DepartmentController File

package controller;
import java.util.*;
import org.json.simple.*;
import java.util.List;
// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Categories;
import entity.Department;
import service.DepartmentService;
import service.DepartmentServiceImpl;

@RestController

public class DepartmentController {

	// Annotation
	@Autowired private 
	DepartmentService departmentService;
	
	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	
	@GetMapping("/api/categories")
	public String getCategories() {
		
		String jsonStr = JSONArray.toJSONString(departmentServiceImpl.fetchDepartmentList());
		return jsonStr;
	}
	
	@RequestMapping("api/categories" )
	public JSONObject createDepartment(Department  department)
	{
		
		
		
		JSONObject obj=new JSONObject();

	//      String jsonStr = JSONArray.toJSONString(list);

	      obj.put("flag", departmentServiceImpl.saveDepartment(department));
	
	      return obj;
		
	}

	@RequestMapping("api/categories" )
	public JSONObject GetByCatId(@RequestParam int catId
		 )
	{
		JSONObject obj=new JSONObject(); 
		obj.put("Department", departmentServiceImpl.fetchDepartmentListById(catId));
		return obj;
	}

	@PutMapping("api/categories" )
	public Department updateByCatId(@RequestParam Department department
		 )
	{
		return departmentServiceImpl.updateDepartment(department);
	}
	
	@DeleteMapping("api/categories" )
	public JSONObject DeleteByCatId(@RequestParam long catId
		 )
	{
		JSONObject obj=new JSONObject();
	
		 departmentServiceImpl.deleteDepartmentById(catId);
		obj.put("flag", "deleted");
		return  obj;
	}
	
}
