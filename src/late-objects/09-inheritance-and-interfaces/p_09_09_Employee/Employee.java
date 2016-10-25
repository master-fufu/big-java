package p_09_09_Employee;

/**
 * Make a class {@code Employee} with a name and salary. Make a class
 * {@code Manager} inherit from {@code Employee}. Add an instance variable,
 * named {@code department}, of type String. Supply a method {@code toString}
 * that prints the manager’s name, department, and salary. Make a class
 * {@code Executive} inherit from {@code Manager}. Supply appropriate
 * {@code toString} methods for all classes. Supply a test program that tests
 * these classes and methods.
 */
public class Employee
{
    private String name;
    private double salary;

    /**
     * Constructs an employee object.
     *
     * @param aName   the name
     * @param aSalary the salary
     */
    public Employee(String aName, double aSalary)
    {
        name = aName;
        salary = aSalary;
    }

    /**
     * @return string representation of the object
     */
    public String toString()
    {
        return "Employee[name=" + name + ", salary=" + salary + "]";
    }
}
