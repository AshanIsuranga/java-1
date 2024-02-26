class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

/*
 * we can override concrete methods in subclasses by extending the super class
 * which have the method
 */
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverrideExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
}
// khkhfkahksfkfuskh