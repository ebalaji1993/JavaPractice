interface I1 {
    void show();
}

interface I2 {
    void display();
}

class interfaceDemo implements I1, I2 {
    public void show() {
        System.out.println("A");
    }

    public void display() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        interfaceDemo i1 = new interfaceDemo();
        i1.show();
        i1.display();
    }
}
