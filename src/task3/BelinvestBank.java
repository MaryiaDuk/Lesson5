package task3;

import java.util.Scanner;

public class BelinvestBank extends ATM {
    private int banknotes20;
    private int banknotes50;
    private int banknotes100;
    Scanner scanner = new Scanner(System.in);
    private int amount;

    public BelinvestBank(String bankName, String manufacturersName, int banknotes20, int banknotes50, int banknotes100) {
        super(bankName, manufacturersName);
        this.banknotes20 = banknotes20;
        this.banknotes50 = banknotes50;
        this.banknotes100 = banknotes100;
    }

    @Override
    public void deposit() {
        System.out.println("Введите сумму депозита. (сумма должна быть кратной 20/50/100)");
        amount = scanner.nextInt();
        scanner.nextLine();
        if (amount % 50 % 20 != 0) System.out.println("Неверная сумма. Внесите 20, 50, 100");
        else {
            banknotes100 += amount / 100;
            banknotes50 += amount % 100 / 50;
            banknotes20 += amount % 50 / 20;
            System.out.println("Вы успешно внесли " + amount + "BYN.");
        }
    }

    @Override
    public void withdraw() {
        System.out.println("Введите сумму(сумма должна быть кратной 20/50/100)");
        amount = scanner.nextInt();
        scanner.nextLine();
        int sum = banknotes20 * 20 + banknotes100 * 100 + banknotes50 * 50;
        if (amount > sum) System.out.println("Неверная сумма. Максимальная сумма: " + sum + "BYN.");
        else if (amount % 50 % 20 != 0) System.out.println("Неверная сумма. Доступные номиналы 20, 50, 100 BYN");
        else {
            banknotes100 -= amount / 100;
            banknotes50 -= amount % 100 / 50;
            banknotes20 -= amount % 50 / 20;
            System.out.println("Вы успешно сняли " + amount + "BYN.");
        }
    }

    @Override
    public void showRemainingAmount() {
        System.out.println("Максимальная сумма: " + banknotes20 * 20 + banknotes100 * 100 + banknotes50 * 50 + ".");
    }

    @Override
    public void showBanknotesQuantity() {
        System.out.println("Количество банкнот: " + (banknotes100 + banknotes50 + banknotes20));
        System.out.println("BYN100: " + banknotes100);
        System.out.println("BYN50: " + banknotes50);
        System.out.println("BYN20: " + banknotes20);
    }

    @Override
    public int menu() {
        String menu;
        System.out.println("Выберите операцию:");
        System.out.println("1. Снятие наличных.");
        System.out.println("2. Депозит.");
        System.out.println("3. Максимальная сумма выдачи.");
        System.out.println("4. Количество купюр.");
        System.out.println("5. Информация.");
        System.out.println("6. Выход.");
        do {
            menu = scanner.nextLine();
        } while (menu.equals("1") & menu.equals("2") & menu.equals("3") & menu.equals("4")
                & menu.equals("5") & menu.equals("6"));
        if (menu.equals("1")) withdraw();
        else if (menu.equals("2")) deposit();
        else if (menu.equals("3")) showRemainingAmount();
        else if (menu.equals("4")) showBanknotesQuantity();
        else if (menu.equals("5")) getInformation();
        else if (menu.equals("6")) System.exit(0);
        return menu();
    }

    public void getInformation() {
        showBankName();
        showManufacturerName();
    }
}
