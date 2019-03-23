package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/12.
 */
public class 立方和不等式 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int m=cin.nextInt();
        int sum=0;
        int n;
        for (int i = 1;; i++) {
            sum=sum+i*i*i;
            if(sum>=m){
                n=i-1;
                break;
            }
        }
        System.out.println(n);
        cin.close();
    }
}
