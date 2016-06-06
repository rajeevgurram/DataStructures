package org.Hash.Table;

/**
 * Created by rajeevgurram on 6/2/16.
 */
public class Node {
    private String key;
    private int value;
    private Node next;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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
}
