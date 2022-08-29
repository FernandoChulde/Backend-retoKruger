package retokruger.vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import retokruger.vaccination.model.Employee;
import retokruger.vaccination.repository.EmployeeRepository;

@Service
public class AdministratorService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * method to list all employees
     */
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * method to save a new employee
     */
    public void saveNewEmployee(Employee modelEmployee) {

        modelEmployee.setEmp_identification(modelEmployee.getEmp_identification());
        modelEmployee.setEmp_name(modelEmployee.getEmp_name());
        modelEmployee.setEmp_lastname(modelEmployee.getEmp_lastname());
        modelEmployee.setEmp_mail(modelEmployee.getEmp_mail());
        modelEmployee.setEmp_user(modelEmployee.getEmp_user());
        modelEmployee.setEmp_password(modelEmployee.getEmp_password());
        
        employeeRepository.save(modelEmployee);

    }

    /**
     * method to update an employee
     */
    public void updateEmployee(Employee modelEmployee) {

        if (modelEmployee.getEmp_id() + "" != null) {
            Employee employee = new Employee();
            employee.setEmp_id(modelEmployee.getEmp_id());
            employee.setEmp_identification(modelEmployee.getEmp_identification());
            employee.setEmp_name(modelEmployee.getEmp_name());
            employee.setEmp_lastname(modelEmployee.getEmp_lastname());
            employee.setEmp_address(modelEmployee.getEmp_address());
            employee.setEmp_cellphone(modelEmployee.getEmp_cellphone());
            employee.setEmp_datebirth(modelEmployee.getEmp_datebirth());
            employee.setEmp_mail(modelEmployee.getEmp_mail());
            employee.setEmp_vaccinedate(modelEmployee.getEmp_vaccinedate());
            employee.setEmp_vaccinedose(modelEmployee.getEmp_vaccinedose());
            employee.setEmp_vaccinename(modelEmployee.getEmp_vaccinename());
            employee.setEmp_vaccinestatus(modelEmployee.getEmp_vaccinestatus());
            employee.setEmp_user(modelEmployee.getEmp_user());
            employee.setEmp_password(modelEmployee.getEmp_password());

            employeeRepository.save(employee);
        }
    }
    /**
     * method to delete an employee
     */
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    } 

}
