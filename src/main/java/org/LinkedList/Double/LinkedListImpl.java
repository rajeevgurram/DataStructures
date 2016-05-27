package org.LinkedList.Double;

import org.LinkedList.LinkedList;

/**
 * Created by rgurram on 5/10/2016.
 */
public class LinkedListImpl implements LinkedList {
    private Node _head, _tail;
    private int _count= 0;

    public int getSize() {
        return _count;
    }

    public int addFirst(int value) {
        Node _newNode= new Node(value);

        if(_head==null){
            _head= _tail= _newNode;
        }
        else{
            _newNode.setNext(_head);
            _head.setPrev(_newNode);
            _head= _newNode;
        }
        _count++;
        return value;
    }

    public int addLast(int value) {
        Node _newNode= new Node(value);

        if(_head==null){
            _head= _tail= _newNode;
        }
        else{
            _tail.setNext(_newNode);
            _newNode.setPrev(_tail);
            _tail= _newNode;
        }
        _count++;
        return value;
    }

    public int removeFirst() {
        int value= -1;
        if(_head==null){
            return value;
        }
        else{
            value= _head.getVlaue();
            _head= _head.getNext();
            _head.setPrev(null);
        }
        _count--;
        return value;
    }

    public int removeLast() {
        int value= -1;
        if(_tail==null){
            return value;
        }
        else{
            value= _tail.getVlaue();
            _tail= _tail.getPrev();
            _tail.setNext(null);
        }
        _count--;
        return value;
    }

    public int getFirst() {
        int value = -1;
        if(_head==null){
            return value;
        }
        else{
            return _head.getVlaue();
        }
    }

    public int getLast() {
        int value = 1;
        if(_tail==null){
            return value;
        }
        else{
            return _tail.getVlaue();
        }
    }

    public void clear() {
        _head= _tail= null;
        _count= 0;
    }

    @Override
    public void reverseUsingLoop() {
        Node _temp= _head;
        _head= _tail;
        _tail= _temp;
    }

    @Override
    public void reverseUsingRecursion() {
        Node _temp= _head;
        _head= _tail;
        _tail= _temp;
    }

    @Override
    public void iterate() {
        Node _temp= _head;
        while(_temp!=null){
            System.out.println(_temp.getVlaue());
            _temp= _temp.getNext();
        }
    }

    @Override
    public int deleteKNode(int K) {
        Node _temp= _head;
        for(int i=0; i<K; i++){
            _temp= _temp.getNext();
        }

        int value= _temp.getVlaue();
        _temp.getPrev().setNext(_temp.getNext());
//        _temp.setPrev(null);
//        _temp.setNext(null);
        return value;
    }

    public int FourthNodeFromEnd(){
        return _tail.getPrev().getPrev().getPrev().getVlaue();
    }
}