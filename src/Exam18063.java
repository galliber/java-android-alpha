import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Exam18063 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        StringBuilder strsb=new StringBuilder();
        for(String s:str)
            strsb.append(s);
        char[] arr=strsb.toString().toCharArray();

        Stack<Character> operators=new Stack<>();
        Stack<Integer> al=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            if(Character.isDigit(c))
                sb.append(c);
            else{
                if(c!='('&&c!=')')
                    operators.push(c);
                if(sb.length()>0) {
                    al.push(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                }
            }

        }
        if(sb.length()!=0)
            al.add(Integer.parseInt(sb.toString()));

        int result=al.pop();

        BigInteger bigInt=BigInteger.valueOf(result);
        while (!al.empty()){
            char o=operators.pop();
            int next=al.pop();
            if(al.empty()&&!operators.empty())
                next*=-1;
            if(o=='+') {
                result += next;
                bigInt=bigInt.add(BigInteger.valueOf(next));
            }
            else if(o=='-') {
                result = (result * (-1)) + next;
                bigInt=BigInteger.ZERO.subtract(bigInt);
                bigInt=bigInt.add(BigInteger.valueOf(next));
            }
            else {
                result *= next;
                bigInt=bigInt.multiply(BigInteger.valueOf(next));
            }
        }

        System.out.println(bigInt);


    }
}