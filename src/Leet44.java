import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Leet44 {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        boolean result=true;


        for(int i=0;i<p.length();i++){

        }


        if(p.charAt(0)!=s.charAt(0)&&p.charAt(0)!='*'&&p.charAt(0)!='?')
            result=false;
        else if(p.charAt(p.length()-1)!=s.charAt(s.length()-1)&&p.charAt(p.length()-1)!='*'&&p.charAt(p.length()-1)!='?')
            result=false;
        else {
            outerfor:
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) != '*'&&p.charAt(i)!='?') {
                    for(int j=0;j<s.length();j++){
                        if(p.charAt(i)==s.charAt(j)) {
                            s = s.substring(j);
                            break;
                        }
                        if(j==s.length()-1){
                            result=false;
                            break outerfor;
                        }
                    }

                }
                else{
                    result=true;

                }
            }
        }
        System.out.println(result);
    }
}
