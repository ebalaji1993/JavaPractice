class pattern2 {
    public static void main(String[] args) {

        int i, j, n = 5, k;
        for (i = 0; i < n; i++) {
            for (k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
