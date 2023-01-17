
public class Vector {

    public double x;
    public double y;
    public double z;

    public Vector(double x, double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length3D(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double scalarMultiplication(double x1, double y1, double z1, double x2, double y2, double z2){
        return (x1*x2 + y1*y2 + z1*z2);
    }

    public static double scalarMultiplication(){
        Vector[] arr1 = Vector.randVectors();

        return (arr1[0].x * arr1[1].x + arr1[0].y*arr1[1].y + arr1[0].z*arr1[1].z);
    }


    public static Vector[] randVectors() {
        Vector[] arr = new Vector[2];

        for (int i = 0; i < 2; i++) {
            Vector v1 = new Vector(Math.random(), Math.random(), Math.random());
            arr[i] = v1;

        }
        return arr;

    }

}
