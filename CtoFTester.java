public class CtoFTester {
  public static double celsiusToFahrenheit (double C) {
    return C * 1.8 + 32;
  }
  public static double fahrenheitToCelsius (double F) {
    return (F - 32) / 1.8;
  }
  public static void main (String [] args) {
    System.out.println (celsiusToFahrenheit (0) );
    System.out.println (celsiusToFahrenheit (100) );
    System.out.println (celsiusToFahrenheit (52) );
    System.out.println (fahrenheitToCelsius (0) );
    System.out.println (fahrenheitToCelsius (100) );
    System.out.println (fahrenheitToCelsius (52) );
  }
}
