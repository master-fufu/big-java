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
public class Manager extends Employee
{
    private String department;

    /**
     * Constructs a manager object.
     *
     * @param aName       the name
     * @param aSalary     the salary
     * @param aDepartment the department
     */
    public Manager(String aName, double aSalary, String aDepartment)
    {
        super(aName, aSalary);
        department = aDepartment;
    }

    /**
     * @return string representation of the object
     */
    public String toString()
    {
        return super.toString() + "Manager[department=" + department + "]";
    }
}
