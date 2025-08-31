package java_DSA.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            insertAtBeginning(value);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertRec(int val, int index) {
head= insertRec(val, index, head);
    
    }
private Node insertRec(int val ,int index,Node node){
    if(index==0){
        Node temp = new Node(val,node);
        size++;
        return temp;
    }
   node.next = insertRec(val,index-1,node.next);
   return node;

}
    public void insertAtBeginning(int value) {
        Node newnode = new Node(value);
        if ((head == null)) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtposition(int value, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        if (position == size) {
            insert(value);
            return;
        }
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        Node newNode = new Node(value, current.next);
        current.next = newNode;
        size++;
    }

    public int deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int deletedValue = head.value;
        head = head.next;
        size--;
        if (head == null) {
            tail = null; // If the list becomes empty, update tail
        }
        return deletedValue;
    }

    public Node finid(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;

    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node current = get(size - 2);
        int deletedValue = tail.value;
        tail = current;
        tail.next = null;
        size--;
        return deletedValue;
    }

    public void getvalue(int index) {
        System.out.println(get(index).value);
    }

    public int delete(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
}
