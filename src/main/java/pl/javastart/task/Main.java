package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone phoneCard = new Phone(new CardContract(1, 0.1, 0.2, 1));
        Phone phoneMix = new Phone(new MixContract(100,0.2,0.3,0.2, 5,6,7));
        Phone phone2 = new Phone(new SubscriptionContract(100, 60));

     /*   phoneCard.printAccountState();

        phoneCard.sendSms();
        phoneCard.printAccountState();

        phoneCard.sendSms();
        phoneCard.printAccountState();
        System.out.println();
        System.out.println();*/

        phoneCard.printAccountState();

        phoneCard.call(50);
        phoneCard.printAccountState();

        phoneCard.call(20);
        phoneCard.printAccountState();

        System.out.println();
        System.out.println();

        /*phoneMix.printAccountState();

        phoneMix.sendSms();
        phoneMix.printAccountState();

        phoneMix.sendSms();
        phoneMix.printAccountState();*/

    }
}
