package p_03_31_calculate_hourly_salary;

import java.util.Scanner;

/**
 * Write a program that reads in the name and salary of an employee. Here the salary will
 * denote an hourly wage, such as $9.25. Then ask how many hours the employee worked in
 * the past week. Be sure to accept fractional hours. Compute the pay. Any overtime work
 * (over 40 hours per week) is paid at 150 percent of the regular wage. Print a paycheck
 * for the employee.
 */
public class CalculateHourlySalary
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = in.next();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = in.nextDouble();

        System.out.print("Number of hours worked last week: ");
        double hours = in.nextDouble();

        // Calculate salary
        double salary = 0;
        if (hours <= 40)
        {
            salary = hours * hourlyWage;
        }
        else if (hours > 40)
        {
            salary = (40 * hourlyWage) + ((hours - 40) * hourlyWage * 1.5);
        }
        System.out.print("------------------------------------------\n");
        System.out.printf("%1s %-20s %1s %-6s %1s %-6s %1s %n", "|",
                "Name", "|", "Wage", "|", "Hours", "|");
        System.out.printf("%1s %-20s %1s %-6s %1s %-6s %1s %n", "|",
                "--------------------", "|", "------", "|", "------", "|");
        System.out.printf("%1s %-20s %1s %-6s %1s %-6s %1s %n", "|",
                employeeName, "|", hourlyWage, "|", hours, "|");
        System.out.print("| -------------------------------------- |\n");
        System.out.printf("%1s Total salary: %-10s %15s %n", "|", salary, "|");
        System.out.print("------------------------------------------\n");
    }
}
