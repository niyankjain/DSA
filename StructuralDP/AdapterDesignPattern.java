public class AdapterDesignPattern {
  public static void main(String[] args) {
    Payment payment = new RazorPayAdapter(new RazorPayImpl());
    System.out.println(payment.pay());
  }
}

interface Payment{
  public String pay();
}

interface RazorPay {
  public String makePayment();
}

class RazorPayImpl implements RazorPay {

  @Override
  public String makePayment() {
    return "Razorpay payment facility";
  }
}

class RazorPayAdapter implements Payment{
  private RazorPay razorPay;

  public RazorPayAdapter(RazorPay razorPay) {
    this.razorPay = razorPay;
  }

  @Override
  public String pay() {
    return razorPay.makePayment();
  }
}