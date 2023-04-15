package pl.javastart.task.model;

import pl.javastart.task.info.AccountState;

public abstract class Contract {
    protected double accountBalance;
    private int smsCount;
    private int mmsCount;
    private int secondUsed;

    public Contract(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public int getMmsCount() {
        return mmsCount;
    }

    public int getSecondUsed() {
        return secondUsed;
    }

    protected void increaseSmsCount() {
        smsCount++;
    }

    protected void increaseMmsCount() {
        mmsCount++;
    }

    protected void increaseSecondCount() {
        secondUsed++;
    }

    abstract boolean isSmsSendAvailable();

    public abstract boolean sendSms();

    abstract boolean isMmsSendAvailable();

    public abstract boolean sendMms();

    abstract boolean isCallSecondAvailable();

    public abstract boolean callSecond();

    public String printAccountState() {
        AccountState accountState = new AccountState(smsCount, mmsCount, secondUsed, accountBalance);
        return accountState.toString();
    }
}
