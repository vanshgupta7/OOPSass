package Classes;

public class GroundStation implements CommunicationInterface {
    int index;

    public GroundStation(int index) {
        this.index = index;

    }

    public int sendMessage() {
        System.out.println("GS" + index + " sends message to LEO" + (index / 2) + " Satellite");
        return (index / 2);

    }

    public void receiveMessage() {
        System.out.println("GS" + index + " receives message");

    }
}
