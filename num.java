
import java.util.*;

class num {
    public static void main(String args[]) {
        // int num=10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is odd");
        }
    }
}