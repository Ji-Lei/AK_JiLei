package JavaWeb;

import java.util.Scanner;

/**
 * Created by 纪雷 on 2019/3/18.
 */
public class 最简单的编程2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] ji = new int[26];
        String b = cin.nextLine();
        while (!b.contains("%%%")) {

            char a[] = b.substring(0, 1).toCharArray();//将b里面的前两个元素转化成单个字符存储到a字符数组里
            ji[a[0] - 97] = Integer.parseInt(b.substring(4));//取十进制整数
            b = cin.nextLine();
        }
        while (cin.hasNext()) {
            String str = cin.nextLine().replaceAll(" ", "");
            char mp[] = str.toCharArray();
            int sum = 0;
            for (int i = 1; i < mp.length - 1; i++) {
                if (mp[i] == '*') {
                    sum += ji[mp[i - 1] - 97] * ji[mp[i + 1] - 97];
                    mp[i - 1] = '0';
                    mp[i + 1] = '0';
                    mp[i] = '+';
                }
            }
            for (int i = 1; i < mp.length - 1; i++) {
                int p=0, q = 0;
                if (mp[i] == '+') {
                    if (mp[i - 1] >= 'a' && mp[i - 1] <= 'z') {
                        p = ji[mp[i - 1] - 97];
                    } else {
                        p = Integer.parseInt(mp[i - 1] + "");
                    }
                    if (mp[i + 1] >= 'a' && mp[i + 1] <= 'z') {
                        q = ji[mp[i + 1] - 97];
                    } else {
                        q = Integer.parseInt(mp[i + 1] + "");
                    }
                    sum += p + q;
                    mp[i - 1] = '0';
                    mp[i + 1] = '0';
                } else if(mp[i]=='-'){
                    if (mp[i - 1] >= 'a' && mp[i - 1] <= 'z') {
                        p = ji[mp[i - 1] - 97];
                    } else if(mp[i-1]=='0') {
                        p = Integer.parseInt(String.valueOf(mp[i - 1]));
                    }
                    if (mp[i + 1] >= 'a' && mp[i + 1] <= 'z') {
                        q = ji[mp[i + 1] - 97];
                    } else if(mp[i-1]=='0') {
                        q = Integer.parseInt(String.valueOf(mp[i + 1]));
                    }
                    sum += p - q;
                    mp[i - 1] = '0';
                    mp[i + 1] = '0';
                }
            }

            System.out.println(sum);
        }
    }


}

