package behavioral.strategy.example1;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:5:59 PM
 */

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
