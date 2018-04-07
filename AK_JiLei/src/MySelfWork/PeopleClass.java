package MySelfWork;

/**
 * Created by ${纪雷} on 2018/3/22.
 */
public class PeopleClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s = new Student("s1");
        s.work();
        Teacher t = new Teacher("t1");
        t.work();
    }
}
class People{
    private String name;
    private Integer age=20;

    public People(String name, Integer age){
        System.out.println("A1");
        this.name = name;
        this.age = age;
    }

    public People(String name){
        System.out.println("A2");
        this.name = name;
        new People(name, age);
    }

    public void work(){
        System.out.println("A work");
    }
}

class Teacher extends People{
    public Teacher(String name){
        super(name);
    }

    public void work(){
        System.out.println("T are teach");
    }
}

class Student extends People{
    public Student(String name){
        super(name);
    }

    public void work(){
        System.out.println("Student are teach");
    }
}
