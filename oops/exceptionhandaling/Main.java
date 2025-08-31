package exceptionhandaling;

public class Main {
public static void main(String[] args) {
    int a=5;
    int b=0;
    divide(a, b);

    try {
    //    divide(a, b);
    //     System.out.println("Division successful");
        throw new Exception("This is a custom exception");
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }catch (Exception e) {
        System.out.println("Caught a general exception: "    );
    } finally {
        System.out.println("This will always execute");
    }
}
static int divide(int a,int b) throws ArithmeticException {
    if(b==0){
        throw new ArithmeticException("Division by zero is not allowed");
    }
    return a/b;
}
}
