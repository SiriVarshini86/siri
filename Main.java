// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Accessing method of parent class
        myDog.eat();

        // Accessing method of child class
        myDog.bark();
    }
}

