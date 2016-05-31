package org.Threading.Race;

/**
 * Created by rajeevgurram on 5/30/16.
 */
public class RaceThread implements Runnable {
    private static String winner= null;

    public void run(){
        long start= System.currentTimeMillis();
        race();
        long end= System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+" Took "+ (end-start)+" Milliseconds--------------->");
    }

    private void race(){
        for(int i= 1; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+" Travelled "+i+" Meters");
            boolean isRaceWon= isWinner(i);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isWinner(int distance){
        if(distance==100 && winner==null){
            winner= Thread.currentThread().getName();
            System.out.println(winner+" Won the race");
            return true;
        }
        if(winner!=null){
            return true;
        }
        return false;
    }
}
