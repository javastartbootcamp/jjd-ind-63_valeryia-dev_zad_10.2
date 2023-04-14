package pl.javastart.task;

public class Phone {
    private final Contract contract;
    private int smsCount;
    private int mmsCount;
    private int minutesUsed;

    public Phone(Contract contract) {
        this.contract = contract;
        this.smsCount = 0;
        this.mmsCount = 0 ;
        this.minutesUsed = 0;
    }

    public void sendSms() {
        if (contract.isSmsSendAvailable())  {
            System.out.println("SMS sent");
            contract.payForService(contract.getSmsCost());
            contract.reduceSmsLeft();
            smsCount++;

        } else {
            System.out.println("failed to send SMS");
        }
    }

    public void call(int seconds) {
        double callCost = seconds / 60.0 * contract.getMinCost();
        if (callCost <= accountBalance) {
            System.out.println("call lasted " + seconds + " seconds");
            accountBalance -= callCost;
            minutesUsed += seconds / 60;
        } else {
            int availableSeconds = (int) Math.floor(accountBalance / contract.getMinCost() * 60);
            System.out.println("not enough funds, call interrupted after " + availableSeconds + " seconds");
            accountBalance = 0;
            minutesUsed += availableSeconds / 60;
        }
    }

    public void sendMms() {
        if (mmsCount > 0) {
            System.out.println("MMS sent");
            mmsCount--;
            accountBalance -= contract.getMmsCost();
        } else {
            System.out.println("failed to send MMS");
        }
    }

    public void printAccountState() {
        System.out.println("SMS count: " + smsCount);
        System.out.println("MMS count: " + mmsCount);
        System.out.println("minutes used: " + minutesUsed);
        if (contract instanceof CardContract) {
            System.out.println("account balance: " + accountBalance);
        } else if (contract instanceof SubscriptionContract) {
            System.out.println("subscription cost: " + ((SubscriptionContract) contract).getMonthlyCost());
        } else if (contract instanceof MixContract) {
            MixContract mixContract = (MixContract) contract;
            System.out.println("SMS count left: " + mixContract.getSmsLeft());
            System.out.println("MMS count left: " + mixContract.getMmsLeft());
            System.out.println("minutes count left: " + mixContract.getMinLeft());
            System.out.println("account balance: " + accountBalance);
        }
    }
}






