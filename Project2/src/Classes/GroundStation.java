package Classes;

public class GroundStation implements CommunicationInterface, Runnable {
    int index;
    int last;

    public GroundStation(int index, int last) {
        this.index = index;
        this.last = last;
        Thread t1 = new Thread(this, "GS" + index);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.print(t1.getName() + " thread started:");
        t1.start();

    }

    public void sendMessage() {
        System.out.println("GS" + index + " sends message to LEO" + (index / 2) + " Satellite");

    }

    public void run() {
        if (index == last)
            this.receiveMessage();
        else
            this.sendMessage();
    }

    public void receiveMessage() {
        System.out.println("GS" + index + " receives message");

    }
}
