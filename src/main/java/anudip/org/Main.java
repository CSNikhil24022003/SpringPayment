package anudip.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext apcon=new ClassPathXmlApplicationContext("spring.config.xml"); 
		BillPayment bpl=apcon.getBean("billpayment",BillPayment.class);
		bpl.paybill(2000);
	}
}