package MyJavaTest;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb = new StringBuffer();
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i = 0; i <= n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n-1; i++){
                if(a[i] != 0){
                    sb.append(String.format("%sx^%d", Math.abs(a[i]) != 1 ? String.valueOf(a[i]) : String.valueOf(a[i]).replace("1", ""), n-i));
                }
                if(a[i+1] > 0)
                    sb.append("+");
            }

            if(a[n-1] != 0)
                sb.append(String.format("%sx", Math.abs(a[n-1]) != 1 ? String.valueOf(a[n-1]) : String.valueOf(a[n-1]).replace("1", "")));

            if(a[n] > 0)
                sb.append("+" + a[n]);
            else if(a[n] < 0)
                sb.append(a[n]);

            if(sb.charAt(0) != '+')
                System.out.println(sb);
            else
                System.out.println(sb.substring(1));
        }
        sc.close();
    }

}
