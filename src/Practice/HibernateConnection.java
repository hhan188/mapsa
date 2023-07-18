package Practice;

import org.springframework.stereotype.Component;

@Component("hibernate")
public class HibernateConnection implements EmployeeService{


    @Override
    public void connect() {
        System.out.println("hibernate");

    }

    @Override
    public void create() {
        System.out.println("hibernate create");

    }

    @Override
    public void update() {
        System.out.println("hibernate update");

    }

    @Override
    public void delete() {
        System.out.println("hibernate delete");

    }

    @Override
    public void get() {
        System.out.println("hibernate get");

    }

    @Override
    public void getall() {
        System.out.println("hibernate getall");

    }
}
