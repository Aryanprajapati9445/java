package compare;
import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
    Student s1 = new Student(1, 90.5f);
    Student s2 = new Student(2, 85.0f);
    Student[] list ={
       s1,s2
    };
    Arrays.sort(list, (a, b) -> (int)(a.marks - b.marks));
    System.out.println(Arrays.toString(list));
    // System.out.println(Arrays.toString(list));
    // if(s1.compareTo(s2)< 0) {
    //     System.out.println("s1 has less marks than s2");
    // } else if(s1.compareTo(s2) > 0) {
    //     System.out.println("s1 has more marks than s2");
    // } else {
    //     System.out.println("s1 and s2 have equal marks");
    // }
}

}