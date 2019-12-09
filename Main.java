public class Main {
    public static void main(String []args){

      /*  R3Vector a =new R3Vector(3,2,1);
        R3Vector b =new R3Vector(1,1,1);
        R3Vector c =new R3Vector(3,1,1);

        System.out.println("Сложение:" );
        R3Vector.show(R3Vector.plus(a,b));
        System.out.println("Вычитание:");
        R3Vector.show(R3Vector.minus(a,b));
        System.out.println("Умножение на число");
        R3Vector.show(R3Vector.mult(a,2));
        System.out.println("Скалярное произведение:"+R3Vector.scale(a,b));
        System.out.println("Векторное произведение:");
        R3Vector.show(R3Vector.vector(a,b));
        R3Vector.show(R3Vector.translate (a, 4));*/
        R3Vector v1=new R3Vector(0,0,0);
        R3Vector v2=new R3Vector(1,0,0);
        R3Vector v3=new R3Vector(1,1,0);
        R3Vector v4=new R3Vector(0,1,0);
        Focet n=new Focet(v1,v2,v3,v4);
        n.print(n);
        n.rotate(0,0,90);
        n.print(n);
        Cube g=new Cube();
        g.rotate(0,0,90);
    }
}