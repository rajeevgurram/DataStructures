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

    @Override
    public void reverseUsingLoop(){
        Node _prev= null, _current= _head, _next;
        while (_current!=null){
            _next= _current.getNext();
            _current.setNext(_prev);
            _prev= _current;
            _current= _next;
        }

        Node _temp= _head;
        _head= _tail;
        _tail= _temp;

    }

    @Override
    public void reverseUsingRecursion(){
        reverseList(null, _head);

        Node _temp= _head;
        _head= _tail;
        _tail= _temp;
    }

    private void reverseList(Node _prev, Node _current){
        if(_current==null){
            return;
        }

        reverseList(_current, _current.getNext());
        _current.setNext(_prev);
    }

    @Override
    public void iterate(){
        Node _temp= _head;
        while (_temp!=null){
            System.out.println(_temp.getValue());
            _temp= _temp.getNext();
        }
    }

    @Override
    public int deleteKNode(int K){
        int index= 0;
        Node _temp= _head;
        Node _prev= null;
        while (index!=K && _temp!=null){
            _prev= _temp;
            _temp= _temp.getNext();
            index++;
        }

        if(K==0){
            return removeFirst();
        }

        if(K==_count){
            return removeLast();
        }


        _prev.setNext(_temp.getNext());
        int value= _temp.getValue();
        _count--;
        return value;
    }

    @Override
    public int FourthNodeFromEnd(){
        Node _temp= _head, _temp2= _head;

        int n= 0;

        while(_temp2!=null && n< 4){
            _temp2= _temp2.getNext();
            n++;
        }

        while(_temp2!=null){
            _temp = _temp.getNext();
            _temp2 = _temp2.getNext();
        }

        return _temp.getValue();

    }

}
