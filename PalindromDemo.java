class testpat {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j >= 3 - i; j++) {
                System.out.println(j);
            }
            System.out.println(" ");
        }
    }
}