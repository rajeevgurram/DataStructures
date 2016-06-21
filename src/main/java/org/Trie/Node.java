package org.Trie;

import java.util.LinkedList;

/**
 * Created by rajeevgurram on 6/19/16.
 */
public class Node {
    private char content;
    private boolean isEnd;
    LinkedList<Node> childList;
    private int count;

    public Node(char c){
        isEnd= false;
        content= c;
        count= 0;
        childList= new LinkedList<Node>();
    }

    public Node subNode(char c){
        if(childList!=null){
            for(Node node: childList){
                if(node.content==c){
                    return node;
                }
            }
        }
        return null;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public LinkedList<Node> getChildList() {
        return childList;
    }

    public void setChildList(LinkedList<Node> childList) {
        this.childList = childList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
