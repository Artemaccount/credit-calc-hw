import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalcTest {

    @Test
    public void monthPayTest() {
        int months = 12;
        int amount = 100000;
        double expected = amount / months;
        double actual = new CreditCalc().monthPay(months, amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void totalAmountTest() {
        int amount = 100000;
        int percent = 13;
        double expected = amount / 100 * percent;
        double actual = new CreditCalc().totalAmount(amount, percent);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overpaymentTest() {
        int amount = 100000;
        int percent = 13;
        double expected = (amount / 100 * percent) - amount;
        double actual = new CreditCalc().overpayment(amount, percent);
        Assertions.assertEquals(expected, actual);
    }
}
