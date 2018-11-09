public class ScopeRules {

    public static void main(String[] args) {

        int valueA = 10;
        System.out.println(valueA);

        {
            valueA = 7;
            System.out.println("valueA = " + valueA);

            boolean valueB = true;
        }


    }

}
