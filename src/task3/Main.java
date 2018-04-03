package task3;

public class Main {
    public static void main(String[] args) {
        ATM belinvestBank = new BelinvestBank("Белинвестбанк", "NCR", 100, 50, 75);
        belinvestBank.menu();
    }
}