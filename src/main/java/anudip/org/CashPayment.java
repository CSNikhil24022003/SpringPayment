package anudip.org;

public class CashPayment implements Payment {
	CashPayment()
	{
		System.out.println("CashPayment obj is Created");
	}
	
	public void payment(int amt) {
		System.out.println("Payment of "+amt+" Done Successfully by Cash");

	}

}
