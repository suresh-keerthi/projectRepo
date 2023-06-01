package mypackage;

abstract class Animal {
    String gene = "animal";
    static int limbs=4;
    static void eat() {
        System.out.println("animal eats");
    }

    static void fuck()
    {
        System.out.println("animal fucks");
    }




    public abstract void makeSound();

}

class Dog extends Animal {
    String name = "dog";

    public void makeSound() {
        System.out.println("Dog barks");
    }

    static void eat() {
        System.out.println("dog eats");
    }

}

class Cat extends Animal {
    String name = "cat";

    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Experiment {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();  // Output: Dog barks
        animal2.makeSound();  // Output: Cat meows

        Cat newcat  =new Cat();
        Cat.limbs=5;
        Cat.fuck();

        System.out.println(animal1.getClass());
    }

}
