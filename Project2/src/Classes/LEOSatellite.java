package Classes;

public class LEOSatellite implements CommunicationInterface {
    int satIndex;
    int index;
    int last;
    int latIndex;

    public LEOSatellite(int satIndex, int index, int last) {
        this.satIndex = satIndex;
        this.index = index;
        this.last = last;

    }

    public int sendMessage() {
        if ((index % 2 == 0 && index + 1 == last) || (index % 2 == 1 && index - 1 == last) || index == last) {
            System.out.println("LEO" + satIndex + " Satellite sends message to GS" + last);

            return 0;

        } else if (index / 2 + 1 == last / 2 || index / 2 - 1 == last / 2) {
            System.out.println("LEO" + satIndex + " Satellite send message to LEO" + last / 2 + " Satellite");

            return 1;

        } else {
            System.out.println("LEO" + satIndex + " Satellite sends message to GEO0 Satellite");
            return 2;

        }

    }

    public void receiveMessage() {

    }
}
