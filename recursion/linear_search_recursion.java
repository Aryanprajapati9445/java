import java.util.ArrayList;

public class linear_search_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
//        System.out.println(search1(target,arr,0));
        search2(target,arr,0);
        System.out.println(list);
    }
    static boolean search(int target,int []arr,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target|| search(target,arr,i+1);
    }
    static int search1(int target,int []arr,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
       return search1(target,arr,i+1);
    }
    static ArrayList<Integer> list=new ArrayList<>();

    static void search2(int target, int []arr, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
            search2(target, arr, i + 1);
        }
    }

}
