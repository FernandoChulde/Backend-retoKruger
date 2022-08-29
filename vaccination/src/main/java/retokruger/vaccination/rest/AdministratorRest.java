package retokruger.vaccination.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import retokruger.vaccination.model.Employee;
import retokruger.vaccination.service.AdministratorService;

@RestController
@RequestMapping ("/administrator")
public class AdministratorRest {

    @Autowired
    private AdministratorService administratorService;
    /**
     * GET all employee
     */
    @GetMapping
    private ResponseEntity<List<Employee>> getAllEmployee () {
        return ResponseEntity.ok(administratorService.findAllEmployees());
    }
    /**
     * POST employee
     */
    @PostMapping("/saveNewEmployee")
    public String updateNewEmployee(@RequestBody Employee employee){
        administratorService.saveNewEmployee(employee);
        return "employee created";
    }
    /**
     * UPDATE employee
     */
    @PostMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        administratorService.updateEmployee(employee);
        return "updated employee";
    }
    /**
     * DELETE employee
     */
    @DeleteMapping("/deletEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        administratorService.deleteEmployee(id);
        return "eliminated employee";
    }
    
}
