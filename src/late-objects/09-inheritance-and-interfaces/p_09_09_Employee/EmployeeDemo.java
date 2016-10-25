package p_09_09_Employee;

/**
 * {@code Employee} class demo.
 */
public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Harry Hacker", 135.75);
        Employee manager = new Manager("Carl Cracker", 200.50, "Cracking");
        Employee exec = new Executive("Tommy Tester", 300);

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(exec.toString());
    }
}
