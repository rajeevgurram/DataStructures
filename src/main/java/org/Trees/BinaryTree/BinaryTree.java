package org.Trees.BinaryTree;

/**
 * Created by rajeevgurram on 5/24/16.
 */
public interface BinaryTree {
    int size();
    int addItem(int data);
    void preOrderTraversal();
    void inOrderTraversal();
    void postOrderTraversal();
    void levelOrderTraversal();
    boolean search(int value);
    boolean delete(int value);
    void balanceTree();
    int commonAncestor(int first, int second);
    //Given a binary tree and a sum, find all the paths that leads to the sum.
}
