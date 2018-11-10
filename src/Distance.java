public class Distance {

    public static void main(String[] args) {

        double km= 150;
        double miles = km2Landmiles(150.0);
        System.out.println(km +  "KM sind " + miles + "Meilen");

        miles= 67.0;
        km = landmiles2km(miles);
        System.out.println(miles +  "Meilen sind " + km + "KM");
    }

    public static double km2Landmiles(double km) {

        double miles = km * 0.6124;
        return miles;
    }


    public static double landmiles2km(double miles) {

         return miles / 0.6124;
   }
}
