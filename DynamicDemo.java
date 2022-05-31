class DynamicDemo {

    void eat() {

        System.out.println("Animal is Eating");
    }
}

class Dog extends DynamicDemo {
    void eat() {
        System.out.println("Dog is Eating");
    }

    public static void main(String[] args) {

        DynamicDemo d1 = new Dog();
        d1.eat();
        // System.out.println(d1);
    }
}
