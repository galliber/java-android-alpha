import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Exam3 {
    public static HashSet<String> hs=new HashSet<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cows=sc.nextInt();
      //  StringBuilder  sb=new StringBuilder();
        String A=String.valueOf(sc.nextInt());
        String B=String.valueOf(sc.nextInt());
        String ab=A+B;
        brute(ab, cows, new StringBuffer());
        ArrayList<String> al=new ArrayList<>(hs);
        Collections.sort(al);
        for(String s:al)
            System.out.println(s);
//        for(int i=0;i<cows;i++){
//            sb.append(A);
//        }
//
//
//        hs.add(sb.toString());
//        String str=sb.toString();
//        for(int i=0;i<str.length();i++){
//            for(int j=0;j<str.length();j++){
//                String temp=str;
//                str=str.substring(0,j)+B.charAt(0)+str.substring(j+1);
//                hs.add(str);
//                str=temp;
//            }
//            str=str.substring(0,i)+B.charAt(0)+str.substring(i+1);
//
//        }
//
//        str=sb.toString();
//        for(int i=str.length();i>0;i--){
//            for(int j=0;j<str.length();j++){
//                String temp=str;
//                str=str.substring(0,j)+B.charAt(0)+str.substring(j+1);
//                hs.add(str);
//                str=temp;
//            }
//            str=str.substring(0,i)+B.charAt(0)+str.substring(i+1);
//
//        }
//
//        for(String s:hs)
//            System.out.println(s);

    }

    static void brute(String input, int depth, StringBuffer output) {
        if (depth == 0) {
            hs.add(output.toString());
        } else {
            for (int i = 0; i < input.length(); i++) {
                output.append(input.charAt(i));
                brute(input, depth - 1, output);
                output.deleteCharAt(output.length() - 1);
            }
        }
    }

    public static void varAB(int index, String b, String str){
        if(index==0)
            System.out.println(str);
        else{
            for(int i=0;i<b.length();i++){
                str+=b.charAt(i);
                varAB(index-1,b, str );

            }
        }

    }
}
