package hello1;

public class PayPal implements PaymentMethod {

	String e;
	PayPal(String e1){
		e=e1;
		
	}
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment made with PayPal with : "+e);
	}

	@Override
	public void getPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("PayPal e-mail : "+e);
	}

}
