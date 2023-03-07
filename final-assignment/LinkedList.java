import java.io.*;
class LinkedList {
    private Node head;
    LinkedList() {
        head = new Node("Head");
    }
    void insert_end(Node node) {
        if(head.getNext() == null)
            head.setNext(node);
        else {
            Node ptr;
            for(ptr = head; ptr.getNext() != null; ptr = ptr.getNext());
            ptr.setNext(node);
        }
        System.out.println("\tStatus: \""+node.getVal()+"\" has been inserted at the end of the Linked List...");
    }
    void insert_start(Node node) {
        if(head.getNext() == null) 
            head.setNext(node);
        else {
            node.setNext(head.getNext());
            head.setNext(node);
        }
        System.out.println("\tStatus: \""+node.getVal()+"\" has been inserted at the beginning of the Linked List...");
    }
    void delete_end() {
        if(head.getNext() == null)
            return;
        else {
            Node ptr, prev;
            for(ptr = head, prev = ptr; ptr.getNext() != null; prev = ptr, ptr = ptr.getNext());
            
            prev.setNext(null);
            System.out.println("\n\tStatus: \""+ptr.getVal()+"\" has been deleted from the Linked List...");
        }
    }
    void delete_start() {
        if(head.getNext() == null)
            return;
        else {
            System.out.println("\n\tStatus: \""+head.getNext().getVal()+"\" has been deleted from the Linked List...");
            head.setNext(head.getNext().getNext());
        }
    }
    void delete_val() throws IOException{
        boolean flag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(head.getNext() == null)
            return;
        System.out.print("\n\tData to be deleted: ");
        String data = br.readLine();
        Node ptr, prev;
        for(prev = ptr = head; ptr != null;) {
            if(ptr.getVal().equals(data)) {
                prev.setNext(ptr.getNext());
                flag = true;
            }
            else 
                prev = ptr;
            ptr = ptr.getNext();
        }
        if(flag == true)
            System.out.println("\tStatus: All instances of \""+data+"\" have been deleted from the Linked List...");
        else
            System.out.println("\tStatus: No instances of \""+data+"\" have been found in the Linked List...");
    }
    void display() {
        Node ptr;
        if(head.getNext() == null)
            System.out.println("\n\tERROR: Linked List is empty!");
        else {
            System.out.print("\n\tLinked List: ");
            for(ptr = head; ptr != null; ptr = ptr.getNext()) 
                System.out.print("|"+ptr.getVal()+"| -> ");
            System.out.println("NULL");
        }
    }
}