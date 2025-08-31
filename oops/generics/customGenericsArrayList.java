package generics;

import java.util.ArrayList;


public class customGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] newArray = new Object[data.length * 2];
       
        for(int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }
public T remove(){
    T removed = (T)(data[--size]);
    return removed;
}
public T get(int index) {

    return (T)data[index];
}

public int size(){
    return size;

}
public void getList(ArrayList<? extends Number> list) {
   System.out.println("wildcard");
}
public void set(int index,T value){
    data[index] = value;
}
@Override
public String toString() {
    Object[] actualData = new Object[size];
    for (int i = 0; i < size; i++) {
        actualData[i] = data[i];
    }
    return "customArrayList{" +
            "data=" + java.util.Arrays.toString(actualData) +
            ", size=" + size +
            '}';
}

    public static void main(String[] args) {
        customGenericsArrayList<Integer> integerList = new customGenericsArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);

        customGenericsArrayList<Integer> list = new customGenericsArrayList<>();
        list.add(10);
        list.add(20);
        ArrayList<Integer> arrList = new ArrayList<>();
        // arrList.add(100);
        // arrList.add(200);
        list.getList(arrList); // Example usage of the getList method with wildcard
        // System.out.println(list);
        // System.out.println(list.get(1)); // This will throw an IndexOutOfBoundsException
        // customGenericsArrayList<String> A = new customGenericsArrayList<>();
        // A.add("Hello");
        // A.add("World");
        // System.out.println(A);
        // A.getList(A);
;
    }
}
