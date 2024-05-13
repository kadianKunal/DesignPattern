package proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, int employeeId) {
        System.out.println("Created a new employee with id: " + employeeId);
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Deleted employee with id: " + employeeId);
    }

    @Override
    public String getName(String client, int employeeId) {
        System.out.println("Returning name for employee id: " + employeeId);
        return "Kunal";
    }
}
