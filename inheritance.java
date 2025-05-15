// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(
