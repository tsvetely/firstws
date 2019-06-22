package bg.bulsi.demo.firstws.service;

import bg.bulsi.demo.firstws.models.Employee;
import bg.bulsi.demo.firstws.models.Skills;
import bg.bulsi.demo.firstws.repositories.InMemoryEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private InMemoryEmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(InMemoryEmployeeRepository repository) {
        this.repository = repository;
    }

    public InMemoryEmployeeRepository getRepository() {
        return repository;
    }

    public void setRepository(InMemoryEmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.getAll();
    }

    public Employee getById(Integer id) {
        return repository.getById(id);
    }

    public List<Employee> getBySkills(Skills skills) {
        return repository.getBySkills(skills);
    }

    public Employee add(Employee employee) {
        repository.add(employee);
        return getRepository().getById(employee.getEmployeeId());
    }
}
