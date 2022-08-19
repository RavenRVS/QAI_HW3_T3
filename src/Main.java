public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("При сроке кредита - 1 год");
        System.out.println("Ваш ежемесячный платеж составит: " + service.calculate(1_000_000, 1, 9.99) + " руб.");
        System.out.println();

        System.out.println("При сроке кредита - 2 года");
        System.out.println("Ваш ежемесячный платеж составит: " + service.calculate(1_000_000, 2, 9.99) + " руб.");
        System.out.println();

        System.out.println("При сроке кредита - 3 года");
        System.out.println("Ваш ежемесячный платеж составит: " + service.calculate(1_000_000, 3, 9.99) + " руб.");
        System.out.println();

    }
}
