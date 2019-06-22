package bg.bulsi.demo.firstws.repositories;

import bg.bulsi.demo.firstws.models.Employee;
import bg.bulsi.demo.firstws.models.Skills;

import java.util.List;

public interface EmployeeRepository {
    void add(Employee employee);
    List<Employee> getAll();
    Employee getById(Integer id);
    List<Employee> getBySkills(Skills skills);
}
