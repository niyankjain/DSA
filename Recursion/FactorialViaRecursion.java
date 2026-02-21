public class FactorialViaRecursion {

  public static void main(String[] args) {
    int number = 7;
    int fact = factorial(number, 1);
    System.out.println("Factorial of Number: "+number+" is: "+fact);
  }

  private static int factorial(int number, int fact) {
    if(number == 1) {
      return fact;
    }
    fact*=number;
    return factorial(number-1, fact);
  }
}
