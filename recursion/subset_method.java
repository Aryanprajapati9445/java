import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_method {
    public static void main(String[] args) {
        int []arr = {1,1,2,2};

      ArrayList< ArrayList<Integer>> list= subset3(arr);
        for (ArrayList<Integer> l : list) {
            System.out.println(l);
        }

    }
    static void subset(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans );
            return;
        }
        char ch = s.charAt(0);
        subset(s.substring(1),ans+ch);
        subset(s.substring(1),ans);

    }
    static ArrayList<String> subset1(String s,String ans,ArrayList<String> list){
        if(s.isEmpty()){
            list.add(ans);
            return list;
        }
        char ch = s.charAt(0);
        subset(s.substring(1),ans+ch);
        subset(s.substring(1),ans);
    return list;
    }
    static ArrayList<String> subsetret(String s,String ans){
        if(s.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(ans);
            return l;

        }
        char ch = s.charAt(0);
        ArrayList<String> left = subsetret(s.substring(1),ans+ch);
       ArrayList<String> right= subsetret(s.substring(1),ans);
       left.addAll(right);
       return left;
    }
    static ArrayList<ArrayList<Integer>> subset3(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));

                internal.add(num);
                int sum = 0;
                int k = 0;
                while (k < internal.size()) {
                    sum += internal.get(k);
                    k++;
                }
                if(sum%2==0){

                outer.add(internal);
                }
            }
        }

        return outer;
    }
    static ArrayList<ArrayList<Integer>> subsetduplicate(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end =0;
        for (int j=0;j<arr.length;j++) {

        if(j>0&&arr[j]==arr[j-1]){
            start=end+1;
        }

            int n = outer.size();

            for (int i = start; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));

                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
