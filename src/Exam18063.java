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
        Stack<BigInteger> al=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            if(Character.isDigit(c))
                sb.append(c);
            else{
                if(c!='('&&c!=')')
                    operators.push(c);
                if(sb.length()>0) {
                    al.push(new BigInteger(sb.toString()));
                    sb = new StringBuilder();
                }
            }

        }
        if(sb.length()!=0)
            al.push(new BigInteger(sb.toString()));


        BigInteger bigInt=al.pop();
        while (!al.empty()){
            char o=operators.pop();
            BigInteger next=al.pop();
            if(al.empty()&&!operators.empty())
                next=BigInteger.ZERO.subtract(next);
            if(o=='+') {
                bigInt=bigInt.add(next);
            }
            else if(o=='-') {
                bigInt=BigInteger.ZERO.subtract(bigInt);
                bigInt=bigInt.add(next);
            }
            else {
                bigInt=bigInt.multiply(next);
            }
        }

        System.out.println(bigInt);


    }
}