import java.util.Random;
public class Main {
   static Random r= new Random();
    static String generate(int size){
        StringBuffer ans =new StringBuffer();
        for(int i=0;i<size;i++){
            int random = 97+r.nextInt(26);
            
            ans.append((char)random);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer();
        // sb.append("Stringbuffer");
        // System.out.println(sb.capacity());
        // StringBuffer o2=new StringBuffer("aryan");
        // StringBuffer o3=new StringBuffer(30);
        // // String str = sb.toString();
        // sb.append("str");
        // sb.insert(3,"");
        // sb.replace(2,3, "cjkndjncd");
        // System.out.println(sb);
        // System.out.println(sb.capacity());
        // System.out.println(generate(58));
        // System.out.println(r.nextInt());
        // System.out.println(Math.random());
        String sent ="fmvrk rfkcmr k ef";
        System.out.println(sent);
        System.out.println(sent.replaceAll("\\s", ""));
       
         
    }


}
// mutable & set of character