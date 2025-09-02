package inheritanceExercise;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 for DOG , 2 for CAT, 3 for COW");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        Animal animal;
        if (a ==1) {
             animal = new Dog();
        }
        else if (a==2) {
             animal = new Cat();
        }
        else{
             animal = new Cow();
        }
        animal.makeSound();
    }

}
