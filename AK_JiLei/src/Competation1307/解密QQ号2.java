package Competation1307;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/20.
 */
public class 解密QQ号2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] a=new int[n*2];
        for (int i = 0; i < n; i++) {
            a[i]=cin.nextInt();
        }
        int m=n;
        for (int i = 0; i < n*2; i++) {
            System.out.print(a[i]+" ");
            i++;
            if(i==n*2)break;
            a[m]=a[i];
            m++;
        }
        cin.close();
    }
}
