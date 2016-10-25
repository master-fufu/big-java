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
public class Executive extends Manager
{
    private double bonus;

    /**
     * Constructs an executive object.
     *
     * @param aName   the name
     * @param aSalary the salary
     */
    public Executive(String aName, double aSalary)
    {
        super(aName, aSalary, "executive office");
        bonus = 100.50;
    }

    /**
     * @return string representation of the class
     */
    public String toString()
    {
        return super.toString() + "Executive[bonus=" + bonus + "]";
    }
}
