package pl.javastart.task;

public abstract class Contract {
     private double accountBalance ;
     private int smsLeft;
     private int mmsLeft;
     private int minLeft;
     private boolean isContractActive;

    public Contract(double accountBalance, boolean isContractActive) {
        this.accountBalance = accountBalance;
        this.isContractActive = isContractActive;
    }

    public Contract(double accountBalance) {
        this.accountBalance = accountBalance;
        this.isContractActive = getInitialContractStatus(accountBalance);
        this.smsLeft = 0;
        this.mmsLeft = 0;
        this.minLeft = 0;
    }

    private boolean getInitialContractStatus(double accountBalance){
        return  (accountBalance > 0);

    }
    public boolean isContractActive() {
        return isContractActive;
    }

    public Contract(double accountBalance, int smsLeft, int mmsLeft, int minLeft) {
        this.isContractActive= getInitialContractStatus(accountBalance);
        this.accountBalance = accountBalance;
        this.smsLeft = smsLeft;
        this.mmsLeft = mmsLeft;
        this.minLeft = minLeft;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getSmsLeft() {
        return smsLeft;
    }

    public void setSmsLeft(int smsLeft) {
        this.smsLeft = smsLeft;
    }

    public int getMmsLeft() {
        return mmsLeft;
    }

    public void setMmsLeft(int mmsLeft) {
        this.mmsLeft = mmsLeft;
    }

    public int getMinLeft() {
        return minLeft;
    }

    public void setMinLeft(int minLeft) {
        this.minLeft = minLeft;
    }

    public void  payForService(double serviceCost){
        accountBalance -= serviceCost;
        if (accountBalance < 0 )
            isContractActive = false;
    }
    public void reduceSmsLeft(){
        smsLeft --;
    }
    public boolean isSmsSendAvailable(){
        return  (smsLeft> 0 && isContractActive);
    }
    abstract double getSmsCost();
    abstract double getMmsCost();
    abstract double getMinCost();
}
