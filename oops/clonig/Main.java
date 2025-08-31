package clonig;

import java.util.Arrays;

public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
    Human human1 = new Human(25, "John");
    // Human human2 = new Human(human1); // Cloning human1
  Human twin = (Human) human1.clone();
  System.out.println(Arrays.toString(twin.arr));
  twin.arr[0] = 100; // Modifying the cloned array
  System.out.println(Arrays.toString(twin.arr));
    System.out.println(Arrays.toString(human1.arr)); // Original array remains unchanged
 
}
}
