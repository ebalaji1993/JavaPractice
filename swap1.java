import java.util.*;

public class swap1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;// a=30
        b = a - b;// b=10
        a = a - b;// a=20

        System.out.println(a + " " + b);

    }
}