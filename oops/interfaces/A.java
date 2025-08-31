package interfaces;

public interface A {
 void greet();
 default void farewell() {
  System.out.println("Goodbye from A!");
 }
}
