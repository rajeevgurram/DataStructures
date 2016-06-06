package org.Hash.Table;

/**
 * Created by rajeevgurram on 6/5/16.
 */
public class HashTableImpl implements HashTable{
    private static final int TABLE_SIZE= 3;
    private Node[] table;
    private int count= 0;

    public HashTableImpl(){
        table= new Node[TABLE_SIZE];
    }

    public void put(String key, int value){
        int index= hash(key);
        if(table[index]==null){
            table[index]= new Node();
            table[index].setKey(key);
            table[index].setValue(value);
            count++;
        }
        else{
            Node collisionNode= table[index];
            while (collisionNode.getNext()!=null && !collisionNode.getKey().equals(key)){
                collisionNode= collisionNode.getNext();
            }

            if(collisionNode.getKey().equals(key)){
                collisionNode.setValue(value);
            }

            else{
                Node newNode= new Node();
                newNode.setKey(key);
                newNode.setValue(value);
                collisionNode.setNext(newNode);
                count++;
            }
        }
    }

    public int get(String key){
        int value= -1;
        int index= hash(key);
        Node temp= table[index];
        if(temp!=null){
            while(temp.getNext()!=null && !temp.getKey().equals(key)){
                temp= temp.getNext();
            }
            if(temp.getKey().equals(key)){
                value= temp.getValue();
            }
        }
        return value;
    }

    private int hash(String key){
        int hashVal= key.hashCode();
        hashVal%= TABLE_SIZE;
        if (hashVal < 0) {
            hashVal += TABLE_SIZE;
        }
        return hashVal;
    }

    public int getSize(){
        return count;
    }

    public void remove(String key){
        int index= hash(key);
        Node temp= table[index];
        Node prev= temp;

        if(temp!=null){
            if(temp.getKey().equals(key)){
                if(temp.getNext()==null) {
                    table[index] = null;
                }
                else{
                    table[index]= table[index].getNext();
                }
            }
            else {
                while (temp.getNext() != null && !temp.getKey().equals(key)) {
                    prev = temp;
                    temp = temp.getNext();
                }
                prev.setNext(null);
            }
            count--;
        }
    }

    public void iterate(){
        if(table!=null){
            Node[] temp= table;

            for(int i=0; i<TABLE_SIZE; i++){
                if(temp[i]!=null) {
                    System.out.println(temp[i].getValue());
                    Node next = temp[i].getNext();
                    while (next != null) {
                        System.out.println(next.getValue());
                        next = next.getNext();
                    }
                }
            }
        }
    }

}