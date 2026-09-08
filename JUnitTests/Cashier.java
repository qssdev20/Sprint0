package Main;

public class Cashier {
	public static double GetChange(double given, double cost) {
		return given - cost;
	}
	public static boolean ValidCashPayment(double given) {
		//This function should calculate the given money and see if the change is valid(i.e., can't pay with less than a cent)
		//This is done by taking our number. i,.e., $45.231. The one makes this impossible to actually pay with via cash. mathematically we can tell this by
		//45.231*1000 = 45231 and 45231 % 10 ==1 !=0 thus not payable
		
		//Also handle if the given money is negative: given < 0
		return (given * 1000 %10==0 && given >0);
	}
	public static void ProcessTransaction(double given, double cost) {
		System.out.println("Processing transaction");
		//See if the customer gave enough money. If so, give change back and notify of successful
		//transaction
		double change = GetChange(given, cost);
		if(change > 0) {
			System.out.println("here is $"+ change  + " back.");
		}
		else if(change ==0 ) {
			System.out.println("purchase succesful");
		}
		else {
			System.out.println("purchase failed. You are $" + -1*change + " short.");
		}
	}
}
