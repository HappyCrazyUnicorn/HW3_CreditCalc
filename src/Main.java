public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService(); //создаем объект из класса CreditPaymentService

        int credit = 1_000_000; //сумма кредита
        double percents = 9.99; //процентная ставка
        double payment1 = service.calculate(credit, 1, percents); //вызываем метод calculate из класса CreditPaymentService, передаем на вход сумму кредита, период, ставку
        double payment2 = service.calculate(credit, 2, percents);
        double payment3 = service.calculate(credit, 3, percents);

        System.out.println("При сумме кредита " + credit + " и ставке " + percents + "% годовых");
        System.out.printf("Ежемесячный платеж при сроке кредита 1 год составит %.0f\n", payment1); //выводим сумму ежемесячного платежа, не оставляя знаков после запятой
        System.out.printf("Ежемесячный платеж при сроке кредита 2 года составит %.0f\n", payment2); //выводим сумму ежемесячного платежа, не оставляя знаков после запятой
        System.out.printf("Ежемесячный платеж при сроке кредита 3 года составит %.0f\n", payment3); //выводим сумму ежемесячного платежа, не оставляя знаков после запятой
    }
}