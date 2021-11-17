import java.util.*;
import Classes.*;

public class Driver {

    public static void main(String[] args) throws Exception {
        int numberOfCases;
        Scanner sc = new Scanner(System.in);
        numberOfCases = sc.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int initial = sc.nextInt();
            int last = sc.nextInt();
            // int inIndex = initial / 2;
            int lasIndex = last / 2;
            GroundStation gStation = new GroundStation(initial);
            GroundStation lStation = new GroundStation(last);
            int leoSatIndex = gStation.sendMessage();
            LEOSatellite lSatellite = new LEOSatellite(leoSatIndex, initial, last);
            int x = lSatellite.sendMessage();
            if (x == 0) {
                lStation.receiveMessage();

            } else if (x == 1) {
                LEOSatellite lSatellite2 = new LEOSatellite(lasIndex, last, last);
                lSatellite2.sendMessage();
                lStation.receiveMessage();

            } else {
                GEOSatellite gSatellite = new GEOSatellite(leoSatIndex, lasIndex);
                gSatellite.sendMessage();
                LEOSatellite lSatellite2 = new LEOSatellite(lasIndex, last, last);
                lSatellite2.sendMessage();
                lStation.receiveMessage();

            }

        }
        sc.close();
    }
}
