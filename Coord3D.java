class Coord3D extends Coord2D{
    
    private int z;
    
    Coord3D() {
        super();
        this.setZ(0);
    }
    
    Coord3D(int a) {
        super(a);
        this.setZ(a);
    }
    
    Coord3D(int x, int y, int z) {
        super(x, y);
        this.setZ(z);
    }
    
    int getZ() {
        return this.z;
    }
    
    void setZ(int z) {
        this.z = z;
    }
    
    void display() {
        System.out.println("Coordinate (X, Y, Z): ("+this.getX()+", "+this.getY()+", "+this.getZ()+")");
    }
    
    void distO() {
        System.out.println("Distance between (0, 0, 0) and ("+this.getX()+", "+this.getY()+", "+this.getZ()+"): "+Math.sqrt(Math.pow(0-this.getX(),2)+Math.pow(0-this.getY(),2)+Math.pow(0-this.getZ(),2)));
    }
    
    void dist(Coord3D A) {
        System.out.println("Distance between ("+this.getX()+", "+this.getY()+", "+this.getZ()+") and ("+A.getX()+", "+A.getY()+", "+A.getZ()+"): "+Math.sqrt(Math.pow(this.getX()-A.getX(),2)+Math.pow(this.getY()-A.getY(),2)+Math.pow(this.getZ()-A.getZ(),2)));
    }
    
    void dist(Coord3D A, Coord3D B) {
        System.out.println("Distance between ("+A.getX()+", "+A.getY()+", "+A.getZ()+") and ("+B.getX()+", "+B.getY()+", "+B.getZ()+"): "+Math.sqrt(Math.pow(A.getX()-B.getX(),2)+Math.pow(A.getY()-B.getY(),2)+Math.pow(A.getZ()-B.getZ(),2)));
    }
}