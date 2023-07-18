package SoheylSayyah.Practice26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("EmployeeCRUD")
public class EmployeeCRUD extends Employee
{
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeCRUD(@Qualifier("Hibernate") EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    public void connect() {
        employeeService.connect();
    }
    public void create() {
        employeeService.create();
    }
    public void update() {
        employeeService.update();
    }
    public void delete() {
        employeeService.delete();
    }
    public void getById() {
        employeeService.getById();
    }
    public void getAll() {
        employeeService.getAll();
    }
}
