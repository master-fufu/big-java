package bigJava_03_Decisions;

import java.util.Scanner;

/**
 * Write a unit conversion program that asks the users from which unit they
 * want to convert (fl, oz, gal, oz, lb, in, ft, mi) and to which unit they
 * want to convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible
 * conversions (such as gal to km). Ask for the value to be converted, then
 * display the result.
 */
public class UnitConversion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Volume constants
        final double OZ_L = 0.0295735;
        final double GAL_L = 3.78541;

        // Mass constants
        final double OZ_KG = 0.0283495;
        final double LB_KG = 0.453592;

        // Length constants
        final double IN_M = 0.0254;
        final double FT_M = 0.3048;
        final double MI_M = 1609.34;

        System.out.print("Convert from? (fl.oz, gal, oz, lb, in, ft, mi) ");
        String from = in.next().toLowerCase();
        System.out.print("Convert to? (ml, l, g, kg, mm, cm, m, km) ");
        String to = in.next().toLowerCase();
        System.out.print("Value? ");
        double value = in.nextDouble();

        // Reject incompatible conversions
        boolean volume = (from.equals("fl.oz") || from.equals("gal"))
                && (to.equals("ml") || to.equals("l"));
        boolean mass = (from.equals("oz") || from.equals("lb"))
                && (to.equals("g") || to.equals("kg"));
        boolean length = (from.equals("in") || from.equals("ft") || from.equals("mi"))
                && (to.equals("mm") || to.equals("cm") || to.equals("m") || to.equals("km"));

        // Volume conversions
        boolean floz_to_ml = from.equals("fl.oz") && to.equals("ml");
        boolean floz_to_l = from.equals("fl.oz") && to.equals("l");
        boolean gal_to_ml = from.equals("gal") && to.equals("ml");
        boolean gal_to_l = from.equals("gal") && to.equals("l");

        // Mass conversions
        boolean oz_to_g = from.equals("oz") && to.equals("g");
        boolean oz_to_kg = from.equals("oz") && to.equals("kg");
        boolean lb_to_g = from.equals("lb") && to.equals("g");
        boolean lb_to_kg = from.equals("lb") && to.equals("kg");

        // Length conversions
        boolean in_to_mm = from.equals("in") && to.equals("mm");
        boolean in_to_cm = from.equals("in") && to.equals("cm");
        boolean in_to_m = from.equals("in") && to.equals("m");
        boolean in_to_km = from.equals("in") && to.equals("km");
        boolean ft_to_mm = from.equals("ft") && to.equals("mm");
        boolean ft_to_cm = from.equals("ft") && to.equals("cm");
        boolean ft_to_m = from.equals("ft") && to.equals("m");
        boolean ft_to_km = from.equals("ft") && to.equals("km");
        boolean mi_to_mm = from.equals("mi") && to.equals("mm");
        boolean mi_to_cm = from.equals("mi") && to.equals("cm");
        boolean mi_to_m = from.equals("mi") && to.equals("m");
        boolean mi_to_km = from.equals("mi") && to.equals("km");

        // Declare conversion result
        double result = 0;

        if (volume)
        {
            if (floz_to_ml)
            {
                result = value * OZ_L * 1000;
            }
            else if (floz_to_l)
            {
                result = value * OZ_L;
            }
            else if (gal_to_ml)
            {
                result = value * GAL_L * 1000;
            }
            else if (gal_to_l)
            {
                result = value * GAL_L;
            }
            System.out.printf("%nVolume conversion:%n%.2f %s = %.4f %s%n",
                    value, from, result, to);
        }
        else if (mass)
        {
            if (oz_to_g)
            {
                result = value * OZ_KG * 1000;
            }
            else if (oz_to_kg)
            {
                result = value * OZ_KG;
            }
            else if (lb_to_g)
            {
                result = value * LB_KG * 1000;
            }
            else if (lb_to_kg)
            {
                result = value * LB_KG;
            }
            System.out.printf("%nMass conversion:%n%.2f %s = %.4f %s%n",
                    value, from, result, to);
        }
        else if (length)
        {
            if (in_to_mm)
            {
                result = value * IN_M * 1000;
            }
            else if (in_to_cm)
            {
                result = value * IN_M * 100;
            }
            else if (in_to_m)
            {
                result = value * IN_M;
            }
            else if (in_to_km)
            {
                result = value * IN_M / 1000;
            }
            else if (ft_to_mm)
            {
                result = value * FT_M * 1000;
            }
            else if (ft_to_cm)
            {
                result = value * FT_M * 100;
            }
            else if (ft_to_m)
            {
                result = value * FT_M;
            }
            else if (ft_to_km)
            {
                result = value * FT_M / 1000;
            }
            else if (mi_to_mm)
            {
                result = value * MI_M * 1000;
            }
            else if (mi_to_cm)
            {
                result = value * MI_M * 100;
            }
            else if (mi_to_m)
            {
                result = value * MI_M;
            }
            else if (mi_to_km)
            {
                result = value * MI_M / 1000;
            }
            System.out.printf("%nLength conversion:%n%.2f %s = %.6f %s%n",
                    value, from, result, to);
        }
        else
        {
            System.out.println("Cannot convert from " + from + " to " + to + "." +
                    " Please try again.");
        }
    }
}
