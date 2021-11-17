package Classes;

public class GEOSatellite implements CommunicationInterface {
    int fIndex;
    int lasIndex;

    public GEOSatellite(int fIndex, int lasIndex) {
        this.fIndex = fIndex;
        this.lasIndex = lasIndex;

    }

    public int sendMessage() {
        System.out.println("GEO0 Satellite sends message to LEO" + lasIndex + " Satellite");
        return 0;

    }

    public void receiveMessage() {

    }

}
