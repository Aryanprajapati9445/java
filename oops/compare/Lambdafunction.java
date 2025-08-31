package compare;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunction {
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        list.add(i+1);
    }
    list.forEach((n)-> {
        System.out.print(n*2);
        
    });
    Consumer<Integer> fun = (item)-> System.out.println(item);
    list.forEach(fun);
    Operation sum = (a, b) -> a + b;
    // Operation sub =(a, b) -> a - b; 
    Lambdafunction myCalculator = new Lambdafunction();
    myCalculator.operate(10, 5, sum);

}
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    interface Operation {
        int operation(int a, int b);
    }
}