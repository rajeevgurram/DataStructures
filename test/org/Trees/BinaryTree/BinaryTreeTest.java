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
}
