public class zad5_main {
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(15, 12);
        System.out.println("Dlugosc: " + rectangle.getLength());
        System.out.println("Szerokosc: " + rectangle.getWidth());
        System.out.println("Pole: " + rectangle.calculateArea());
        System.out.println("Obwod: " + rectangle.calculatePerimeter());
    }
}