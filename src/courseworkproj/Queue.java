package courseworkproj;

public abstract class Queue {
    Node front;
    Node back;
    Queue() {
        front = null;
        back = null;
    }
    //  Preconditions: None
    //  Postconditions: The current back node becomes the oldBack node and a new node will be created with the enqueued value, back node will be made equal
    //  to the front node in the case that it is the only node in the queue, otherwise the new back node will be the next node of the oldBack
    void enQueue(int item) {
        Node oldBack = back;
        back = new Node(item, null);
        back.next = null;
        if (isEmpty()) front = back;
        else oldBack.next = back;
    }
    //  Preconditions: Queue is not empty
    //  Postconditions: The value of the front node will be returned, and the node next to the front will become the front
    int deQueue() {
        if(isEmpty()) {
            throw new OutOfBoundsException("Queue underflow error!");
        }
        else {
            int result = front.getVal();
            front = front.next;
            return result;
        }
    }
    //  Preconditions: Queue is not empty
    //  Postconditions: The value of the front will be returned
    int peek() {
        return back.getVal();
    }
    //  Preconditions: None
    //  Postconditions: Returns true if front is null (i.e. queue has no nodes) or false if there are nodes
    boolean isEmpty() {
        return front == null;
    }
    //  Preconditions: None
    //  Postconditions: Returns the number of nodes in the queue
    int size() {
        Node i = front;
        int queueSize = 0;
        while(i != null){
            queueSize++;
            i = i.next;
        }
        return queueSize;
    }
    //  Preconditions: Queue is not empty
    //  Postconditions: Dequeues all values from the queue until it is emptied
    public void emptyADT() {
        while(front != null) {
            deQueue();
        }
    }
}