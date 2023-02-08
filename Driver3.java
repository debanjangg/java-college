//Main Class
import java.io.*;
public class Driver3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList ob = new LinkedList();
        Node n;
        int ch = -1;
        System.out.println("\nNOTE: LINKED LIST HAS BEEN CREATED BUT IS EMPTY. BELOW IS THE SET OF ACTIONS APPLICABLE...");
        while(ch != 7) {
            System.out.print("\nMENU:\n\t1. Insert at the beginning of the Linked List\n\t2. Insert at the end of the Linked List\n\t3. Delete from the beginning of the Linked List\n\t4. Delete from the end of the Linked List\n\t5. Delete all the instances of a particular value from the Linked List\n\t6. Display the Linked List\n\t7. TERMINATE THE PROGRAM\n\tChoice: ");
            ch = Integer.parseInt(br.readLine());
            switch(ch) {
                case 1:
                    System.out.print("\n\tData to be inserted: ");
                    n = new Node(br.readLine());
                    ob.insert_start(n);
                    ob.display();
                    break;
                case 2:
                    System.out.print("\n\tData to be inserted: ");
                    n = new Node(br.readLine());
                    ob.insert_end(n);
                    ob.display();
                    break;
                case 3:
                    ob.delete_start();
                    ob.display();
                    break;
                case 4: 
                    ob.delete_end();
                    ob.display();
                    break;
                case 5:
                    ob.delete_val();
                    ob.display();
                    break;
                case 6:
                    ob.display();
                    break;
                case 7:
                    System.out.println("\n\tSTATUS: PROGRAM TERMINATED!");
                    break;
                default:
                    System.out.println("\n\tERROR: INVALID CHOICE!");
            }
        }
    }
}