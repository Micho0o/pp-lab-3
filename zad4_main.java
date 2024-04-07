public class zad4_main {
    public static void main(String[] args)
    {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(4, 4), 10);
        circles[1] = new ColoredCircle(new Point(6, 6), 8, "brazowy");
        circles[2] = new ColoredCircle(new Point(7, 7), 6, "bialy");
        
        for (Circle circle : circles)
        {
            double area = circle.getArea();
            System.out.println("Pole " + area);

            if (circle instanceof ColoredCircle)
            {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Kolor  " + color);
            }
        }
    }
}