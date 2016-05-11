package org.LinkedList.Double;

/**
 * Created by rgurram on 5/10/2016.
 */
public class Node {
    private Node next, prev;
    private int vlaue;

    public Node(int value){
        this.vlaue= value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getVlaue() {
        return vlaue;
    }

    public void setVlaue(int vlaue) {
        this.vlaue = vlaue;
    }
}
