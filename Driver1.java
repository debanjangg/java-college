//program with main() function
import java.io.*;
public class Driver1 {
    public static void main(String args[]) throws IOException {
        Coord2D A = new Coord2D(1, 5);
        Coord2D B = new Coord2D(2, 8);
        
        Coord3D C = new Coord3D(1, 4, 9);
        Coord3D D = new Coord3D(1, 1, 6);
        
        System.out.print("Coordinates (objects) created thus far:\n2D Coordinates:\n1. ");
        A.display();
        System.out.print("2. ");
        B.display();
        System.out.print("3D Coordinates:\n1. ");
        C.display();
        System.out.print("2. ");
        D.display();
        
        System.out.print("\nDistance of each coordinate from the origin:\n2D Coordinates:\n1. ");
        A.distO();
        System.out.print("2. ");
        B.distO();
        System.out.print("3D Coordinates:\n1. ");
        C.distO();
        System.out.print("2. ");
        D.distO();
        
        System.out.print("\nDistance between 2D Coordinates:\n1. Using the function dist(Coord2D obj):\n");
        A.dist(B);
        
        System.out.print("2. Using the function dist(Coord2D obj1, Coord2D obj2):\n");
        A.dist(A, B);
        
        System.out.print("\nDistance between 3D Coordinates:\n1. Using the function dist(Coord3D obj):\n");
        C.dist(D);
        System.out.print("2. Using the function dist(Coord3D obj1, Coord3D obj2):\n");
        C.dist(C, D);
    }
}