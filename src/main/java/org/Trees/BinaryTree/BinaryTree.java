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
}
