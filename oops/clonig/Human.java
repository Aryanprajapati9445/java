package clonig;

public class Human implements Cloneable{
int age;
String name;
int[] arr;
public Human(int age, String name) {
    this.age = age;
    this.name = name;
     this.arr = new int[]{3,23,4,4};
}
// public Human(Human human) {
//     this.age = human.age;
//     this.name = human.name;
   
// }
public Object clone() throws CloneNotSupportedException {
    // return super.clone();
    Human twin = (Human) super.clone();
    twin.arr =new int [twin.arr.length];
    for(int i=0;i<twin.arr.length;i++){
        twin.arr[i] = this.arr[i];
    }
    return twin;
}
}
