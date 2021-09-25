class CtoFTester{
  public static double celsiusToFahrenheit(double celsius){
    return (celsius * 1.8) + 32;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    return (fahrenheit - 32) / 1.8;
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(0)); // 32
    System.out.println(celsiusToFahrenheit(10)); //50
    System.out.println(celsiusToFahrenheit(105.5)); //221.9
    System.out.println(celsiusToFahrenheit(-22)); //-7.6
    System.out.println(celsiusToFahrenheit(-2.6)); //27.32

    System.out.println(fahrenheitToCelsius(5)); //-15
    System.out.println(fahrenheitToCelsius(32)); //0
    System.out.println(fahrenheitToCelsius(54.2)); //12.3333..
    System.out.println(fahrenheitToCelsius(-1)); //-18.3333..
    System.out.println(fahrenheitToCelsius(-150.6)); //-101.4444..
  }
}
