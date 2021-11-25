package Classes;

public class GEOSatellite implements CommunicationInterface, Runnable {
    int lasIndex;

    public GEOSatellite(int lasIndex) {
        this.lasIndex = lasIndex;
        Thread t2 = new Thread(this, "GEO0 Satellite");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.print(t2.getName() + " thread started:");
        t2.start();

    }

    public void sendMessage() {
        System.out.println("GEO0 Satellite sends message to LEO" + lasIndex + " Satellite");

    }

    public void run() {
        this.sendMessage();
    }

    public void receiveMessage() {

    }

}
