package java_DSA.Queue;

public class CustomQueue {
protected int[] data;
private static final  int  DEFAULT_SIZE = 10;
private int end=-1;
public CustomQueue(){
    this(DEFAULT_SIZE);
}
public CustomQueue(int size){
this.data=new int[size];
}
public int peek(){
return data[end];
}
public boolean isFull(){
    if(end==data.length-1){
        return true;
    }
    return false;
}
public boolean isEmpty(){
    if(end==-1){
        return true;
    }
    return false;
}
public void insert(int item){
    if(isFull()){
        return;
    }
    data[++end]=item;
}
public int remove()throws Exception{
    if(isEmpty()){
        throw new Exception("Queue is Empty");
    }
    int temp = data[0];
    for(int i=1;i<end;i++){
        data[i-1]=data[i];
    }
    end--;
    return temp;
}
public  void display(){
    for(int i=0;i<=end;i++){
        System.out.println(data[i]+" ");
    }
    System.out.println("end");
}
}
