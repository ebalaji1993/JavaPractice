class fibo {
    public static void main(String[] args) {

        int num1 = 1, num2 = 1, i, num, count = 10;
        System.out.println(num1 + " \n" + num2);

        for (i = 1; i <= count; i++) {

            num = num1 + num2;
            System.out.println(num);

            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
    }
}