package org.LinkedList.Single;

/**
 * Created by rajeevgurram on 5/6/16.
 */

public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value){
        this.value= value;
    }
}
