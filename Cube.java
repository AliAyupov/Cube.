public class Cube {
    private Focet[] facets;
    public Cube(){
        facets =new Focet[6];
        facets[0]=new Focet(new R3Vector(0,0,0),new R3Vector(1,0,0),new R3Vector(1,1,0),new R3Vector(0,1,0));
        facets[1]=new Focet(new R3Vector(1,1,0),new R3Vector(1,1,1),new R3Vector(0,1,1),new R3Vector(0,1,0));
        facets[2]=new Focet(new R3Vector(1,0,0),new R3Vector(1,0,1),new R3Vector(1,1,1),new R3Vector(1,1,0));
        facets[3]=new Focet(new R3Vector(0,0,0),new R3Vector(0,0,1),new R3Vector(1,0,1),new R3Vector(1,0,0));
        facets[4]=new Focet(new R3Vector(0,1,0),new R3Vector(0,1,1),new R3Vector(0,0,1),new R3Vector(0,0,0));
        facets[5]=new Focet(new R3Vector(1,0,1),new R3Vector(0,0,1),new R3Vector(0,1,1),new R3Vector(1,1,1));

    }
    public void rotate(double x,double y,double z){
        rotateOX(x);
        rotateOY(y);
        rotateOZ(z);

    }
    public void rotateOX(double angle){
        facets[0].rotateOX(angle);
        facets[1].rotateOX(angle);
        facets[2].rotateOX(angle);
        facets[3].rotateOX(angle);
        facets[4].rotateOX(angle);
        facets[5].rotateOX(angle);
    }
    public void rotateOY(double angle){
        facets[0].rotateOY(angle);
        facets[1].rotateOY(angle);
        facets[2].rotateOY(angle);
        facets[3].rotateOY(angle);
        facets[4].rotateOX(angle);
        facets[5].rotateOX(angle);
    }
    public void rotateOZ(double angle){
        facets[0].rotateOZ(angle);
        facets[1].rotateOZ(angle);
        facets[2].rotateOZ(angle);
        facets[3].rotateOZ(angle);
        facets[4].rotateOZ(angle);
        facets[5].rotateOZ(angle);
    }
    public void multicationOX(double k){
        facets[0].multiplicOX(k);
        facets[1].multiplicOX(k);
        facets[2].multiplicOX(k);
        facets[3].multiplicOX(k);
        facets[4].multiplicOX(k);
        facets[5].multiplicOX(k);
    }
    public void multicationOY(double k){
        facets[0].multiplicOY(k);
        facets[1].multiplicOY(k);
        facets[2].multiplicOY(k);
        facets[3].multiplicOY(k);
        facets[4].multiplicOY(k);
        facets[5].multiplicOY(k);
    }
    public void multicationOZ(double k){
        facets[0].multiplicOZ(k);
        facets[1].multiplicOZ(k);
        facets[2].multiplicOZ(k);
        facets[3].multiplicOZ(k);
        facets[4].multiplicOZ(k);
        facets[5].multiplicOZ(k);

    }
}
