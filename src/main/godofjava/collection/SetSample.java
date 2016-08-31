package godofjava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample {
    private int getCarKinds(String[] cars) {
        Integer x = getInteger(cars);
        if (x != null) return x;

        HashSet<String> carSet = getStrings(cars);

        printCarSet(carSet);
        printCarSet2(carSet);

        return carSet.size();
    }

    private Integer getInteger(String[] cars) {
        if (cars == null) {
            return 0;
        }

        if (cars.length == 1) {
            return 1;
        }
        return null;
    }

    private HashSet<String> getStrings(String[] cars) {
        HashSet<String> carSet = new HashSet<String>();
        for (String car : cars) {
            carSet.add(car);
        }
        return carSet;
    }

    private void printCarSet2(HashSet<String> carSet) {
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private void printCarSet(HashSet<String> carSet) {
        for (String temp : carSet) {
            System.out.print(temp + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        SetSample setSample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Zeep", "Grandeure",
                "Morning", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5", "SM7", "SM3", "Tico"
        };

        System.out.println(setSample.getCarKinds(cars));

    }
}
