package SoheylSayyah.Practice26;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        EmployeeCRUD employee = (EmployeeCRUD) context.getBean("EmployeeCRUD");
        employee.connect();
        employee.create();
        employee.delete();
        employee.update();
        employee.getById();
        employee.getAll();
        context.close();
    }
}
