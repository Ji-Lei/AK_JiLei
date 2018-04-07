package MySelfWork;

import java.util.Scanner;
/**
 * Created by ${纪雷} on 2018/3/29.
 */
class People1 {
    String name;
    int age;
    public void tell(){
        System.out.println("我是"+name+"，今年"+age+"岁了");
    }
}
public class PeopleC {
    public static void main(String[] args) {
        People1 p1=new People1();
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
            p1.name=cin.next();
            p1.age=cin.nextInt();
            p1.tell();
        }
    }
}
