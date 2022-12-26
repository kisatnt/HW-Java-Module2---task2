public class Main {
    public static void main(String[] args) {
        int balanceAcc = 100; //задаем первоначальный баланс
        int topUp = 999; //задаем сумму пополнения
        int cashBack = topUp / 100; // считаем бонус
        int amountFinal; // обьявляем итоговую переменную баланса
        if (topUp < 1001) { // проверяем условие зачисления бонусов
            amountFinal = balanceAcc + topUp; //считаем сумму без бонуса
            cashBack = 0;
        } else {
            amountFinal = balanceAcc + topUp + cashBack; //считаем сумму с бонусом
        }
        System.out.println(" Количество бонусов = " + cashBack);
        System.out.println(" Общая сумма с бонусом = " + amountFinal);

    }
}