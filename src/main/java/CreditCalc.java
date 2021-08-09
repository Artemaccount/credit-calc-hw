public class CreditCalc {
    public int monthPay(int months, int amount){
        return amount/months;
    }
    public int totalAmount(int amount, int percent){
        return amount/100*percent;
    }
    public int overpayment(int amount, int percent){
        return (amount/100*percent) - amount;
    }
}
