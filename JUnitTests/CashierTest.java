package Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CashierTest {
	@Test
	void GetChangeTest() {
		//Verify that the change calculated is correct!
		int cost=13;
		int given = 18;
		double change = Cashier.GetChange(given,cost);
		assertEquals(5.0,change);
	}
	@ParameterizedTest
	@MethodSource("DoublesToTest")
	void ValidCashPaymentTest(double d) {
		assertFalse(Cashier.ValidCashPayment(d));
	}
	static double[] DoublesToTest() {
		return new double[] {-1, -1.2234, 13.001, 3.889 };
	}
}