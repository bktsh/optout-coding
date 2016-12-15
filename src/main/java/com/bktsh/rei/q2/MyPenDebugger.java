package com.bktsh.rei.q2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hashem on 12/13/16.
 */
public class MyPenDebugger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        TrivialPen pen = (TrivialPen)o;
        System.out.println("Monitoring observable: [" + pen.getEnd().getX() + "," + pen.getEnd().getY() + "]");
    }
}
