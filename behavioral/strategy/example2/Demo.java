package behavioral.strategy.example2;

import java.math.BigDecimal;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:6:03 PM
 */
public class Demo {


    public static void main(String[] args) {
        Discounter oldWay = new EasterDiscounter();
        var afterDiscount = oldWay.apply(BigDecimal.TEN);
        System.out.println("before discount = " + BigDecimal.TEN);
        System.out.println("after old way easter discount = " + afterDiscount);
        var newWay = Discounter.easter().apply(BigDecimal.valueOf(10000L));
        System.out.println("before discount = "+ BigDecimal.valueOf(10000L));
        System.out.println("after new way to calculate easter discount = "+ newWay);
    }

}
