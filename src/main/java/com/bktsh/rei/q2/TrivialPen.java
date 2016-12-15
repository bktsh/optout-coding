package com.bktsh.rei.q2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by hashem on 12/12/16.
 */
public class TrivialPen extends Observable implements MouseMotionListener, MouseListener {

    private ArrayList<Point> points = new ArrayList<>();
    private Point start;
    private Point end;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        end = e.getPoint();
        start = end;
        points.add(e.getPoint());
        notifyObservers();
        setChanged();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        end = e.getPoint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        start = e.getPoint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        start = e.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        end = e.getPoint();
        start = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
