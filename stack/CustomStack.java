package java_DSA.stack;

public class CustomStack {
protected int[] data;
private static final  int  DEFAULT_SIZE = 10;
private int ptr=-1;
public CustomStack(){
    this(DEFAULT_SIZE);
}
public CustomStack(int size){
this.data=new int[size];
}
public void push(int ele) throws Exception{
    if(isFull()){
        throw new Exception("Stack is Full");
        
    }
data[++ptr]=ele;
}
public int remove()throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is Empty");
    }
    int temp = data[ptr];
    ptr--;
    return temp;
}
public int peek(){
return data[ptr];
}
public boolean isFull(){
    if(ptr==data.length-1){
        return true;
    }
    return false;
}
public boolean isEmpty(){
    if(ptr==-1){
        return true;
    }
    return false;
}
 
}
