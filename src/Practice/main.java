package Practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content=new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeCrud employeeCrud= (EmployeeCrud) content.getBean("employeecrud");
        employeeCrud.update();
        employeeCrud.get();
        employeeCrud.getall();
        content.close();


    }
}
