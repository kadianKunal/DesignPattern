package proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy() {
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, int employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")){
            this.employeeDaoImpl.create(client, employeeId);
            return;
        }
        throw new Exception("Access Denied for creating new employee");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")){
            this.employeeDaoImpl.delete(client, employeeId);
        } else {
            throw new Exception("Access Denied for deleting employee");
        }
    }

    @Override
    public String getName(String client, int employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
            return this.employeeDaoImpl.getName(client, employeeId);
        } else {
            throw new Exception("Access denied for getting Name of employee");
        }
    }
}
