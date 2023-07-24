// Java Program to Illustrate DepartmentController File

package controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Categories;
import entity.Department;
import service.CategoryServiceImpl;
import service.DepartmentService;
import service.DepartmentServiceImpl;

@RestController

public class CategoryController {

	// Annotation
	
	@Autowired
	CategoryServiceImpl CategoryServiceImpl;
	
	@GetMapping("/api/categories")
	public String getCategories() {
		
		String jsonStr = JSONArray.toJSONString(CategoryServiceImpl.fetchDepartmentList());
		return jsonStr;
	}
	
	@RequestMapping("api/categories" )
	public JSONObject createDepartment(Categories  department)
	{
		
		
		
		JSONObject obj=new JSONObject();

	//      String jsonStr = JSONArray.toJSONString(list);

	      obj.put("flag", CategoryServiceImpl.saveDepartment(department));
	
	      return obj;
		
	}

	@RequestMapping("api/categories" )
	public JSONObject GetByCatId(@RequestParam int catId
		 )
	{
		JSONObject obj=new JSONObject(); 
		obj.put("Department", CategoryServiceImpl.fetchDepartmentListById(catId));
		return obj;
	}

	@PutMapping("api/categories" )
	public Categories updateByCatId(@RequestParam Categories categories
		 )
	{
		return CategoryServiceImpl.updateDepartment(categories);
	}
	
	@DeleteMapping("api/categories" )
	public JSONObject DeleteByCatId(@RequestParam long catId
		 )
	{
		JSONObject obj=new JSONObject();
	
		CategoryServiceImpl.deleteDepartmentById(catId);
		obj.put("flag", "deleted");
		return  obj;
	}
	
}
