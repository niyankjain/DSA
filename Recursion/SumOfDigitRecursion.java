public class SumOfDigitRecursion {
  public static void main(String[] args) {
    System.out.println("Sum of number: "+876+", value: "+sumOfDigit(876));
  }

  public static int sumOfDigit(int number) {
    if(number/10 == 0) {
      return number%10;
    }

    return (number%10)+sumOfDigit(number/10);
  }
}
