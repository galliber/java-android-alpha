import java.util.HashSet;
import java.util.Scanner;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(", ");
        int[] iarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            iarr[i] = Integer.parseInt(arr[i]);
        }
//
//
//        int index = 0;
//        int count = 1;
//        int result = 0;
//        for(int start=0;start<iarr.length;start++) {
//            index=start;
//            int step = 1;
//            while (step < iarr.length) {
//                if (iarr[index] < iarr[(index+step)%iarr.length]) {
//                    count++;
//                    result = Math.max(result, count);
//                    index=(index+step)%iarr.length;
//                } else {
//                    index = start;
//                    count = 1;
//                    step++;
//                }
//
//            }
//        }
//        System.out.println(result);
        System.out.println(biggestArea(iarr));
    }
    public static int biggestArea(int[] arr){
        if(arr.length==1)
            return arr[0];
        if(arr.length==0)
            return 0;
        int min=arr[0];
        int indexOfMin=0;
        for(int i=1;i<arr.length;i++){
            int curMin=min;
            min=Math.min(min,arr[i]);
            if(min!=curMin)
                indexOfMin=i;
        }
        int[] arrBeforeMin=new int[indexOfMin];
        int[] arrAfterMin=new int[arr.length-1-indexOfMin];
        for(int i=0;i<arrBeforeMin.length;i++){
            arrBeforeMin[i]=arr[i];
        }
        int i=0;
        for(int j=indexOfMin+1;j<arrAfterMin.length;j++,i++){
            arrAfterMin[i]=arr[j];
        }
            return Math.max(min*arr.length, Math.max( biggestArea(arrAfterMin), biggestArea(arrBeforeMin)));

    }
}
