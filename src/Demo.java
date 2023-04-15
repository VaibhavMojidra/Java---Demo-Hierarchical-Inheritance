class Animal {
  void eat() {
    System.out.println("eating...");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("barking...");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("meowing...");
  }
}

public class Demo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.eat();  // output: eating...
    dog.bark(); // output: barking...
    cat.eat();  // output: eating...
    cat.meow(); // output: meowing...
  }
}
