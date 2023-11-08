public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int year = 1;
        double interestOnTheLoan = 9.99;

        int monthlyPaymentInt = service.calculate(loanAmount, year, interestOnTheLoan);

        System.out.println("Миллион на 1 год " + monthlyPaymentInt);

        System.out.println();
        System.out.println("Миллион на 2 года");
        System.out.println(service.calculate(1_000_000, 2, 9.99));

        System.out.println();
        System.out.println("Миллион на 8 лет");
        System.out.println(service.calculate(1_000_000, 8, 9.99));

        System.out.println();
        System.out.println("Миллион на 3 года");
        System.out.println(service.calculate(1_000_000, 3, 9.99));

        System.out.println();
        System.out.println("Миллион на 10 лет");
        System.out.println(service.calculate(1_000_000, 10, 9.99));

    }
}