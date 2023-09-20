package anudip.org;
public class BillPayment {
	Payment payment;
	BillPayment()
	{
		System.out.println("Billpayment obj created");
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	void paybill(int amt) {
		payment.payment(amt);
	}

}