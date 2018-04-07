package MySelfWork;

/**
 * Created by ${纪雷} on 2018/3/30.
 */
import ClassWork.Triangle;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner cin1=new Scanner(System.in);
        Triangle cin=new Triangle();
        int x=cin1.nextInt();
        int y=cin1.nextInt();
        int z=cin1.nextInt();
        cin.setSides(x,y,z);
        System.out.println(cin.getArea());
    }
}
