package org.Threading.Race;

/**
 * Created by rajeevgurram on 5/30/16.
 */
public class RaceGame {
    public static void main(String[] args) {

        RaceThread race= new RaceThread();

        Thread nagaraju= new Thread(race, "Nagaraju");
        Thread naveen= new Thread(race, "Naveen");
        Thread rajeev= new Thread(race, "Rajeev");

        nagaraju.start();
        naveen.start();
        rajeev.start();

    }
}
