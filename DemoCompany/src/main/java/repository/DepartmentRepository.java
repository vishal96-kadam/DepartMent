// Java Program to Illustrate DepartmentRepository File

package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Categories;
import entity.Department;

// Annotation
@Repository

// Interface
public interface DepartmentRepository
	extends JpaRepository<Department, Long> {
}
