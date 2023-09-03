package overridingtest;

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Dog barks");
    }
}

class Cat extends Dog{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Cat meows");
    }
}

public class OverridingTest {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
    
}
