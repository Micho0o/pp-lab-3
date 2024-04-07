public class zad3_main 
{
    public static void main(String[] args) 
    {
        ColoredCircle coloredCircle = new ColoredCircle(new Point(4, 3), 10, "niebieski");
        System.out.println("Srodek x " + coloredCircle.getCenter().getX() + ", y " + coloredCircle.getCenter().getY());
        System.out.println("Promień " + coloredCircle.getRadius());
        System.out.println("Kolor " + coloredCircle.getColor());
        System.out.println("Obwód " + coloredCircle.calculatePerimeter());
        System.out.println("Pole " + coloredCircle.getArea());
    }
}