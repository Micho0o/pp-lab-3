public class zad6_main {
    public static void main(String[] args) 
    {
        Square square = new Square(14);
        System.out.println("Długość " + square.getLength());
        System.out.println("Pole" + square.calculateArea());
        System.out.println("Obwód" + square.calculatePerimeter());
    }
}