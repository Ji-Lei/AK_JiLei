package MySelfWork;


import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/3/30.
 */
class People2{
     private String name;
     private int age;
     public void setName(String name){
          this.name=name;
     }
     public void setAge(int age){
          this.age=age;
     }
     public String getName(){
          return this.name;
     }
     public int getAge(){
          return this.age;
     }
     public void tell(){
          System.out.println("I'm "+this.name+" And I'm "+this.age);
     }
}
public class PeopleB {
     public static void main(String[] args) {
          People2 p1=new People2();
          Scanner b=new Scanner(System.in);
          while (b.hasNext()) {
               p1.setName(b.next());
               p1.setAge(b.nextInt());
               p1.tell();
          }
     }
}
