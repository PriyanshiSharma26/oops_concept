//Create an abstract class Animal with an abstract method makeSound(). Create subclasses Dog and Cat that implement the makeSound() method.//
abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound()
    {
        System.out.println(" dog isbarking");
    }
}


class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("meow");
    }
}

class main_3
{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.makeSound();
        Cat c1=new Cat();
        c1.makeSound();
    }
}