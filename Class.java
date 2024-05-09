public class Class {
\// Parent class
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Calling methods of Animal class
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        // Calling methods of Dog and Cat class
        dog.bark();
        cat.meow();
    }
}
v
}
