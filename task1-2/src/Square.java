public class Square extends Rectangular{

    double length;
    @Override
    public double getSquare() {
        return length*length;
    }

    public Square(double length) {
        this.length = length;
    }
}
