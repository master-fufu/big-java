package p_13_10_polygonArea;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Using recursion, compute the area of a polygon. Cut off a triangle and use
 * the fact that a triangle with corners (x1, y1), (x2, y2), (x3, y3) has area
 * (|x1y2 + x2y3 + x3y1 − y1x2 − y2x3 − y3x1|) / 2.
 */
public class Polygon
{
    private ArrayList<Point2D.Double> corners;

    /**
     * Constructs a Polygon object with no corners.
     */
    public Polygon()
    {
        corners = new ArrayList<>();
    }

    /**
     * Adds a point to the list.
     *
     * @param p the point to add
     */
    public void add(Point2D.Double p)
    {
        corners.add(p);
    }

    /**
     * Computes the area of a polygon.
     *
     * @return area of a polygon
     */
    public double getArea()
    {
        double area = Math.abs(corners.get(0).getX() * corners.get(1).getY()
                + corners.get(1).getX() * corners.get(2).getY()
                + corners.get(2).getX() * corners.get(0).getY()
                - corners.get(0).getY() * corners.get(1).getX()
                - corners.get(1).getY() * corners.get(2).getX()
                - corners.get(2).getY() * corners.get(0).getX()) / 2;

        if (corners.size() == 3)
        {
            return 0;
        }
        else
        {
            area += area;

            corners.remove(0);

            return area + getArea();
        }
    }
}
