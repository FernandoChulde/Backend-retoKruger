package retokruger.vaccination.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import retokruger.vaccination.model.Employee;
import retokruger.vaccination.service.EmployeeService;

@RestController
@RequestMapping ("/employee")
public class EmployeeRest {

    @Autowired
    private EmployeeService employeeService;
    /**
     * GET all employee
     */
    @GetMapping
    private ResponseEntity<List<Employee>> getAllEmployee () {
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }
    /**
     * UPDATE employee
     */
    @PostMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return "updated employee";
    }
}
