public class StringDemo1 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s1;
        String s4 = s2;

        if (s1 == s2) {
            System.out.println("in block 1");
        }

        if (s1 == s4) {
            System.out.println("in block 2");
        }

        if (s1.equals(s2)) {
            System.out.println("in block 3");
        }

        if (s1.equals(s4)) {
            System.out.println("in block 4");
        }

        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

    }
}
