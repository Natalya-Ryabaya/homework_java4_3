public class CreditPaymentService {
    public long calculate (long creditAmount, long creditPeriod){
        double rate = 9.99;
        double rateMonth = rate/12/100;
        double annuity = rateMonth * Math.pow((1+rateMonth),creditPeriod)/(Math.pow((1+rateMonth),creditPeriod)-1);
        long paymentMonthly = (long) (creditAmount*annuity);
        return paymentMonthly;
    }
}
