package oops;

public abstract class abs_class {
    int age;
    public abs_class(int age) {
        this.age = age;
    }
    static void display() {
        System.out.println("This is a static method in the abstract class.");
    }
    abstract void  career(String name);
    abstract void  hobby(String name, String hobby);


}
