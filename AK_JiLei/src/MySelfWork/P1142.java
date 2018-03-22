package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/3/22.
 */
public class P1142 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        while (cin.hasNext())
        {
            int n=cin.nextInt();
            int m=cin.nextInt();
            long a=1,b=1,c=1;
            for(int i=1;i<=n;i++)//求n的阶乘
                a=a*i;
            for(int j=1;j<=m;j++)//求m的阶乘
                b=b*j;
            for(int k=1;k<=n-m;k++)//求n-m的阶乘
                c=c*k;
            System.out.println(a/(b*c));
        }
        cin.close();
    }
}
