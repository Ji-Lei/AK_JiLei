package Competation1307;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/20.
 */
public class 数字统计 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >0 ; j/=10) {
                a[j%10]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
        cin.close();
    }
}
