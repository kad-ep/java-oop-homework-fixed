public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Oval oval1 = new Oval(5, 4);
        Square square1 = new Square(6);
        Rectangle rect1 = new Rectangle(3,4);

        System.out.println("circle1 area: " + circle1.getSquare());
        System.out.println("oval1 area: " + oval1.getSquare());
        System.out.println("square1 area: " + square1.getSquare());
        System.out.println("rect1 area: " + rect1.getSquare());
    }
}