import java.util.List;

public class Leet152 {
    public static void main(String[]args){
        int[] arr={2, 3, -2, 4};
        int nums=maxProduct(arr);
        System.out.println(nums);

    }

    private static int maxProduct(int[] arr) {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int r=Integer.MIN_VALUE;
            int k=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int rr=r;
                rr=Math.max(rr,k*arr[j]);
                if(rr<r)
                    break;
                else
                    r=Math.max(r,rr);
            }
            result=Math.max(result, r);
        }
        return result;
    }
}
