package behavioral.strategy.example2;

import java.math.BigDecimal;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:6:03 PM
 */
public class Demo {


    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();
        easterDiscounter.apply(BigDecimal.TEN);

        Discounter.easter();
    }

}
