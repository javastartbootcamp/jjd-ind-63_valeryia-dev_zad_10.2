package pl.javastart.task;

    public class SubscriptionContract extends Contract {
        private double monthlyCost;

        public SubscriptionContract(double accountBalance,double monthlyCost) {
            super(accountBalance, isContractActive);
            boolean isContractActive = getInitialContractStatus(accountBalance, monthlyCost);
            super.setSmsLeft(Integer.MAX_VALUE);
            super.setMmsLeft(Integer.MAX_VALUE);
            super.setMinLeft(Integer.MAX_VALUE);
            this.monthlyCost = monthlyCost;
        }

        public double getMonthlyCost() {
            return monthlyCost;
        }
        private boolean getInitialContractStatus(double accountBalance, double monthlyCost){
            return  (accountBalance > monthlyCost);

        }

        public void setMonthlyCost(double monthlyCost) {
            this.monthlyCost = monthlyCost;
        }

        @Override
        double getSmsCost() {
            return 0;
        }

        @Override
        double getMmsCost() {
            return 0;
        }

        @Override
        double getMinCost() {
            return 0;
        }
    }
