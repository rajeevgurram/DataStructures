package org.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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

    public void preOrderTraversal(){
        if(_root != null){
            preOrder(_root);
        }
    }

    private void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrderTraversal(){
        if(_root != null){
            inOrder(_root);
        }
    }

    private void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.getLeft());
        System.out.println(root.getValue());
        inOrder(root.getRight());
    }

    public void postOrderTraversal(){
        if(_root != null){
            postOrder(_root);
        }
    }

    private void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getValue());
    }

    public void levelOrderTraversal(){
        if(_root != null){
            Queue<Node> queue= new LinkedList<Node>();
            queue.add(_root);
            levelOrder(queue);
        }
    }

    private void levelOrder(Queue<Node> queue){
        while(queue.size() > 0){
            Node left, right, current;
            current= queue.remove();
            if(current.getLeft() !=null){
                queue.add(current.getLeft());
            }
            if(current.getRight() !=null){
                queue.add(current.getRight());
            }
            System.out.println(current.getValue());
        }
    }

    public boolean search(int value){
        if(_root!=null){
            return search(_root, value);
        }
        return false;
    }

    private boolean search(Node root, int value){
        while(root != null){
            int currentValue= root.getValue();
            if(currentValue > value){
                root= root.getLeft();
            }
            else if(currentValue < value){
                root= root.getRight();
            }
            else if(currentValue == value){
                return true;
            }
        }
        return false;
    }
}