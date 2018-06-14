package MyJavaTest;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            int c=cin.nextInt();
            int[][] x=new int[c][2];
            char[][] y=new char[a+2][b+2];

            for(int i=0;i<=a+1;i++){
                for(int j=0;j<=b+1;j++){
                    y[i][j]='0';
                }
            }
            for(int i=0;i<c;i++){
                x[i][0]=cin.nextInt();
                x[i][1]=cin.nextInt();
                y[x[i][0]+1][x[i][1]+1]='*';
            }
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    if(y[i-1][j-1]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i-1][j]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i-1][j+1]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i][j-1]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i][j+1]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i+1][j+1]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i+1][j]=='*'&&y[i][j]!='*')y[i][j]++;
                    if(y[i+1][j-1]=='*'&&y[i][j]!='*')y[i][j]++;
                }
            }
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    System.out.print(y[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
