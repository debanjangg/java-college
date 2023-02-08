public class DeQueue extends Queue{
    DeQueue(int size){
        super(size);
    }
    public void enq_f(int x){
        if (super.front == 0)
            System.out.println("Queue is Full.");
        else{
            super.array[--super.front] = x;
            System.out.println(x+" enqueued from Front.");
        }
    }
    public void del_r(){
        if (super.rear == super.size)
            System.out.println("Queue is Empty.");
        else
            System.out.println(super.array[--this.rear]+" dequeued from Rear.");
    }
}
