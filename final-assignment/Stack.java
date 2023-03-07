public class Stack extends Array_Parent{
    int top;
    Stack(int size){
        super(size);
        this.top = 0;
    }
    public void push(int x){
        if(this.top == super.size)
            System.out.println("Stack Overflow.");
        else{
            super.array[this.top++] = x;
            System.out.println(x+" pushed.");
        }
    }
    public void pop(){
        if(this.top == 0)
            System.out.println("Stack Underflow.");
        else
            System.out.println(super.array[this.top--]+" popped.");
    }
    public void display(){
        System.out.print("Stack: ");
        for(int x=0; x<this.top; x++){
            System.out.print(super.array[x]+"  ");
        }
        System.out.println();
    }
}
