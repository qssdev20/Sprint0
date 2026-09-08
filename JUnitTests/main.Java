package Main;

public class Main {
	public static void main(String[] args) {
		Cashier.ProcessTransaction(100,100);
		Cashier.ProcessTransaction(70,100);
		Cashier.ProcessTransaction(150,100);
		System.out.println(Cashier.ValidCashPayment(0.051));
	}
}
