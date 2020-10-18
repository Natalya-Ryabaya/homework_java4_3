public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long paymentMonthlyOneyear = service.calculate(1000_000, 12);
        System.out.println(paymentMonthlyOneyear);

        long paymentMonthlyTwoyears = service.calculate(1000_000, 24);
        System.out.println(paymentMonthlyTwoyears);

        long paymentMonthlyThreeyears = service.calculate(1000_000, 36);
        System.out.println(paymentMonthlyThreeyears);
    }
}
