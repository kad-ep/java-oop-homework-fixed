public class Circle extends Round{

    double radius;

    @Override
    public double getSquare() {
        return pi*radius*radius;
    }


    public Circle(double radius) {
        this.radius = radius;
    }
}
