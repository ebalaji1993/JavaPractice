abstract class vehical {
    abstract void show();
}

class Car extends vehical {
    void show() {
        System.out.println("1");
    }
}

class Scooter extends vehical {
    void show() {
        System.out.println("2");
    }
}

class abstract1 {
    public static void main(String[] args) {
        Car cobj = new Car();
        cobj.show();
        Scooter sc = new Scooter();
        sc.show();
    }
}
