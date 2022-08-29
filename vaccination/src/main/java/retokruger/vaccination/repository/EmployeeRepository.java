package retokruger.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import retokruger.vaccination.model.Employee;

/**
 * employeeRepository
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
