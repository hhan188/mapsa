package Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("employeecrud")

public class EmployeeCrud {

   private EmployeeService employeeService;

   @Autowired

   public EmployeeCrud(@Qualifier("hibernate") EmployeeService employeeService) {
      this.employeeService = employeeService;
   }

   public void connect() {
      employeeService.connect();
   }
   public void create() {employeeService.create();}
   public void update() {employeeService.update();}
   public void delete() {employeeService.delete();}
   public void get() {employeeService.get();}
   public void getall() {employeeService.getall();
   }






}
