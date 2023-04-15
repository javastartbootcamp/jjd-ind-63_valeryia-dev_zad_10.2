package pl.javastart.task;

    public class CardContract extends Contract {
        protected double smsCost;
        protected double mmsCost;
        protected  double minCost;

        public CardContract(double accountBalance, double smsCost, double mmsCost, double minCost) {
            super(accountBalance);
            this.smsCost = smsCost;
            this.mmsCost = mmsCost;
            this.minCost = minCost;
        }

        @Override
        boolean isSmsSendAvailable() {
            return (accountBalance > 0);
        }

        @Override
        boolean sendSms() {
            boolean isSmsSendAvailable = isSmsSendAvailable();
            if(isSmsSendAvailable)
                accountBalance -= smsCost;
            return isSmsSendAvailable;
        }
        @Override
        boolean isMmsSendAvailable() {
            return (accountBalance > 0);
        }

        @Override
        boolean sendMms() {
            boolean isMmsSendAvailable = isMmsSendAvailable();
            if(isMmsSendAvailable)
                accountBalance -= smsCost;
            return isMmsSendAvailable;
        }
        public double getCostPerSecond() {
            return minCost/60;

        }
        @Override
        boolean isCallSecondAvailable() {
            return  ( accountBalance > 0);

        }

        @Override
        boolean callSecond() {
            boolean isCallSecondAvailable = isCallSecondAvailable();
            if (isCallSecondAvailable){
                    accountBalance -= getCostPerSecond();
            }
            return isCallSecondAvailable;
        }
    }

