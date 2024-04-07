public class zad2_main 
{
    public static void main(String[] args) 
    {
        Point punkt = new Point(1, 4);
        Circle circle = new Circle(punkt, 7);
        System.out.println("srodek: " + circle.getCenter().getX() + ", " + circle.getCenter().getY());
        System.out.println("promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
        System.out.println("Pole: " + circle.getArea());
    }
}