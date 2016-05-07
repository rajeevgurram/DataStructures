package org.LinkedList.Single;

import org.LinkedList.LinkedList;

/**
 * Created by rajeevgurram on 5/6/16.
 */
public class LinkedListImpl implements LinkedList {
    private int _count= 0;

    @Override
    public int getSize(){
        return _count;
    }
}
