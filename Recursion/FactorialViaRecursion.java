public class FactorialViaRecursion {

  public static void main(String[] args) {
    int number = 6;
    int fact = factorial(number);
    System.out.println("Factorial of Number: "+number+" is: "+fact);
  }

  private static int factorial(int number) {
    if(number == 1) {
      return 1;
    }
    return  number * factorial(number-1);
  }
}
