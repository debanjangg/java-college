import java.util.*;
public class Driver10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        int r = sc.nextInt();
        Circle C = new Circle(r);
        System.out.println("Area of the Circle: "+C.area());
        System.out.print("\nEnter the length of the Rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the Rectangle: ");
        int b = sc.nextInt();
        Rectangle R = new Rectangle(l,b);
        System.out.println("Area of the Circle: "+R.area());
        sc.close();
    }
}
