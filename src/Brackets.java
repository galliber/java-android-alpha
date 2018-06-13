import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for(String s:getAllBracketCombinations(str,n)){
            System.out.println(s);
        }
    }

    public static HashSet<String> getAllBracketCombinations(String str, int n) {
        HashSet<String> hash = new HashSet<>();
        if (str.length() == n) {
            hash.add(str);
            return hash;
        }
        else {
            HashSet<String> hs = getAllBracketCombinations(str + "()", n);
            hash.addAll(hs);
            hs = getAllBracketCombinations(("(" + str + ")"), n);
            hash.addAll(hs);
            hs = getAllBracketCombinations("()" + str, n);
            hash.addAll(hs);
            return  hash;

        }

    }


}
