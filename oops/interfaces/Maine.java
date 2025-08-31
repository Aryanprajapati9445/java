package interfaces;

public class Maine implements A {
   // Maine.farewell(); // Removed or define the method if needed
@Override
   public void greet() {
       // Implementation of the greet method
       System.out.println("Greetings from Maine!");
    }
  
    

   
   public static void main(String[] args) {
        Maine m = new Maine();
        m.greet();
        m.farewell(); // Calling the default method from interface A
   }
}
