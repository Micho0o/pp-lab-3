public class Circle 
{
    private Point punkt;
    private double radius;

    public Circle(Point center, double radius) 
    {
        this.punkt = center;
        this.radius = radius;
    }

    public Point getCenter() 
    {
        return punkt;
    }

    public double getRadius() 
    {
        return radius;
    }

    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}