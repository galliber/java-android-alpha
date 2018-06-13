import java.util.Scanner;

public class Exam4 {
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int target=sc.nextInt();
        System.out.println(rec(str,0,0,target));

    }

    static int rec(String numbers, int index, int curSum, int targetSum){
        if(index==numbers.length()){
            if(curSum==targetSum)
                return 1;
            return 0;
        }

        int count=0;
        int number=0;
        for(int i=index;i<numbers.length();i++){
            number*=10;
            number+=Character.getNumericValue(numbers.charAt(i));
            count+=rec(numbers, i+1, number, targetSum);
            //count+=rec(numbers, index+1, curSum-number, targetSum);
            //count+=rec(numbers, index+1, curSum*number, targetSum);
            if(number==0)
                break;


        }
        return count;
    }
}
