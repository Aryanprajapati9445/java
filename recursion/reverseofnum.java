public class reverseofnum {
    public static void main(String[] args) {
        int n =3235;
//        rev2(n);
        System.out.println(rev1(n));
    }
    static int rev1(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
      static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return (int)(rem *Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }
  static int sum =0;
    static void rev2(int n){
     if(n==0) {
         return;
     }
        var rem = n%10;
        sum = sum*10+rem;
        rev2(n/10);

    }
}
