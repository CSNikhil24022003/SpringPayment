package anudip.org;

public class OnlinePayment implements Payment {
	OnlinePayment()
	{
		System.out.println("OnlinePayment obj is Created");
	}
	
	public void payment(int amt) {
		System.out.println("Payment of "+amt+" Done Successfully by Online");
	}

}