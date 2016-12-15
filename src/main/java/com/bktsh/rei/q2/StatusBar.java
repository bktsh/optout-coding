package com.bktsh.rei.q2;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by hashem on 12/13/16.
 */
public class StatusBar extends JPanel implements Observer {

    JLabel statusText = new JLabel();


    public StatusBar() {
        statusText.setHorizontalAlignment(SwingConstants.LEFT);
        this.add(statusText);
    }

    @Override
    public void update(Observable o, Object arg) {
        Pencil pen = (Pencil) o;
        String currentLocation = "[" + pen.getEnd().getX() + "," + pen.getEnd().getY() + "]";
        this.statusText.setText(currentLocation);
        System.out.println("Monitoring observable:" + currentLocation);
    }


}
