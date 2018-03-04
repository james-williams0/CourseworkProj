package courseworkproj;

public abstract class Stack {
    Node head;
    Stack() {
        head = null;
    }
    //  Preconditions: None
    //  Postconditions: The value passed as item will become the value of the head node of the stack and the previous head will become the next node
    public void push(int item) {
        head = new Node(item, head);
    }
    //  Preconditions: Stack is not empty
    //  Postconditions: The value of the head node will be returned, and the node next to the head will become the head
    public int pop() {
        if (isEmpty()) {
            throw new OutOfBoundsException("Stack underflow error!");
        }
        else {
            int result = head.getVal();
            head = head.next;
            return result;
        }
    }
    //  Preconditions: Stack is not empty
    //  Postconditions: The value of the head will be returned
    public int peek() {
        return head.getVal();
    }
    //  Preconditions: None
    //  Postconditions: Returns true if head is null (i.e. stack has no nodes) or false if there are nodes
    public boolean isEmpty() {
        return head == null;
    }
    //  Preconditions: None
    //  Postconditions: Returns the number of nodes in the stack
    public int size() {
        Node i = head;
        int stackSize = 0;
        while(i != null){
            stackSize++;
            i = i.next;
        }
        return stackSize;
    }
    //  Preconditions: Stack is not empty
    //  Postconditions: Pops all values from the stack until it is emptied
    public void emptyADT() {
        while(head != null) {
            pop();
        }
    }
}