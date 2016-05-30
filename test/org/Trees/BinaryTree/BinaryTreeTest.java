package org.Trees.BinaryTree;

import org.Stack.Stack;
import org.Stack.StackImpl;
import org.junit.Test;

/**
 * Created by rajeevgurram on 5/24/16.
 */
public class BinaryTreeTest {

    @Test
    public void testAddItem(){
        BinaryTree tree= new BinaryTreeImpl();

        for(int i=0; i<10; i++){
            tree.addItem(i);
        }
    }

    @Test
    public void testPreOrder(){
        BinaryTree tree= new BinaryTreeImpl();
        tree.addItem(10);
        tree.addItem(5);
        tree.addItem(15);
        tree.addItem(3);
        tree.addItem(13);
        tree.addItem(1);
        tree.addItem(11);
        tree.addItem(1);
        tree.addItem(19);
        tree.addItem(0);
        tree.addItem(20);
        tree.addItem(7);
        tree.addItem(17);
        tree.addItem(9);

        tree.preOrderTraversal();
    }

    @Test
    public void testInOrder(){
        BinaryTree tree= new BinaryTreeImpl();

        tree.addItem(10);
        tree.addItem(5);
        tree.addItem(15);
        tree.addItem(3);
        tree.addItem(13);
        tree.addItem(1);
        tree.addItem(11);
        tree.addItem(1);
        tree.addItem(19);
        tree.addItem(0);
        tree.addItem(20);
        tree.addItem(7);
        tree.addItem(17);
        tree.addItem(9);

        tree.inOrderTraversal();
    }

    @Test
    public void testPostOrder(){
        BinaryTree tree= new BinaryTreeImpl();

        tree.addItem(10);
        tree.addItem(5);
        tree.addItem(15);
        tree.addItem(3);
        tree.addItem(13);
        tree.addItem(1);
        tree.addItem(11);
        tree.addItem(1);
        tree.addItem(19);
        tree.addItem(0);
        tree.addItem(20);
        tree.addItem(7);
        tree.addItem(17);
        tree.addItem(9);

        tree.postOrderTraversal();
    }

    @Test
    public void testLevelOrder(){
        BinaryTree tree= new BinaryTreeImpl();

        tree.addItem(10);
        tree.addItem(5);
        tree.addItem(15);
        tree.addItem(3);
        tree.addItem(13);
        tree.addItem(1);
        tree.addItem(11);
        tree.addItem(1);
        tree.addItem(19);
        tree.addItem(0);
        tree.addItem(20);
        tree.addItem(7);
        tree.addItem(17);
        tree.addItem(9);

        tree.levelOrderTraversal();
    }
}
