package algorithms.hashtableExam;

/**
 * Created by Forrest on 2016. 12. 29..
 */
public interface HashSearch {
    HashTable createHashTable(int bucketSize);

    int addData(HashTable hashTable, HashBucket bucket);

    HashBucket search(HashTable hashTable, char key);

    void displayHashTable(HashTable hashTable);

    int getCount(HashTable hashTable);

    void deleteHashTable(HashTable hashTable);

    int hashFunction(char key, int bucketSize);

    long stringToLong(char key);

    int isEmptyBucket(HashBucket bucket);

    int isEmptyOrDeletedBucket(HashBucket bucket);
}
