package generics;

// import java.util.ArrayList;


public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] newArray = new int[data.length * 2];
       
        for(int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }
public int remove(){
    int removed = data[--size];
    return removed;
}
public int get(int index) {
    if(index < 0 || index >= size) {        
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return data[index];
}
public int get(){
    return data[size];
}
public int size(){
    return size;

}
public void set(int index,int value){
    data[index] = value;
}
@Override
public String toString() {
    int[] actualData = new int[size];
    for (int i = 0; i < size; i++) {
        actualData[i] = data[i];
    }
    return "customArrayList{" +
            "data=" + java.util.Arrays.toString(actualData) +
            ", size=" + size +
            '}';
}

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(20);
        // list.get(0);
        // list.set(0, 30);
        // list.remove(1); 
        // list.size();
        // list.isEmpty();
        // System.out.println(list);
        customArrayList list = new customArrayList();
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.get(-1); // This will throw an IndexOutOfBoundsException

    }
    

}
