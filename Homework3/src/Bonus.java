public class Bonus {
    public static void main(String[] args) {
        int currentBalance = 100; // начальная сумма на счету клиента
        int depositAmount = 1100; // сумма пополнения
        int bonus = 0; // количество бонусных рублей
        if (depositAmount > 1000) {
            bonus = (depositAmount / 100) - 10;
        }
        int totalBalance = currentBalance + depositAmount + bonus;
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}