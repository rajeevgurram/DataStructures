package org.Stack;

/**
 * Created by rgurram on 5/17/2016.
 */
public class StackImpl implements Stack {
    private int _count= 0;
    private int _initialSize= 10;
    private int[] data= null;

    public StackImpl(){
        data= new int[_initialSize];
    }

    public int getSize(){
        return _count;
    }

    public int push(int value){
        if(_count>=_initialSize){
            _initialSize*=2;

            int[] temp= new int[_initialSize];
            for(int i=0; i<data.length; i++){
                temp[i]= data[i];
            }
            data= temp;
        }

        data[_count]= value;
        _count++;
        return value;
    }

    public int pop(){
        int value= data[_count];
        data[_count]= 0;
        _count--;
        return value;
    }
}
