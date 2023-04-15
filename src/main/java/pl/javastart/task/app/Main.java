package pl.javastart.task.app;

import pl.javastart.task.model.CardContract;
import pl.javastart.task.model.MixContract;
import pl.javastart.task.model.SubscriptionContract;
import pl.javastart.task.utils.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phoneCard = new Phone(new CardContract(1, 0.1, 0.2, 1));
        Phone phoneMix = new Phone(new MixContract(100, 0.2, 0.3, 0.2,  5, 6, 7));
        Phone phoneSubscription = new Phone(new SubscriptionContract(100, 60));

        phoneSubscription.printAccountState();
        phoneMix.printAccountState();
    }
}
