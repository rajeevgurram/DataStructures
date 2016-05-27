package org.Trees.BinaryTree;

/**
 * Created by rajeevgurram on 5/24/16.
 */
public class Node {
    private int _value;
    private Node _left, _right;

    public Node(int _value){
        this._value= _value;
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int _value) {
        this._value = _value;
    }

    public Node getLeft() {
        return _left;
    }

    public void setLeft(Node _left) {
        this._left = _left;
    }

    public Node getRight() {
        return _right;
    }

    public void setRight(Node _right) {
        this._right = _right;
    }
}
