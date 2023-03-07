import java.util.*;
public class Driver2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DeQueue DQ = new DeQueue(5);
        try{
            for(int x=0; x<5; x++){
                System.out.print("Enter Element "+(x+1)+" to Queue: ");
                int ele = sc.nextInt();
                DQ.enqueue(ele);
                DQ.display();
                System.out.println();
            }
            System.out.println("Dequeuing 2 elements.");
            for(int x=0; x<2; x++){
                DQ.dequeue();
                DQ.display();
            }        
            System.out.println("Queuing 2 elements from front.");
            for(int x=0; x<2; x++){
                System.out.print("\nEnter Element "+(x+1)+" to Queue: ");
                int ele = sc.nextInt();
                DQ.enq_f(ele);
                DQ.display();
            }
        }
        catch(InputMismatchException IME){
            System.out.println("\nInput Error. Enter Integer Value.");
        }
        catch(Exception E){
            System.out.println("\nException Occured. Exiting program.");
        }
        sc.close();
    }
}
