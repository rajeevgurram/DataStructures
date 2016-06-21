package org.Trie;

import org.junit.Test;

/**
 * Created by rajeevgurram on 6/19/16.
 */
public class TrieTest {
    @Test
    public void testTrie(){
        Trie t= new Trie();

        t.insert("Rajeev");
        t.insert("Kishore");
        t.insert("Raghu");

        t.search("Rajeev");

        t.removeWord("Rajeev");
    }
}
