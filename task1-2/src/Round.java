abstract class  Round implements Shape {
    double radius1;
    double radius2;
    static final double pi = 3.14159;
    public double getSquare(){
        return pi*radius1*radius2;
    }
}
