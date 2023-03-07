import java.util.*;
public class Driver4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        try{
            System.out.print("Enter row for Matrix 1: ");
            r1 = sc.nextInt();
            System.out.print("Enter column for Matrix 1: ");
            c1 = sc.nextInt();
            Matrices M1 = new Matrices(r1,c1);
            M1.input();
            System.out.print("\nEnter row for Matrix 2: ");
            r2 = sc.nextInt();
            System.out.print("Enter column for Matrix 2: ");
            c2 = sc.nextInt();
            Matrices M2 = new Matrices(r2,c2);
            M2.input();
            System.out.println("\nMatrix 1: ");
            M1.display();
            System.out.println("\nMatrix 2: ");
            M2.display();
            Matrices M1T = M1.transpose();
            Matrices M2T = M2.transpose();
            System.out.println("\nMatrix 1 transpose: ");
            M1T.display();
            System.out.println("\nMatrix 2 transpose: ");
            M2T.display();
            System.out.println("\nCalculating sum of 2 Matrices: ");
            M1.add(M2);
        }
        catch(Exception E){
            System.out.println("Exception Occured.");
        }
        sc.close();
    }
}
