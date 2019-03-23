package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/23.
 */
public class OJ测试题 {


    public static void dfs(int step,int n) {
        int[] a=new int[10];
        int[] book=new int[10];
        for (int i = 0; i <= n; i++) {
            book[i]=0;
        }
        if (step==n+1){
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
         if(book[i]==0){
             a[step]=i;
             book[i]=1;
             dfs(step+1,n);
             book[i]=0;
         }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        dfs(1,n);
    }
}
