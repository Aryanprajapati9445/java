package java_DSA.linkedlist;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insert(10);
       list.insert(4);
       list.insert(20);
       list.insert(5);
       list.display();
       list.insertRec(45, 0);
     
    //    System.out.println(list.delete(1));
       list.display();
    //    System.out.println(list.delete(2));
    //    list.display();
// }
// Doubly_LL list = new Doubly_LL();
// list.insertAtBeginning(56);
// list.insertAtBeginning(5);
// list.insertAtBeginning(6);
// list.insertAtBeginning(156);
// list.insertAtposition(56, 2);
// list.display();
    }
}
