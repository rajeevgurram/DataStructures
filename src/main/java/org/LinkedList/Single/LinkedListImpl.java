package org.LinkedList.Single;

import org.LinkedList.LinkedList;

/**
 * Created by rajeevgurram on 5/6/16.
 */
public class LinkedListImpl implements LinkedList {
    private int _count= 0;
    private Node _head, _tail;

    @Override
    public int getSize(){
        return _count;
    }

    @Override
    public int addFirst(int value){
        Node newNode= new Node(value);

        if(_head==null){
            _head= _tail= newNode;
        }
        else{
            newNode.setNext(_head);
            _head= newNode;
        }

        _count++;

        return value;
    }

    @Override
    public int addLast(int value){
        Node newNode= new Node(value);

        if(_head==null){
            _head= _tail= newNode;
        }
        else{
            _tail.setNext(newNode);
            _tail= newNode;
        }

        _count++;

        return value;
    }

    @Override
    public int removeFirst(){
        if(_head==null){
            return -1;
        }
        else{
            int value= _head.getValue();
            _head= _head.getNext();
            _count--;
            return value;
        }
    }

    @Override
    public int removeLast(){
        if(_head==null){
            return -1;
        }
        else{
            Node _temp= _head;
            _count--;
            if(_temp.getNext()==null){
                int value= _head.getValue();
                _head= _tail= null;
                return value;
            }

            while (_temp.getNext().getNext()!=null){
                _temp= _temp.getNext();
            }
            int value= _temp.getNext().getValue();
            _temp.setNext(null);
            _tail= _temp;
            return value;
        }
    }

    @Override
    public int getFirst(){
        if(_head==null){
            return -1;
        }
        else{
            return _head.getValue();
        }
    }

    @Override
    public int getLast(){
        if(_head==null){
            return -1;
        }
        else{
            return _tail.getValue();
        }
    }

    @Override
    public void clear(){
        _head= _tail= null;
        _count= 0;
    }
}
