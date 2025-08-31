public class circular_array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=1;
        System.out.println(search2(target,arr,0,arr.length-1));
    }
    static int search2(int target,int[] arr,int s,int e){
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(target==arr[m]){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target<=arr[m]&&target>=arr[s]){
                return search2(target,arr,s,m-1);
            }else{
                return search2(target,arr,m+1,e);
            }
        }
        if(target>=arr[m]&&target<=arr[e]){
            return search2(target,arr,m+1,e);
        }
        return search2(target,arr,s,m-1);

    }
}
