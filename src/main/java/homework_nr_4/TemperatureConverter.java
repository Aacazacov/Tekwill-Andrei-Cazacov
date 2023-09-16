package homework_nr_4;
public class TemperatureConverter {
    double inCelsius;
    double inFahrenheit;
    public static void main(String[] args) {
        double inCelsius1 = 10.0;
        double inFahrenheit1 = 50.0;

           double inCelsiusX = 20.0;
           double inFahrenheitY = 25.0;

        System.out.print(inCelsius1 + " градусов Цельсия = ");
        System.out.println(toFahrenheit(inCelsius1) + " градусам Фаренгейта");

        System.out.print(inFahrenheit1 + " градусов Фаренгейта = ");
        System.out.println(toCelsius(inFahrenheit1) + " градусам Цельсия");
        System.out.println("----------------------");

           TemperatureConverter CelciusVsFahrenheir = new TemperatureConverter(inCelsiusX, inFahrenheitY);
           CelciusVsFahrenheir.toFahrenheit(inCelsiusX);
           CelciusVsFahrenheir.toCelsius(inFahrenheitY);
              System.out.print(inCelsiusX + " градусов Цельсия = ");
              System.out.println(toFahrenheit(inCelsiusX) + " градусам Фаренгейта");
              System.out.print(inFahrenheitY + " градусов Фаренгейта = ");
              System.out.println(toCelsius(inFahrenheitY) + " градусам Цельсия");
    }
    public static double toFahrenheit(double inCelsius1) {
        return inCelsius1 * 1.8 + 32;
    }
    public static double toCelsius(double inFahrenheit1) {
        return (inFahrenheit1 - 32) / 1.8;
    }
    public TemperatureConverter(double inCelsius, double inFahrenheit){
        this.inCelsius = inCelsius;
        this.inFahrenheit = inFahrenheit;
    }
}
