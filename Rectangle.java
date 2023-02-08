public class Rectangle implements Shape {
    double length, breadth;
    Rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    public double area(){
        return ( this.length * this.breadth );
    }
}
