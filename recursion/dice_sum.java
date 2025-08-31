public class dice_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
   no_of_ways("",4);

    }
    static void no_of_ways(String p,int n){
        if(n==0){
            System.out.println(p);
        }
        int count =0;
        for(int i=1;i<=6&&i<=n;i++){
            no_of_ways(p+i,n-i);
        }
    }
}

