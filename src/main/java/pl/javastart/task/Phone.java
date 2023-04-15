package pl.javastart.task;

public class Phone {
    private final Contract contract;

    public Phone(Contract contract) {
        this.contract = contract;
    }

    public void sendSms() {
        if (contract.sendSms())  {
            System.out.println("SMS sent");


        } else {
            System.out.println("failed to send SMS");
        }
    }

    public void call(int seconds) {
        for (int i = 0; i < seconds; i++) {
            if(!contract.callSecond()){
                System.out.println("Rozmowa przerwana po " + i + " sekundach");
                return;}
        }
        System.out.println("Rozmowa trwała" + seconds + "sekund");
        }


    public void sendMms() {
        if (contract.sendMms()) {
            System.out.println("MMS sent");
        } else {
            System.out.println("failed to send MMS");
        }
    }


    public void printAccountState() {
      contract.printAccountState();
        }
    }







