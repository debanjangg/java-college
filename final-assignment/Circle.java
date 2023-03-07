public class Circle implements Shape{
    double radius;
    Circle(int r){
        this.radius = r; //initializes radius with r
    }
    public double area(){
        return ( 3.14 * this.radius * this.radius ); //returns area of the circle
    }
}
