package bg.bulsi.demo.firstws.repositories;

import bg.bulsi.demo.firstws.models.Employee;
import bg.bulsi.demo.firstws.models.Skills;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepository {
    private Employee employee = new Employee();
    private List<Employee> employees = new ArrayList<>();
    @PostConstruct
    public void EmployeeRepository() {

//        employees.add(new Employee(1, "Pesho", "Ivanov", "Manager", new ArrayList<>(Arrays.asList("Flexibility", "Teamwork"))));
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setFirstName("Pesho");
        employee.setLastName("Ivanov");
        employee.setPosition("Manager");
        employee.setSkills(new ArrayList<>(Arrays.asList(Skills.COMMITMENT, Skills.FLEXIBILITY)));
        employees.add(employee);

        employee = new Employee();
        employee.setEmployeeId(2);
        employee.setFirstName("Maria");
        employee.setLastName("Georgieva");
        employee.setPosition("Manager");
        employee.setSkills(new ArrayList<>(Arrays.asList(Skills.TECHNICAL_KNOWLEDGE, Skills.ORGANIZE)));
        employees.add(employee);

        employee = new Employee();
        employee.setEmployeeId(3);
        employee.setFirstName("Ivan");
        employee.setLastName("Pashov");
        employee.setPosition("Manager");
        employee.setSkills(new ArrayList<>(Arrays.asList(Skills.TECHNICAL_KNOWLEDGE, Skills.FLEXIBILITY)));
        employees.add(employee);

        employee = new Employee();
        employee.setEmployeeId(4);
        employee.setFirstName("Stoqn");
        employee.setLastName("Petkov");
        employee.setPosition("Manager");
        employee.setSkills(new ArrayList<>(Arrays.asList(Skills.TEAMWORK, Skills.LEADERSHIP)));
        employees.add(employee);

        employee = new Employee();
        employee.setEmployeeId(5);
        employee.setFirstName("Stamat");
        employee.setLastName("Stamatov");
        employee.setPosition("Manager");
        employee.setSkills(new ArrayList<>(Arrays.asList(Skills.TEAMWORK, Skills.ORGANIZE)));
        employees.add(employee);
    }

    public List<Employee> getAll() {
        return employees;
    }

    public void add(Employee employee) {
        employee.setEmployeeId((employees.size() + 1));
        employees.add(employee);
    }

    public Employee getById(Integer id) {
        Employee employee = new Employee();
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(id)) {
                employee = e;
            }
        }
        return employee;
    }

    public List<Employee> getBySkills(Skills skill) {
        List<Employee> employeeList = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getSkills().contains(skill)) {

                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}
