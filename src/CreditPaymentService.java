public class CreditPaymentService {
    public double calculate(int credit, double percent, int month) {
        percent = percent / 100;
        double percentCalculate = percent / 12;
        double monthPayment = (credit * percentCalculate) / (1 - Math.pow(1 + percentCalculate, -month));
        return monthPayment;
    }
}
