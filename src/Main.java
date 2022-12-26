public class Main {
    public static void main(String[] args) {
        int balanceAcc = 100; //задаем первоначальный баланс
        int topUp = 1020; //задаем сумму пополнения
        int cashBack = topUp / 100; // считаем бонус
        int amountFinal; // обьявляем итоговую переменную баланса
        if (topUp < 1001) { // проверяем условие зачисления бонусов
            amountFinal = balanceAcc + topUp; //считаем сумму без бонуса
        } else {
            amountFinal = balanceAcc + topUp + cashBack; //считаем сумму с бонусом
        }
        System.out.println(amountFinal);

    }
}