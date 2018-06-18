import java.util.Scanner;

public class Exam18062 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        sc.nextLine();
        int[] startPos=new int[2];
        int[][] field=new int[row][col];
        for(int i=0;i<row;i++){
            String[] str=sc.nextLine().split(" ");
            for(int j=0;j<col;j++){
                field[i][j]=Integer.parseInt(str[j]);
                if(field[i][j]==0){
                    startPos[0]=i;
                    startPos[1]=j;
                }
            }
        }
        int[] curPos=startPos;
        int count=0;

        while(true){
            int left;
            if(curPos[1]-1>=0)
                left=field[curPos[0]][curPos[1]-1];
            else
                left=0;
            int right;
            if(curPos[1]+1<col)
                right=field[curPos[0]][curPos[1]+1];
            else
                right=0;

            int up;
            if(curPos[0]-1>=0)
                up=field[curPos[0]-1][curPos[1]];
            else
                up=0;
            int down;
            if(curPos[0]+1<row)
                down=field[curPos[0]+1][curPos[1]];
            else
                down=0;
            int[] leftPos={curPos[0], curPos[1]-1};
            int[] rightPos={curPos[0], curPos[1]+1};
            int[] upPos={curPos[0]-1, curPos[1]};
            int[] downPos={curPos[0]+1, curPos[1]};
            int maxNextPos=Math.max(Math.max(Math.max(left, right), up), down);
            if(maxNextPos<1)
                break;
            if(maxNextPos==left){
                field[leftPos[0]][leftPos[1]]-=1;
                curPos=leftPos;
                count++;
                continue;
            }
            else if(maxNextPos==right){
                field[rightPos[0]][rightPos[1]]-=1;
                curPos=rightPos;
                count++;
                continue;
            }
            else if(maxNextPos==up){
                field[upPos[0]][upPos[1]]-=1;
                curPos=upPos;
                count++;
                continue;
            }
            else if(maxNextPos==down){
                field[downPos[0]][downPos[1]]-=1;
                curPos=downPos;
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
