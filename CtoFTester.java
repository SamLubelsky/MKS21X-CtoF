class CtoFTester{
  public double celsiusToFahrenheit(double celsius){
    return (celsius * 1.8) + 32;
  }
  public double fahrenheitToCelsius(double fahrenheit){
    return (fahrenheit - 32) / 1.8;
  }
  public static void main(String[] args){
    print(celsiusToFahrenheit(0)); // 32
    print(celsiusToFahrenheit(10)); //50
    print(celsiusToFahrenheit(105.5)); //221.9
    print(celsiusToFahrenheit(-22)); //-7.6
    print(celsiusToFahrenheit(-2.6)); //27.32

    print(fahrenheitToCelsius(5)); //-15
    print(fahrenheitToCelsius(32)); //0
    print(fahrenheitToCelsius(54.2)); //12.3333..
    print(fahrenheitToCelsius(-1)); //-18.3333..
    print(fahrenheitToCelsius(-150.6)); //-101.4444..
  }
}
