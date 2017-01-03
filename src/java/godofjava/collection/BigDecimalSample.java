package godofjava.collection;

import java.math.BigDecimal;

/**
 * Created by chgm1006 on 2015. 4. 14..
 */
public class BigDecimalSample {
    private void bigDecimalCalc() {
        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal("0.1");

        for (int loop = 0; loop < 10; loop++) {
            value = value.add(addValue);
            System.out.println(value.toString());
        }
    }

    private void normalDoubleCalc() {
        double value = 1.0;
        for (int loop = 0; loop < 10; loop++) {
            value += 0.1;
            System.out.println("value = " + value);
        }
    }

    public static void main(String[] args) {
        BigDecimalSample sample = new BigDecimalSample();
//    sample.normalDoubleCalc();
        sample.bigDecimalCalc();
    }
}
