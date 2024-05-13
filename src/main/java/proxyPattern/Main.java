package proxyPattern;

public class Main {

    public static void main(String[] args) {

        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();

//            employeeDao.create("User", 123);
            employeeDao.create("Admin", 123);

            String name = employeeDao.getName("User", 123);
            System.out.println("Name fetched: " + name);
            name = employeeDao.getName("Admin", 123);
            System.out.println("Name fetched: " + name);

//            employeeDao.delete("User", 123);
            employeeDao.delete("Admin", 123);

        } catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
