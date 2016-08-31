package godofjava.collection;

import java.util.Random;

/**
 * Created by chgm1006 on 2015. 4. 10..
 */
public class RandomSample {
    private void generateRandomNumbers(int randomCount) {
        Random random = new Random();
        for (int loop = 0; loop < randomCount; loop++) {
            System.out.println(random.nextInt(100) + ", ");
        }
    }

    public static void main(String[] args) {
        RandomSample sample = new RandomSample();
        int randomCount = 10;
        sample.generateRandomNumbers(randomCount);
    }
}
