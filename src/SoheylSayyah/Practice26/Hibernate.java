package SoheylSayyah.Practice26;

import org.springframework.stereotype.Component;

@Component("Hibernate")

public class Hibernate implements EmployeeService
{
    @Override
    public void connect()
    {
        System.out.println("Connecting Via Hibernate ...");
    }

    @Override
    public void create()
    {
        System.out.println("Create By Hibernate ...");
    }

    @Override
    public void update()
    {
        System.out.println("Update By Hibernate ...");
    }

    @Override
    public void delete()
    {
        System.out.println("Delete By Hibernate ...");    }

    @Override
    public void getById()
    {
        System.out.println("Get By Hibernate ...");
    }

    @Override
    public void getAll()
    {
        System.out.println("Get All By Hibernate ...");
    }
}
