package Classes;

public class LEOSatellite implements CommunicationInterface, Runnable {
    int satIndex;
    int index;
    int last;
    int latIndex;

    public LEOSatellite(int satIndex, int index, int last) {
        this.satIndex = satIndex;
        this.index = index;
        this.last = last;
        Thread t1 = new Thread(this, "LEO" + satIndex + " Satellite");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        t1.start();
        System.out.print(t1.getName() + " thread started:");

    }

    public void sendMessage() {
        if ((index % 2 == 0 && index + 1 == last) || (index % 2 == 1 && index - 1 == last) || index == last) {
            System.out.println("LEO" + satIndex + " Satellite sends message to GS" + last);

        } else if (index / 2 + 1 == last / 2 || index / 2 - 1 == last / 2) {
            System.out.println("LEO" + satIndex + " Satellite send message to LEO" + last / 2 + " Satellite.");

        } else {
            System.out.println("LEO" + satIndex + " Satellite sends message to GEO0 Satellite.");

        }

    }

    public int getCase() {
        if ((index % 2 == 0 && index + 1 == last) || (index % 2 == 1 && index - 1 == last) || index == last) {

            return 0;
        } else if (index / 2 + 1 == last / 2 || index / 2 - 1 == last / 2) {
            return 1;
        } else {
            return 2;
        }

    }

    public void run() {
        this.sendMessage();
    }

    public void receiveMessage() {

    }
}
