public class CreditPaymentService {
    public int calculate (int loanAmount, int loanTerm, double loanRate) {
        double mounthLoanRate = loanRate / (100 * 12);
        int loantermInMounth = loanTerm * -12;
        float index = (float) Math.pow(1 + mounthLoanRate, loantermInMounth);
        double mounthlyPay = loanAmount * (mounthLoanRate / (1 - index));
    return (int) mounthlyPay;
    }
}
