package org.Cache.LRU;

import java.util.HashMap;

/**
 * Created by rajeevgurram on 6/7/16.
 */
public class LRUCache {
    private static final int CAPACITY= 5;
    HashMap<Integer, Node> map;
    private Node head, tail;

    public LRUCache(){
        map= new HashMap<Integer, Node>();
    }

    private void remove(Node node){
        if(node==head){
            node.getNext().setPrev(null);
            head= head.getNext();
            return;
        }
        else if(node==tail){
            tail= node.getPrev();
            tail.setNext(null);
            return;
        }
        else{
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
    }

    private void addToHead(Node node){
        if(head==null){
            head= node;
            tail= node;
        }
        else{
            node.setNext(head);
            head.setPrev(node);
            head= node;
            head.setPrev(null);
        }
    }

    private void removeTail(){
        if(tail!=null){
            tail= tail.getPrev();
            tail.setNext(null);
        }
    }

    public void set(int key, int value){

        if(map.containsKey(key)){
            Node node= map.get(key);
            node.setValue(value);
            this.remove(node);
            this.addToHead(node);
        }
        else{
            Node newNode= new Node();
            newNode.setKey(key);
            newNode.setValue(value);
            if(CAPACITY <= map.size()) {
                int tailKey= tail.getKey();
                this.removeTail();
                map.remove(tailKey);
            }
            this.addToHead(newNode);
            map.put(key, newNode);
        }
        this.iterate();
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node= map.get(key);
            this.remove(node);
            this.addToHead(node);
            return node.getValue();
        }
        return -1;
    }

    public void iterate(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.getValue());
            temp= temp.getNext();
        }
        System.out.println("============");
    }
}
