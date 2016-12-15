package com.bktsh.rei.q2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Observe mouse changes and draw line based on start and end points
 * Created by hashem on 12/12/16.
 */
public class Canvas extends JPanel implements Observer {

    private ArrayList<Point> points = new ArrayList<>();


    public Canvas() throws HeadlessException {
        super();
        setSize(new Dimension(600, 400));
        setPreferredSize(new Dimension(600, 400));
        setMinimumSize(new Dimension(600, 400));
        setMaximumSize(new Dimension(600, 400));
        setBackground(Color.white);
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < points.size() - 2; i++) {//ignore starting points
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            g.setColor(Color.RED);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    @Override
    public void update(Observable observable, Object arg) {
        TrivialPen trivialPen = (TrivialPen) observable;
        this.points = trivialPen.getPoints();
        this.repaint();
    }
}
