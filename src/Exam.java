import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = sc.nextLine();
        if(str.charAt(0)=='-');
            str=str.substring(1);
        StringBuilder sb = new StringBuilder();
        StringBuilder res=new StringBuilder();
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        String in = sb.toString();
        for (int i = 0; i < in.length(); i++) {
            if ((i + 1) % 2 == 0) {
                result += Math.pow(Character.getNumericValue(in.charAt(i)), 2) * (i + 1);
            }
            if ((i + 1) % 2 == 1) {
                result += Math.pow((i + 1), 2) * Character.getNumericValue(in.charAt(i));
            }
        }
        System.out.println(result);
        if(result%10==0)
            System.out.println("Big Vik wins again!");
        else{
            for(int i=0;i<result%10;i++){
                res.append(alphabet.charAt((result%26+i)%alphabet.length()));
            }

            System.out.println(res);
        }
    }
}
