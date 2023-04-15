package pl.javastart.task;

public class MixContract extends CardContract {
    private double smsLeft;
    private double mmsLeft;
    private double secondLeft;

    public MixContract(double accountBalance, double smsCost, double mmsCost, double minCost, double smsLeft, double mmsLeft, double minLeft) {
        super(accountBalance, smsCost, mmsCost, minCost);
        this.smsLeft = smsLeft;
        this.mmsLeft = mmsLeft;
        this.secondLeft = minLeft * 60;
    }

    @Override
    boolean isSmsSendAvailable() {
        return (smsLeft > 0 || accountBalance > 0);
    }


    @Override
    boolean sendSms() {
        boolean isSmsSendAvailable = isSmsSendAvailable();
        if(isSmsSendAvailable){
            if (smsLeft > 0)
                smsLeft--;
            else
                accountBalance -= smsCost;
        }
        return isSmsSendAvailable;
    }
    @Override
    boolean isMmsSendAvailable() {
        return  (mmsLeft > 0 || accountBalance > 0);
    }

    @Override
    boolean sendMms() {
        boolean isSmsSendAvailable = isSmsSendAvailable();
        if(isSmsSendAvailable){
            if (mmsLeft > 0)
                mmsLeft--;
            else
                accountBalance -= mmsCost;
        }
        return isSmsSendAvailable;
    }
    @Override
    boolean isCallSecondAvailable() {
        return  (secondLeft > 0 || accountBalance > 0);

    }

    @Override
    boolean callSecond() {
        boolean isCallSecondAvailable = isCallSecondAvailable();
        if(isCallSecondAvailable){
            if (secondLeft > 0)
                secondLeft--;
            else
                accountBalance -= getCostPerSecond();
        }
        return isCallSecondAvailable;
    }
}

