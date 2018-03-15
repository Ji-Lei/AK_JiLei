package 课下练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 纪雷 on 2017/9/26.
 */
public class 排序 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=cin.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        cin.close();
    }
}
