public class CreditPaymentService {
    public double calculate(int credit, int years, double percent) {

        double payment;
        double month = years * 12 * (-1); //количесто лет переводим в месяца
        double percentMonth = percent / (100 * 12); //переводим процентную ставку в ежемесячные проценты

        payment = credit * (percentMonth / (1 - Math.pow(1 + percentMonth, month)));

        return payment;
    }
}
