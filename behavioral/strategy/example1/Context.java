package behavioral.strategy.example1;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:6:00 PM
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}