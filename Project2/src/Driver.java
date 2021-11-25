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
            new GroundStation(initial, last);
            // GroundStation lStation = new GroundStation(last, last);
            // int leoSatIndex = gStation.sendMessage();
            LEOSatellite lSatellite = new LEOSatellite(initial / 2, initial, last);
            int x = lSatellite.getCase();
            if (x == 0) {
                new GroundStation(last, last);

            } else if (x == 1) {
                new LEOSatellite(lasIndex, last, last);
                new GroundStation(last, last);

            } else {
                new GEOSatellite(lasIndex);
                new LEOSatellite(lasIndex, last, last);
                new GroundStation(last, last);

            }

        }
        sc.close();
    }
}
