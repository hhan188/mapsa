package Practice;

import org.springframework.stereotype.Component;

@Component("jdbc")
public class JDBConnection  implements EmployeeService{
    @Override
    public void connect() {
        System.out.println("jdbc");
    }

    @Override
    public void create() {
        System.out.println("jdbc create");

    }

    @Override
    public void update() {
        System.out.println("jdbc update");

    }

    @Override
    public void delete() {
        System.out.println("jdbc delete");

    }

    @Override
    public void get() {
        System.out.println("jdbc get");

    }

    @Override
    public void getall() {
        System.out.println("jdbc getall");

    }
}
