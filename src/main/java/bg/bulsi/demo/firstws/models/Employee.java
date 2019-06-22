package bg.bulsi.demo.firstws.models;


import javax.annotation.ManagedBean;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "employees")
@ManagedBean
public class Employee {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "employee_id")
    private Integer employeeId;
    //    @Column(name = "first_name")
    private String firstName;
    //    @Column(name = "last_name")
    private String lastName;
    //    @Column(name = "position")
    private String position;
    public List<Skills> skills;

    public Employee() {
    }

    public Employee(Integer employeeId, String firstName, String lastName, String position, List<Skills> skills) {
        setEmployeeId(employeeId);
        setFirstName(firstName);
        setLastName(lastName);
        setPosition(position);
        setSkills(skills);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }
}
