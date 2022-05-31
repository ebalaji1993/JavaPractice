import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
import java.util.Collection.*;
import java.util.Iterator;

public class Main {
    public static int frequencyProduct(int N, String S) {

        // this is default OUTPUT. You can change it.
        int result = -404;
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < N; i++) {
            String key = S.charAt(i) + "";
            map.put(key + "", map.containsKey(key) ? map.get(key) + 1 : 1);
        }

        int sum = 1;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int a = entry.getValue();
            sum *= a;
        }
        System.out.println(sum);
        // write your Logic here:

        return result;
    }

    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        // OUTPUT [uncomment & modify if required]
        System.out.print(frequencyProduct(N, S));
        sc.close();
    }
}