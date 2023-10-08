package behavioral.strategy.example1;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:6:00 PM
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}