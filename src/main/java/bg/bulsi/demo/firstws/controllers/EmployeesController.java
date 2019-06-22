package bg.bulsi.demo.firstws.controllers;

import bg.bulsi.demo.firstws.models.Employee;
import bg.bulsi.demo.firstws.models.Skills;
import bg.bulsi.demo.firstws.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeesController implements Serializable {

    private EmployeeServiceImpl service;

    @Autowired
    public EmployeesController(EmployeeServiceImpl service) {
        this.service = service;
    }

    @PatchMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.add(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAll();
    }

    @GetMapping("/{id}")
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/{skill}")
//    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getEmployeeBySkills(@PathVariable Skills skills) {
        return service.getBySkills(skills);
    }
}
