package pl.javastart.task.info;

public class AccountState {
    private int smsCount;
    private int mmsCount;
    private double minCount;
    private double accountBalance;

    public AccountState(int smsCount, int mmsCount, double minCount, double accountBalance) {
        this.smsCount = smsCount;
        this.mmsCount = mmsCount;
        this.minCount = minCount;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "=== STAN KONTA ===" + "\n" +
                "Wysłanych SMSów:" + smsCount + "\n" +
                "Wysłanych MMSów: " + mmsCount + "\n" +
                "Liczba sekund rozmowy: " + minCount + "\n" +
                "Na koncie zostało  " + accountBalance + "zł";
    }
}
