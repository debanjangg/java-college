import java.util.*;
public class Array_Parent{
    int size,array[];
    Array_Parent(int size){
        this.size = size;
        array = new int[size];
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        try{
            for(int x = 0; x < size; x++){
                System.out.print("Enter Element "+(x+1)+": ");
                array[x] = sc.nextInt();
            }
        }
        catch(InputMismatchException IME){
            System.out.println("Enter integer values.");
        }
        catch(Exception E){
            System.out.println("Exception Occured.");
        }
        System.out.println();
        sc.close();
    }
    public void display(){
        for(int x=0; x<this.size; x++)
            System.out.print(this.array[x]+"  ");
        System.out.println();
    }
}
