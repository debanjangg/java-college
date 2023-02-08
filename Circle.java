public class Circle implements Shape{
    double radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return ( 3.14 * this.radius * this.radius );
    }
}
