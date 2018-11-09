public class MethodDemo {

    public static void main(String[] args) {

        printSum(3,5,8);
        printSum(4,6,10);
        printSum(10,-20,50);
        int result = calculateSum(5,9,-3);
        System.out.println("result = " + result);

    }

    public static void printSum(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
    }

    public static int calculateSum(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum;
    }


}
