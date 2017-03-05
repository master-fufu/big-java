package p_13_10_polygonArea;

import java.awt.geom.Point2D;

/**
 * Using recursion, compute the area of a polygon. Cut off a triangle and use
 * the fact that a triangle with corners (x1, y1), (x2, y2), (x3, y3) has area
 * (|x1y2 + x2y3 + x3y1 − y1x2 − y2x3 − y3x1|) / 2.
 */
public class PolygonTester
{
    public static void main(String[] args)
    {
        // square
        Polygon p = new Polygon();
        p.add(new Point2D.Double(10, 20));
        p.add(new Point2D.Double(20, 20));
        p.add(new Point2D.Double(20, 10));
        p.add(new Point2D.Double(10, 10));

        System.out.println("Area: " + p.getArea());
        System.out.println("Expected: 100");

        // regular hexagon with radius 1
        p = new Polygon();
        for (int i = 0; i < 6; i++)
        {
            p.add(new Point2D.Double(Math.sin(i * Math.PI / 3), Math.cos(i * Math.PI / 3)));
        }
        System.out.println("Area: " + p.getArea());
        System.out.println("Expected: " + 3 * Math.sqrt(3) / 2);

    }
}
