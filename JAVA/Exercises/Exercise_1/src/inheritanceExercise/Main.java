package inheritanceExercise;

import java.util.Scanner;

class Animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("DOG makes :  bark");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("CAT makes :  meow");
    }
}
class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("COW makes :  maw");
    }
}
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
    /*🔐 Rules:

    Create a base class Animal with a method makeSound().

    Create subclasses Dog, Cat, and Cow, each overriding the makeSound()
    method with an appropriate sound for each animal.

    Display the sound each animal makes when its makeSound() method is called.



            🧱 Requirements:

    Prompt the user to choose an animal from the list (e.g., Dog, Cat, Cow).

    Based on the choice, instantiate the appropriate class and call its makeSound() method.

    Display the sound made by the animal.*/
}
