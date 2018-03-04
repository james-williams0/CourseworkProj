package courseworkproj;

public class Node {
    private int aNumber;
    Node next;
    Node(int aNumber, Node next) {
        this.aNumber = aNumber;
        this.next = next;
    }
    int getVal() {
        return aNumber;
    }
}
