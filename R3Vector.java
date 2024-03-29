import java.util.Scanner;


public class R3Vector {
        Scanner in = new Scanner(System.in);
        private double x;
        private double y;
        private double z;

        public R3Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public static void show(R3Vector a) {
            System.out.println(a.x);
            System.out.println(a.y);
            System.out.println(a.z);
        }

        public static R3Vector plus(R3Vector a, R3Vector b) {
            return new R3Vector(a.x + b.x , a.y + b.y , a.z + b.z );

        }

        public static R3Vector minus(R3Vector a, R3Vector b) {

            return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
        }
        public static R3Vector mult(R3Vector a, double k) {

            return new R3Vector(k*a.x,k*a.y,k*a.z );
        }
        public static double scale(R3Vector a,R3Vector b) {
            return a.x*b.x+a.y*b.y+a.z*b.y;
        }
        public static R3Vector translate (R3Vector a,double k){
            return new R3Vector(k*a.x, k*a.y,k*a.z);
        }
        public static R3Vector vector(R3Vector a, R3Vector b) {
            return new R3Vector(a.y*b.z-b.y*a.z,a.x*b.z-b.x*a.z,a.x*b.y-b.x*a.y);
        }
        public void rotateOY(double angle){
            double fakeX =x;
            x = x*Math.cos(Math.toRadians(angle)+z*Math.sin(Math.toRadians(angle)));
            z=-(fakeX*Math.sin(Math.toRadians(angle)+z*Math.cos(Math.toRadians(angle))));
    }
        public void rotateOX(double angle){
             double fakeY =y;
            y = y*Math.cos(Math.toRadians(angle)+z*Math.sin(Math.toRadians(angle)));
            z=-(fakeY*Math.sin(Math.toRadians(angle))+z*Math.cos(Math.toRadians(angle)));
    }
        public void rotateOZ(double angle){
             double fakeX =x;
            x = x*Math.cos(Math.toRadians(angle)+y*Math.sin(Math.toRadians(angle)));
            y=-(fakeX*Math.sin(Math.toRadians(angle))+y*Math.cos(Math.toRadians(angle)));
    }
    public void rotate(double x,double y,double z){
            rotateOX(x);
            rotateOY(y);
            rotateOZ(z);

    }

}
        //public static double  smech(R3Vector a,R3Vector b,R3Vector c) {
         //   return a.x*b.y*c.z+a.y*b.z*c.x+b.x*c.y*a.z-c.x*b.y*a.z-b.x*a.y*c.z-c.y*b.z*a.x;
       // }

