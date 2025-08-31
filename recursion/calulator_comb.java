import java.util.ArrayList;

public class calulator_comb {
    public static void main(String[] args) {
        ArrayList<String> list =permutepad2("12","");
        System.out.println(list);

    }
    static void permutepad(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = s.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            permutepad(s.substring(1),ans+ch);
        }

    }
    static ArrayList<String> permutepad2(String s,String ans){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = s.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(permutepad2(s.substring(1),ans+ch));
        }
    return list;
    }
}
