import java.util.*;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makesound() {
        System.out.println("Animals make sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Jack", 12);
        Animal cat = new Cat("Jill", 2);
        Animal bird = new Bird("Juck", 13);

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            System.out.print(animal.name + " says: ");
            animal.makesound();
        }
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    
    public void makesound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    
    public void makesound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    
    public void makesound() {
        System.out.println("Chirp");
    }
}
