import java.util.Arrays;

public class reverse_string {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s,0,s.length-1);
        System.out.println(Arrays.toString(s));

    }
   static void reverse(char[] s,int i,int n){
        if(i>=s.length/2){
            return;
        }
        char temp=s[i];
        s[i]=s[n];
        s[n]=temp;

        reverse(s,i+1,n--);

    }
}
