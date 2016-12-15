package com.bktsh.rei.q2;

import javax.swing.*;

/**
 * To design a Drawing App like MS Paint, I will use observer pattern. The canvas will be my observer and the mouse will be the observable.
 * Using this pattern I can update the canvas drawing while the user is interacting with canvas [clicking/moving].
 * <p>
 * To enable undo-redo functionality I will use command pattern. Whenever user does an interaction with UI I will encapsulate it
 * as a command and save it into a stack, then when user tries to undo I will pop the latest from undo stack. To support re-do I will
 * use a re-do stack, so when user hits re-do action I will pop from re-do stack and push to undo stack. I will try to implrment a simple
 * version here.
 * <p>
 * Created by hashem on 12/12/16.
 */
public class DrawingApp extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> initApp());
    }

    /**
     * Creates a Trivial pen and registers multiple observers for it.
     * This way GUI part will draw the graphics and the debugger will log the moves.
     *
     */
    public static void initApp() {
        MyPenDebugger debugger = new MyPenDebugger();
        TrivialPen trivialPen = new TrivialPen();
        DrawingApp mainFrame = new DrawingApp();
        Canvas canvas = new Canvas();
        trivialPen.addObserver(canvas);
        trivialPen.addObserver(debugger);

        //Just to add graphical fun stuff
        canvas.addMouseListener(trivialPen);
        canvas.addMouseMotionListener(trivialPen);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(canvas);
        mainFrame.pack();
        mainFrame.setLocationByPlatform(true);
        mainFrame.setVisible(true);
    }
}
