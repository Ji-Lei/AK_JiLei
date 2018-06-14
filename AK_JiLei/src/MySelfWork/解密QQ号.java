package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/6/10.
 */
public class 解密QQ号 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=a[i];
            for (int j = i+1; j < n; j++) {
                a[j-1]=a[j];
                if(j==n-1)a[j]=a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
        cin.close();
    }
}
