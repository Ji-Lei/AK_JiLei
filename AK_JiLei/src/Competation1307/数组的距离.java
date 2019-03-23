package Competation1307;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/20.
 */
public class 数组的距离 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        for (int i = 0; i < m; i++) {
            a[i]=cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=cin.nextInt();
        }
        int sum;
        if(a[0]-b[0]>0)sum=a[0]-b[0];
        else  sum=b[0]-a[0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i]-b[j]<=0&&b[j]-a[i]<sum)sum=b[j]-a[i];
               else if(a[i]-b[j]>=0&&a[i]-b[j]<sum)sum=a[i]-b[j];
            }
        }
        System.out.println(sum);
        cin.close();
    }
}
