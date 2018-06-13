import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rows = Integer.parseInt(sc.nextLine());
        int Cols = 0;
        int[][] matrix = new int[Rows][];
        for (int i = 0; i < Rows; i++) {
            String[] splitt = sc.nextLine().split(" ");
            matrix[i] = new int[splitt.length];
            for (int j = 0; j < splitt.length; j++) {
                matrix[i][j] = Integer.parseInt(splitt[j]);
            }
        }
        String[] rc = sc.nextLine().split(" ");
        int index = 0;
        int[][] pairs = new int[rc.length / 2][2];
        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < 2; j++) {
                pairs[i][j] = Integer.parseInt(rc[index]);
                index++;
            }

        }
        Cols = matrix[0].length;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<pairs.length;i++){
            boolean startRowB=true;
            boolean endColB=true;
            if(pairs[i][0]<0)
                startRowB=false;
            else if(pairs[i][1]>0)
                startRowB=true;
            else
                continue;
            if(pairs[i][1]>0)
                endColB=true;
            else if(pairs[i][1]<0)
                endColB=false;
            else
                continue;
            int startRow=Math.abs(pairs[i][0])-1;
            int endCol=Math.abs(pairs[i][1])-1;
            int sum=0;
            if(startRowB){
                for (int j=0;j<=endCol;j++){
                    sum+=matrix[startRow][j];
                }
            }
            else {
                for(int j=Cols-1;j>=endCol;j--){
                    sum+=matrix[startRow][j];
                }
            }
            if(endColB){
                for(int j=startRow-1;j>=0;j--)
                    sum+=matrix[j][endCol];
            }
            else{
                for(int j=startRow+1;j<Rows;j++)
                    sum+=matrix[j][endCol];
            }
            result=Math.max(result, sum);
        }
        System.out.println(result);
    }
}