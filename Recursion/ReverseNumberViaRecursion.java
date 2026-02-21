public class ReverseNumberViaRecursion {
  public static void main(String[] args) {
    int number = 1234;
    int value = reverseNumber(number, 0);
    System.out.println("number: "+ number + ", reverser number: "+value);
  }

  public static int reverseNumber(int number, int i) {
    if(number%10 == number) {
      return i + number;
    }

    i += number % 10; // 2
    return reverseNumber(number/10, i*10);
  }
}
