package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/6/10.
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str1 = cin.next();
            String str2 = cin.next();
            Demo1 d = new Demo1();
            Object[] result = d.deleteSubString(str1, str2);
            int a = ((String) (result[0])).length();
            System.out.println(a);//删除后长度
            if (a != 0)
                System.out.println(result[0]);//删除子串后
            else
                System.out.println("null");
        }
    }


    public Object[] deleteSubString(String str1, String str2) {
        StringBuffer sb = new StringBuffer(str1);
        int delCount = 0;
        Object[] obj = new Object[2];

        while (true) {
            int index = sb.indexOf(str2);
            if (index == -1) {
                break;
            }
            sb.delete(index, index + str2.length());
            delCount++;
        }
        if (delCount != 0) {
            obj[0] = sb.toString();
            obj[1] = delCount;
        } else {
            //不存在返回-1
            obj[0] = -1;
            obj[1] = -1;
        }
        return obj;
    }
}

