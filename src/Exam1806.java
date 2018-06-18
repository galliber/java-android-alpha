import java.util.ArrayList;
import java.util.Scanner;

public class Exam1806 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(",");
        ArrayList<Integer> al=new ArrayList();
        ArrayList<Integer> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(String s:str)
            al.add(Integer.parseInt(s));
        for(int i=1;i<=al.size();i++){
            if(al.contains(i))
                continue;
            else
                result.add(i);
        }
        if(result.size()>=1) {
            for (int i = 0; i < result.size() - 1; i++) {
                System.out.print(result.get(i) + ",");
            }
            System.out.println(result.get(result.size() - 1));
        }
        else
            System.out.println();
    }
}
