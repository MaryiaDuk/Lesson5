package task3;

public abstract class ATM implements GlobalInformation, CashInformation, Withdrawing, Depositing {
    private String bankName;
    private String manufacturersName;

    public ATM(String bankName, String manufacturersName) {
        this.bankName = bankName;
        this.manufacturersName = manufacturersName;
    }

    public abstract int menu();

    @Override
    public abstract void deposit();

    @Override
    public abstract void withdraw();

    @Override
    public abstract void showRemainingAmount();

    @Override
    public abstract void showBanknotesQuantity();

    @Override
    public void showManufacturerName() {
        System.out.println("Данный ATM произведен:" + manufacturersName + ".");
    }

    @Override
    public void showBankName() {
        System.out.println("Данный банкомат принадлежит " + bankName + "у.");
    }
}
