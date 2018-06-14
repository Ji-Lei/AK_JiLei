package MyJavaTest;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            long a=cin.nextLong();
            long b=cin.nextLong();
            long c=cin.nextLong();
            long d=a/c;
            long e=b/c;
            System.out.println(d*e);
        }
    }
}
