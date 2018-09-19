public class CtoFTester {
  public static double celsiusToFahrenheit (double C) {
    return C * 1.8 + 32;
  }
  public static void main (String [] args) {
    System.out.println (celsiusToFahrenheit (0) );
    System.out.println (celsiusToFahrenheit (100) );
    System.out.println (celsiusToFahrenheit (52) );
  }
}
