import javax.swing.AbstractAction;

abstract class AbstractDemo {
    abstract void start();
}

class Car extends AbstractDemo {

    void start() {
        System.out.println("car is start with key:");
    }
}

class Scoter extends AbstractDemo {

    void start() {
        System.out.println("scoter is start with kick");
    }

}

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scoter s = new Scoter();
        s.start();

    }
}