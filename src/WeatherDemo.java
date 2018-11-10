public class WeatherDemo {

    public static void main(String[] args) {

        //Das Wetter ist....= Parameter
        printWeatherText("sonnig");
        printWeatherText("wolkig");

        String weather = getWeatherText("neblig");
        System.out.println("weather = " + weather);

        weather= getWeatherText("regnerisch");
        System.out.println("weather = " + weather);

    }

    public static void printWeatherText(String weather) {

        System.out.println("Das Wetter ist " + weather);
    }

    public static String getWeatherText(String weather) {

        String WeatherText = "Das Wetter ist " + weather;
        return WeatherText;
    }
}
