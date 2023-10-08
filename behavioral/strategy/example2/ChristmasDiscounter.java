package behavioral.strategy.example2;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:5:57 PM
 */
import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
