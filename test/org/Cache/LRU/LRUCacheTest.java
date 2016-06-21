package org.Cache.LRU;

import org.junit.Test;

/**
 * Created by rajeevgurram on 6/9/16.
 */
public class LRUCacheTest {
    @Test
    public void testSet(){
        LRUCache cache= new LRUCache();
        cache.set(1, 1);
        cache.set(2, 2);
        cache.set(3, 3);
        cache.set(4, 4);
        cache.set(5, 5);
        cache.set(3, 30);

        cache.get(2);
        cache.iterate();
        cache.get(5);
        cache.iterate();
        cache.get(1);
        cache.iterate();
        cache.get(5);

        cache.set(6, 6);

        cache.set(7, 7);

        cache.get(4);
        cache.iterate();

    }
}
