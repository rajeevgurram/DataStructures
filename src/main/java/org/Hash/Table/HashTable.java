package org.Hash.Table;

/**
 * Created by rajeevgurram on 6/5/16.
 */
public interface HashTable {
    void put(String key, int value);
    int get(String key);
    int getSize();
    void remove(String key);
    void iterate();
}
