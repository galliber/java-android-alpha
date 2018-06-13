import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TargetSum {
    public static void fakeInput(){
        String str="3\n" +
                "1 1 1 1 1";
        System.setIn(new ByteArrayInputStream(str.getBytes()));
    }
    public  static void main(String[] args){
        fakeInput();
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        sc.nextLine();
        String[] arr=sc.nextLine().split(" ");
        int[] iarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            iarr[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(recursiveSum(0,iarr,sum, 0));

    }
    public static int recursiveSum(int index, int[] arr, int target, int curTarget){

        if(index==arr.length) {
            if (target == curTarget)
                return 1;
            return 0;
        }


        int count=0;

        count+=recursiveSum(index+1, arr, target, curTarget+arr[index] );
        count+=recursiveSum(index+1, arr, target, curTarget-arr[index]);
        return count;


    }
}







