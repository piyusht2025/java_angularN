package p1;
class student1 {
    public String name;
    public int roll;
    public double m1;
    public double m2;
    public double m3;
    public double m4;
    public double totalMarks(){
        return this.m1+this.m2+this.m3+this.m4;
    }
    public double average(){
        return this.totalMarks()/4;
    }
    public String toString(){
        return "THIS IS THE OBJECT REFERENCE";
    }
}
public class student {
    public static void main (String[] args){
        student1 s1=new student1();
        s1.m1=10;
        s1.m2=20;
        s1.m3=30;
        s1.m4=40;
        double total=s1.totalMarks();
        System.out.println("Total marks ="+total);
        System.out.println(s1);
     }
}


