package bg.bulsi.demo.firstws.service;

import bg.bulsi.demo.firstws.models.Employee;
import bg.bulsi.demo.firstws.models.Skills;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee add(Employee employee);

    List<Employee> getAll();

    Employee getById(Integer id);

    List<Employee> getBySkills(Skills skills);
}
