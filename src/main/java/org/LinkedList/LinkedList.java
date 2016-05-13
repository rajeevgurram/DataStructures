package org.LinkedList;

/**
 * Created by rajeevgurram on 5/6/16.
 */
public interface LinkedList {
    int getSize();
    int addFirst(int value);
    int addLast(int value);
    int removeFirst();
    int removeLast();
    int getFirst();
    int getLast();
    void clear();
    void reverseUsingLoop();
    void reverseUsingRecursion();
    void iterate();
    int deleteKNode(int K);
    int FourthNodeFromEnd();
}
