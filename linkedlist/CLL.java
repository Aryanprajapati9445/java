package java_DSA.linkedlist;

public class CLL {
private Node head;
private Node tail;
private int size;

private class Node{
int value;
Node next;
public Node(int value){
    this.value=value;
}
public Node(int value,Node next){
    this.value=value;
    this.next = next;
}
}
public void insert(int value) {
Node newnode = new Node(value);
    if(head==null){
       insertAtBeginning(value);
    }
    else{
        tail.next=newnode;
        newnode.next=head;
        tail=newnode;
    }
}
public void insertAtBeginning(int value){
    Node newnode = new Node(value);
   if(head==null){
        head= newnode;
        head.next=head;
    }
}
public void display(){
    Node node = head;
if(head!=null){
do {
    System.out.println(node.value+"->");
} while (node!=head);
}
}

}
