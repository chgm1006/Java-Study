package algorithms.hashtableExam;

/**
 * Created by Forrest on 2016. 12. 29..
 */
public abstract class HashSearch {
    class HashBucket {
        char[] key = new char[HASH_KEY + 1];
        int value;
        HashBucketStatus status;
    }

    class HashTable {
        int bucketSize;
        int currentCount;
        HashBucket pBucket;
    }

    private static final int HASH_KEY = 30;

    public abstract HashTable createHashTable(int bucketSize);

    public abstract int addData(HashTable hashTable, HashBucket bucket);

    public abstract HashBucket search(HashTable hashTable, char key);

    public abstract void displayHashTable(HashTable hashTable);

    public abstract int getCount(HashTable hashTable);

    public abstract void deleteHashTable(HashTable hashTable);

    public abstract int hashFunction(char key, int bucketSize);

    public abstract long stringToLong(char key);

    public abstract int isEmptyBucket(HashBucket bucket);

    public abstract int isEmptyOrDeletedBucket(HashBucket bucket);
}
