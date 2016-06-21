package org.Trie;

/**
 * Created by rajeevgurram on 6/19/16.
 */
public class Trie {
    private Node root;

    public Trie(){
        root= new Node(' ');
    }

    public void insert(String word){
        if(search(word)==true){
            return;
        }

        Node temp= root;
        for(char ch: word.toCharArray()){
            Node node= temp.subNode(ch);
            if(node!=null){
                temp= node;
            }
            else{
                temp.childList.add(new Node(ch));
                temp= temp.subNode(ch);
            }
            temp.setCount(temp.getCount()+1);
        }
        temp.setEnd(true);
    }

    public boolean search(String word){
        Node temp = root;

        if(temp!=null){
            for(char c : word.toCharArray()){
                Node node= temp.subNode(c);
                if(node==null){
                    return false;
                }
                else{
                    temp= temp.subNode(c);
                }
            }

            if(temp.isEnd()==true){
                return true;
            }
        }

        return false;
    }

    public void removeWord(String word){
        Node current = root;
        for (char ch : word.toCharArray())
        {
            Node child = current.subNode(ch);
            if (child.getCount() == 1)
            {
                current.childList.remove(child);
                return;
            }
            else
            {
                child.setCount(child.getCount()-1);
                current = child;
            }
        }
        current.setEnd(false);
    }
}
