import java.util.HashSet;
import java.util.Scanner;

public class GenerateAllPermutationsOfAnArray {
    static HashSet<Integer[]> hs=new HashSet<>();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    }



    public static HashSet<Integer[]> getAllPermutationsOfAnArray(Integer[] arr, int n){
        if(arr.length==n) {
            hs.add(arr);
            return hs;
        }



        return hs;

    }


}
