package pl.javastart.task;

    public class SubscriptionContract extends Contract {
        private double monthlyCost;
        boolean isAccountActive;

        public SubscriptionContract(double accountBalance, double monthlyCost) {
            super(accountBalance);
            if (accountBalance >  monthlyCost){
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
        boolean sendSms() {
            boolean isSmsSendAvailable= isSmsSendAvailable();
            if(isSmsSendAvailable)
                increaseSmsCount();
            return isSmsSendAvailable;
        }

        @Override
        boolean isMmsSendAvailable() {
            boolean isMmsSendAvailable= isMmsSendAvailable();
            if(isMmsSendAvailable)
                increaseMmsCount();
            return isAccountActive;
        }

        @Override
        boolean sendMms() {
            return isMmsSendAvailable();
        }

        @Override
        boolean isCallSecondAvailable() {
            return isAccountActive;
        }

        @Override
        boolean callSecond() {
            boolean isSecondAvailable= isCallSecondAvailable();
            if(isSecondAvailable)
                increaseSecondCount();
            return isCallSecondAvailable();
        }

        @Override
        public String printAccountState() {
           return super.printAccountState() + "\nRachunek: " + monthlyCost ;
        }
    }
