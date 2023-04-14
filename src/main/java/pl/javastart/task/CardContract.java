package pl.javastart.task;

    public class CardContract extends Contract {
        private double smsCost;
        private double mmsCost;
        private  double minCost;

        public CardContract(double accountBalance, double smsCost, double mmsCost, double minCost) {
            super(accountBalance);
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

