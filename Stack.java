class Stack {
    private int arr[];
    private int top;
    private int capacity;


    Stack(int capacity){//this is a constructor which has to be the same name as the class
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);//what is thhis?
        }
        System.out.println("Inserting "+x);
        arr[++top]=x;//inserted x on the index by increasing by 1
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int size(){
        return top+1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top == capacity -1;
    }
    public void printStack(){
        for(int i =0; i<= top; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack(5); //object was created from the class stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.pop();

        System.out.println("\nAfter popping out");
        stack.printStack();

    }

}