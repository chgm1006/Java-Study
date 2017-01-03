package algorithms.hashtableExam;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class HashSearchImpl extends HashSearch {
    @Override
    public HashTable createHashTable(int bucketSize) {
        HashTable pReturn = null;

        if (bucketSize <= 0) {
            System.out.println("버킷 크기는 0보다 커야합니다");

            return null;
        }

        pReturn = new HashTable();

        if (pReturn != null) {
            pReturn.currentCount = 0;
            pReturn.bucketSize = bucketSize;
            pReturn.pBucket = null;
        } else {
            System.out.println("오류 첫번째 메모리할당 createHashTable()");
            return null;
        }

        pReturn.pBucket = new HashBucket();
        if (pReturn.pBucket != null) {

        }

        return null;
    }

    @Override
    public int addData(HashTable hashTable, HashBucket bucket) {
        return 0;
    }

    @Override
    public HashBucket search(HashTable hashTable, char key) {
        return null;
    }

    @Override
    public void displayHashTable(HashTable hashTable) {

    }

    @Override
    public int getCount(HashTable hashTable) {
        return 0;
    }

    @Override
    public void deleteHashTable(HashTable hashTable) {

    }

    @Override
    public int hashFunction(char key, int bucketSize) {
        return 0;
    }

    @Override
    public long stringToLong(char key) {
        return 0;
    }

    @Override
    public int isEmptyBucket(HashBucket bucket) {
        return 0;
    }

    @Override
    public int isEmptyOrDeletedBucket(HashBucket bucket) {
        return 0;
    }
}
