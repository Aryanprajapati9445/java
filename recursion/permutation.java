public class permutation {
    public static void main(String[] args) {
//permute("abc", "");
        String s = "abc";
//        System.out.println(s.substring(0,0 ));
        permute("12","");

    }
    static void permute(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String rem = s.substring(0,i)+s.substring(i+1);
            permute(rem,ans+s.charAt(i));
        }
    }

}
