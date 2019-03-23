package 我要自学网;

/**
 * Created by ${纪雷} on 2019/3/12.
 */
public class 乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
