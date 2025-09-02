package p1;
class Student
{
    static int count =0;
    int roll;
    int age;
    String name;
    Student(String name , int age ){
        this.roll=++count;
        this.name=name;
        this.age=age;
    }
}
public class myapp {
    public static void main(String args[]){
        Student s1=new Student("Piyush",21);
        Student s2=new Student("Sarthak",22);
        System.out.println(s1.roll);
        System.out.println(s2.roll);

    }

}
