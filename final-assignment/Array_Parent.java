import java.util.*;
public class Array_Parent{
    int size,array[];
    Array_Parent(int size){
        this.size = size; //initializing the size of the array
        array = new int[size]; //creating an array of the reqd size
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        try{
            for(int x = 0; x < size; x++){
                System.out.print("Enter Element "+(x+1)+": ");
                array[x] = sc.nextInt(); //reads element from user
            }
        }
        catch(InputMismatchException IME){ //exception triggered if user enters an element which is not an integer
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
            System.out.print(this.array[x]+"  "); //printing an element
        System.out.println();
    }
}
