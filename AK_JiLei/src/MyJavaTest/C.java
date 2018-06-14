package MyJavaTest;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            BigInteger s=new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                s=s.multiply(BigInteger.valueOf(i));
            }
            System.out.println(s);
        }
    }
}