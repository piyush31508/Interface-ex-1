package hello1;

public class Main1 {
	public static void main(String[] args) {
		PaymentMethod c = new CreditCard(454545755,"05-Sep-2029");
		PayPal p = new PayPal("anything@gmail.com");
		c.pay();
		c.getPaymentDetails();
		p.pay();
		p.getPaymentDetails();
	}

}
