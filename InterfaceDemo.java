interface A {
    void m1();
}

class B implements A {
    public void m1() {
        System.out.println("One");
    }
}

class InterfaceDemo {

    public static void main(String[] args) {

        B b = new B();
        b.m1();
        System.out.println(b);
    }
}