package task5;

class Transport {
    void ticketPrice() {
        System.out.println("Ticket price for transport varies.");
    }
}

class Bus extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Ticket price for Bus: Rs.25.0");
    }
}

class Train extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Ticket price for Train: Rs.50.0");
    }
}

public class transportation {
    public static void main(String[] args) {
        Transport myBus = new Bus();
        myBus.ticketPrice();

        Transport myTrain = new Train();
        myTrain.ticketPrice();
    }
}
