public class LogicCompareOperators {

    public static void main(String[] args) {

        int num1 = 67;
        int num2 = 33;

        System.out.println(num1 + "<" + num2 + ": " + (num1 <num2) );
        System.out.println(num1 + "=" + num2 + ": " + (num1 ==num2) );
        System.out.println(num1 + ">" + num2 + ": " + (num1 >num2) );

        int num3 = 40;

        boolean check1 = (num1 < num2) && (num3 < 100);

        System.out.println("check1 = " + check1);

    }
}
