public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1000_000, 9.99, 12);
        System.out.println("Ежемесячный платеж, если срок кредита 1 год: " + (int) payment);

        double paymentTwoYear = service.calculate(1000_000, 9.99, 24);
        System.out.println("Ежемесячный платеж, если срок кредита 2 года: " + (int) paymentTwoYear);

        double paymentThreeYear = service.calculate(1000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж,если срок кредита 3 года: " + (int) paymentThreeYear);
    }

}