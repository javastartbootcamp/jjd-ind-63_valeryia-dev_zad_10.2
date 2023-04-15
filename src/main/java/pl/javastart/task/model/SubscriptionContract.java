package pl.javastart.task.model;

import pl.javastart.task.model.Contract;

public class SubscriptionContract extends Contract {
    private final double monthlyCost;
    boolean isAccountActive;

    public SubscriptionContract(double accountBalance, double monthlyCost) {
        super(accountBalance);
        if (accountBalance > monthlyCost) {
            super.accountBalance -= monthlyCost;
            isAccountActive = true;
        }
        this.monthlyCost = monthlyCost;
    }

    @Override
    boolean isSmsSendAvailable() {
        return isAccountActive;
    }

    @Override
    public boolean sendSms() {
        boolean isSmsSendAvailable = isSmsSendAvailable();
        if (isSmsSendAvailable) {
            increaseSmsCount();
        }
        return isSmsSendAvailable;
    }

    @Override
    boolean isMmsSendAvailable() {
        return isAccountActive;
    }

    @Override
    public boolean sendMms() {
        boolean isMmsSendAvailable = isMmsSendAvailable();
        if (isMmsSendAvailable) {
            increaseMmsCount();
        }
        return isMmsSendAvailable();
    }

    @Override
    boolean isCallSecondAvailable() {
        return isAccountActive;
    }

    @Override
    public boolean callSecond() {
        boolean isSecondAvailable = isCallSecondAvailable();
        if (isSecondAvailable) {
            increaseSecondCount();
        }
        return isCallSecondAvailable();
    }

    @Override
    public String printAccountState() {
        return super.printAccountState() + "\nRachunek: " + monthlyCost;
    }
}
