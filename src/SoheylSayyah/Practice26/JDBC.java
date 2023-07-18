package SoheylSayyah.Practice26;

import org.springframework.stereotype.Component;

@Component("JDBC")
public class JDBC implements EmployeeService
{
    @Override
    public void connect()
    {
        System.out.println("Connecting Via JDBC ...");
    }

    @Override
    public void create()
    {
        System.out.println("Create Via JDBC ...");
    }

    @Override
    public void update()
    {
        System.out.println("Update Via JDBC ...");
    }

    @Override
    public void delete()
    {
        System.out.println("Delete Via JDBC ...");
    }

    @Override
    public void getById()
    {
        System.out.println("Get Via JDBC ...");
    }

    @Override
    public void getAll()
    {
        System.out.println("Get All Via JDBC ...");
    }
}
