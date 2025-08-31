package java_DSA.Queue;

public class CircularQueue {
protected int[] data;
private static final  int  DEFAULT_SIZE = 10;
private int front=-1;
public CircularQueue(){
    this(DEFAULT_SIZE);
}
public CircularQueue(int size){
this.data=new int[size];
}
}
