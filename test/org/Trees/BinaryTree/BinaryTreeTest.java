package org.Trees.BinaryTree;

import org.Stack.Stack;
import org.Stack.StackImpl;
import org.junit.Assert;
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

    @Test
    public void testSearch(){
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

        Assert.assertEquals(tree.search(10), true);
        Assert.assertEquals(tree.search(50), false);
        Assert.assertEquals(tree.search(-1), false);
    }

    @Test
    public void testDelete(){
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

        tree.delete(3);
        tree.delete(10);
        tree.delete(20);
        tree.inOrderTraversal();
    }

    @Test
    public void testBalanceTree(){
        BinaryTree tree= new BinaryTreeImpl();
        for(int i=0; i<10; i++){
            tree.addItem(i);
        }
        tree.balanceTree();
        tree.inOrderTraversal();
    }

    @Test
    public void testCommonAncestor(){
        BinaryTree tree= new BinaryTreeImpl();
        for(int i=0; i<10; i++){
            tree.addItem(i);
        }
        tree.balanceTree();
        System.out.println(tree.commonAncestor(1, 2));

    }
}

