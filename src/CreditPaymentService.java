public class CreditPaymentService {
    public int calculate(int amount, double annualRate, int numberMonths) {
        double monthlyRate = annualRate / 12 / 100;
        double annuityCoefficient = monthlyRate * Math.pow((1 + monthlyRate), numberMonths) / (Math.pow((1 + monthlyRate), numberMonths) - 1);
        int annuityPayment = (int) (amount * annuityCoefficient);
        return annuityPayment;
    }
}
