public class Queue extends Array_Parent{
    int front,rear;
    Queue(int size){
        super(size);
        this.front = 0;
        this.rear = 0;
    }
    public void enqueue(int x){
        if (this.rear == super.size)
            System.out.println("Queue is Full.");
        else{
            super.array[this.rear++] = x;
            System.out.println(x+" enqueued.");
        }
    }
    public void dequeue(){
        if (this.front == this.rear)
            System.out.println("Queue is Empty.");
        else
            System.out.println(super.array[this.front++]+" is Dequeued.");
    }
    public void display(){
        System.out.print("Queue: ");
        for(int x=this.front; x<this.rear; x++)
            System.out.print(super.array[x]+"  ");
        System.out.println();
    }
}
