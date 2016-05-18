package org.Stack;

import org.junit.Test;

/**
 * Created by rgurram on 5/17/2016.
 */
public class StackTest {
    Stack stack= null;

    public StackTest(){
        stack= new StackImpl();
    }

    @Test
    public void testPush(){
        for(int i=0; i<21; i++){
            stack.push(i);
        }
    }
}