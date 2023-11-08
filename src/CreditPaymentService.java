public class CreditPaymentService {
    public int calculate(int loanAmount, int year, double interestOnTheLoan){
        double monthlyPercent = interestOnTheLoan / (12 * 100);
        double sumMonth = year * 12;

        double monthlyPayment = loanAmount * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, - sumMonth));

        int monthlyPaymentInt = (int)monthlyPayment;

        return monthlyPaymentInt;
    }
}