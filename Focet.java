public class Focet {

private R3Vector[] vertex;
//Color color;
    public Focet(R3Vector v1,R3Vector v2,R3Vector v3,R3Vector v4){
        vertex= new R3Vector[]{v1,v2,v3,v4};
    }
    public void  print(Focet v){
        System.out.println("начало - X "+v.vertex[0].getX()+"Y "+v.vertex[0].getY()+"Z "+v.vertex[0].getZ()+", конец - X " + v.vertex[1].getX() + "Y " + v.vertex[1].getY() + "Z " + v.vertex[1].getZ());
        System.out.println("начало - X "+v.vertex[1].getX()+"Y "+v.vertex[1].getY()+"Z "+v.vertex[1].getZ()+", конец - X " + v.vertex[2].getX() + "Y " + v.vertex[2].getY() + "Z " + v.vertex[2].getZ());
        System.out.println("начало - X "+v.vertex[2].getX()+"Y "+v.vertex[2].getY()+"Z "+v.vertex[2].getZ()+", конец - X " + v.vertex[3].getX() + "Y " + v.vertex[3].getY() + "Z " + v.vertex[3].getZ());
        System.out.println("начало - X "+v.vertex[3].getX()+"Y "+v.vertex[3].getY()+"Z "+v.vertex[3].getZ()+", конец - X " + v.vertex[0].getX() + "Y " + v.vertex[0].getY() + "Z " + v.vertex[0].getZ());
    }
    public void rotate(double x,double y,double z){
        rotateOX(x);
        rotateOY(y);
        rotateOZ(z);

    }
    public void rotateOX(double angle){
        vertex[0].rotateOX(angle);
        vertex[1].rotateOX(angle);
        vertex[2].rotateOX(angle);
        vertex[3].rotateOX(angle);
    }
    public void rotateOY(double angle){
        vertex[0].rotateOY(angle);
        vertex[1].rotateOY(angle);
        vertex[2].rotateOY(angle);
        vertex[3].rotateOY(angle);

    }
    public void rotateOZ(double angle){
        vertex[0].rotateOZ(angle);
        vertex[1].rotateOZ(angle);
        vertex[2].rotateOZ(angle);
        vertex[3].rotateOZ(angle);

    }
    public void multiplicOX(double k){
        vertex[0].mult(vertex[0],k);
        vertex[1].mult(vertex[1],k);
        vertex[2].mult(vertex[2],k);
        vertex[3].mult(vertex[3],k);
    }
    public void multiplicOY(double k){
        vertex[0].mult(vertex[0],k);
        vertex[1].mult(vertex[1],k);
        vertex[2].mult(vertex[2],k);
        vertex[3].mult(vertex[3],k);
    }
    public void multiplicOZ(double k){
        vertex[0].mult(vertex[0],k);
        vertex[1].mult(vertex[1],k);
        vertex[2].mult(vertex[2],k);
        vertex[3].mult(vertex[3],k);
    }
    }

