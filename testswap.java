import java.util.*;

class testswap {
    public static void main(String[] args) {

        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("val of a:" + a + " val of b:" + b);

        temp = a;
        a = b;
        b = temp;

        // System.out.println(temp);
        System.out.println("val of a:" + a + " val of b:" + b);

    }
}
