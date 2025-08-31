import java.util.Arrays;

public class string_ch_rem {
    public static void main(String[] args) {
        String s = " abdisfdaafapplefisafeapp";
//        char [] d = s.toCharArray();
//       String dm = s.chars().forEach(ch->((char)ch+" "));
        System.out.println(s.endsWith("ap"));
//        String [] d = s.split(" ");
//        System.out.println(Arrays.toString(d));

//        System.out.println(skipapp(s));
    }
static  void skip(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            skip(s.substring(1),ans);
        }else{
            skip(s.substring(1),ans+ch);
        }

}

    static  String skip1(String s){
        if(s.isEmpty()){

            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
           return skip1(s.substring(1));
        }
            return ch +  skip1(s.substring(1));


    }  static  String skipis(String s){
        if(s.isEmpty()){

            return "";
        }

        if(s.startsWith("is")){
            return skipis(s.substring(2));
        }
        return s.charAt(0) +skipis(s.substring(1));


    }
    static  String skipapp(String s){
        if(s.isEmpty()){

            return "";
        }

        if(s.startsWith("app")&& !s.startsWith("apple")){
            return skipapp(s.substring(3));
        }
        return s.charAt(0) +skipapp(s.substring(1));


    }


}