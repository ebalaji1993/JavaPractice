class Animal {
    String color = "Blue";
}

class Dog extends Animal {

    String color = "Black";

    void getcolor() {

        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperDemo {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.getcolor();
    }
}