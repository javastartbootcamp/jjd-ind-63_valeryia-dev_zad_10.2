package pl.javastart.task;

public class MixContract extends Contract {
    private double smsCost;
    private double mmsCost;
    private double minCost;

    public MixContract(double accountBalance, int smsLeft, int mmsLeft, int minLeft, double smsCost, double mmsCost, double minCost) {
        super(accountBalance, smsLeft, mmsLeft, minLeft);
        this.smsCost = smsCost;
        this.mmsCost = mmsCost;
        this.minCost = minCost;
    }

    @Override
    double getSmsCost() {
            return this.smsCost;
    }

    @Override
    double getMmsCost() {
            return this.mmsCost;
    }

    @Override
    double getMinCost() {
        return this.minCost;
    }
}

