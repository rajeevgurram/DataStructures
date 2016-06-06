package org.Hash.Table;

import org.junit.Test;

/**
 * Created by rajeevgurram on 6/5/16.
 */
public class HashTableImplTest {
    @Test
    public void testPut(){
        HashTableImpl table= new HashTableImpl();
        table.put("abc", 1);
        table.put("def", 2);
        table.put("ghi", 3);
        table.put("jkl", 4);
        table.put("mno", 5);

        table.iterate();

        table.remove("abc");
        table.remove("mno");
        table.iterate();

        table.getKeys();

    }
}
