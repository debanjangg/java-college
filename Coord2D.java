
class Coord2D {
    private int x, y;
    
    Coord2D() {
        this.setX(0);
        this.setY(0);
    }
    
    Coord2D(int a) {
        this.setX(a);
        this.setY(a);
    }
    
    Coord2D(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    int getX() {
        return this.x;
    }
    
    int getY() {
        return this.y;
    }
    
    void setX(int x) {
        this.x = x;
    }
    
    void setY(int y) {
        this.y = y;
    }
    
    void display() {
        System.out.println("Coordinate (X, Y): ("+this.getX()+", "+this.getY()+")");
    }
    
    void distO() {
        System.out.println("Distance between (0, 0) and ("+this.getX()+", "+this.getY()+"): "+Math.sqrt(Math.pow(0-this.getX(),2)+Math.pow(0-this.getY(),2)));
    }
    
    void dist(Coord2D A) {
        System.out.println("Distance between ("+this.getX()+", "+this.getY()+") and ("+A.getX()+", "+A.getY()+"): "+Math.sqrt(Math.pow(this.getX()-A.x,2)+Math.pow(this.getY()-A.y,2)));
    }
    
    void dist(Coord2D A, Coord2D B) {
        System.out.println("Distance between ("+A.getX()+", "+A.getY()+") and ("+B.getX()+", "+B.getY()+"): "+Math.sqrt(Math.pow(A.getX()-B.getX(),2)+Math.pow(A.getY()-B.getY(),2)));
    }
}