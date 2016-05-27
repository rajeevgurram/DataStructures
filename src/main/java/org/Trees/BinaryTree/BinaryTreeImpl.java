package org.Trees.BinaryTree;

/**
 * Created by rajeevgurram on 5/24/16.
 */
public class BinaryTreeImpl implements BinaryTree {
    private int _count= 0;
    private Node _root;

    public int size(){
        return _count;
    }

    public int addItem(int data){
        if(_root==null){
            _root= new Node(data);
        }
        else{
            add(_root, data);
        }
        _count++;
        return data;
    }

    private void add(Node temp, int value){
        int data= temp.getValue();
        if(data > value){
            if(temp.getLeft()!=null){
                add(temp.getLeft(), value);
            }
            else{
                temp.setLeft(new Node(value));
            }

        }
        else if(data < value){
            if(temp.getRight()!=null) {
                add(temp.getRight(), value);
            }
            else{
                temp.setRight(new Node(value));
            }
        }
    }
}
