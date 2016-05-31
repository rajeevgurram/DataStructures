package org.Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
            Node node= search(_root, value);
            if(node==null){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }

    private Node search(Node root, int value){
        while(root != null){
            int currentValue= root.getValue();
            if(currentValue > value){
                root= root.getLeft();
            }
            else if(currentValue < value){
                root= root.getRight();
            }
            else if(currentValue == value){
                return root;
            }
        }
        return null;
    }

    public boolean delete(int value){
        if(_root!=null){
            return delete(_root, _root, value);
        }
        return false;
    }

    private boolean delete(Node parent, Node root, int value){
        if(root.getValue() > value){
            delete(root, root.getLeft(), value);
        }
        else if(root.getValue() < value){
            delete(root, root.getRight(), value);
        }
        else if(root.getValue() == value){
            //Found the value
            //Case 1: No Childrens
            if(root.getLeft()==null && root.getRight()==null){
                parent.setLeft(null);
                parent.setRight(null);
            }

            //Case 2: Has left childrens
            if(root.getLeft()!=null && root.getRight()==null){
                parent.setLeft(root.getLeft());
            }

            //Case 3: Has right childrens
            if(root.getLeft()==null && root.getRight()!=null){
                parent.setRight(root.getRight());
            }

            //Case 4: Has both left and right childrens
            if(root.getLeft()!=null && root.getRight()!=null){
                Node temp= root;
                Node parentTemp= root;
                //If it is root node
                if(_root == root){
                    temp= root.getRight();
                }
                while(temp.getLeft()!=null){
                    if(temp.getLeft()!=null){
                        parentTemp= temp;
                        temp= temp.getLeft();
                    }
                }
                parentTemp.setLeft(null);
                root.setValue(temp.getValue());
            }
            _count--;
            return true;
        }
        return false;
    }

    public void balanceTree(){
        List<Integer> data= new ArrayList<Integer>();
        inOrder(_root, data);

        _root= null;
        balance(data, 0, data.size());

    }

    private void balance(List<Integer> data, int min, int max){
        if(min == max){
            return;
        }
        int mid= (min + max) / 2;
        int midValue= data.get(mid);

        addItem(midValue);

        balance(data, min, mid);
        balance(data, mid+1, max);
    }

    private void inOrder(Node root, List<Integer> data){
        if(root.getLeft()!=null){
            inOrder(root.getLeft(), data);
        }
        data.add(root.getValue());
        if(root.getRight()!=null){
            inOrder(root.getRight(), data);
        }
    }
}