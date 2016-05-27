package org.LinkedList.Single;


import junit.framework.TestCase;
import org.LinkedList.Double.*;
import org.LinkedList.Double.LinkedListImpl;
import org.LinkedList.LinkedList;
import org.junit.Test;

/**
 * Created by rajeevgurram on 5/7/16.
 */
public class LinkedListTest extends TestCase{
    private LinkedList _list;

    public LinkedListTest(){
        //_list= new LinkedListImpl();
        _list= new LinkedListImpl();
    }

    @Test
    public void testGetSize(){
        assertEquals(0, _list.getSize());
    }

    @Test
    public void testAddFirst(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addFirst(i));
        }

        assertEquals(10, _list.getSize());
    }

    @Test
    public void testAddLast(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        assertEquals(10, _list.getSize());
    }

    @Test
    public void testRemoveFirst(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        assertEquals(10, _list.getSize());
        assertEquals(0, _list.removeFirst());
        assertEquals(9, _list.getSize());
        assertEquals(1, _list.getFirst());
    }

    @Test
    public void testRemoveLast(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        assertEquals(10, _list.getSize());
        assertEquals(9, _list.removeLast());
        assertEquals(9, _list.getSize());
        assertEquals(8, _list.getLast());

        _list.clear();

        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        for(int i=10; i>0; i--){
            assertEquals(i - 1, _list.removeLast());
        }

        assertEquals(0, _list.getSize());
    }

    public void testClear(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        assertEquals(10, _list.getSize());

        _list.clear();

        assertEquals(0, _list.getSize());

    }

    public void testReverseUsingLoops(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        _list.reverseUsingLoop();
        _list.iterate();

    }

    public void testReverseUsingRecursion(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        _list.reverseUsingRecursion();
        _list.iterate();
    }

    public void testDeleteKNode(){
        for(int i=0; i<10; i++){
            assertEquals(i, _list.addLast(i));
        }

        for(int i=1; i<8; i++){
            assertNotNull(_list.deleteKNode(i));
        }

        _list.iterate();
    }

    public void testFourthNodeFromEnd(){
        for(int i=0; i<2; i++){
            assertEquals(i, _list.addLast(i));
        }

        assertEquals(0 , _list.FourthNodeFromEnd());
    }
}
