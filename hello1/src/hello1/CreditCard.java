package hello1;

public class CreditCard implements PaymentMethod{

	long cn;
	String d;
	
	CreditCard(long n, String date){
		cn=n;
		d=date;
	}
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("The payment has been made using credit card no. "+(cn/10000)+"XXXX");
	}

	@Override
	public void getPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Card No. : "+cn+"\nExp date : "+d);
	}

}
