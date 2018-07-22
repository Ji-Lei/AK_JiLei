package MySelfWork;


import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/3/25.
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[][] a=new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i)a[i][j]=1;
                else a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int x=cin.nextInt();
        int y=cin.nextInt();
        System.out.println(a[x-1][y-1]);
    }
}
