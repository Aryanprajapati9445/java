package oops;
public class child extends abs_class {
    public child(int age) {
        super(age) ;// Constructor with age parameter
    }
public child() {
        super(0); // Default constructor with age 0
    }
  @Override
  void career(String name) {
      System.out.println(name + " is a software engineer.");
  }
    @Override
    void hobby(String name, String hobby) {
        System.out.println(name + " loves " + hobby + ".");

}
public static void main(String[] args) {
    child c = new child(456);
    c.career("Alice");
    c.hobby("Alice", "painting");
    System.out.println("Age: " + c.age);
   abs_class.display();

}
}