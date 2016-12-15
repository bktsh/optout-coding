package com.bktsh.rei.q2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hashem on 12/12/16.
 */
public class DrawingApp extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> initApp());
    }

    /**
     * Creates a Trivial pen and registers multiple observers for it.
     * This way GUI part will draw the graphics and the debugger will log the moves.
     */
    public static void initApp() {
        StatusBar statusBar = new StatusBar();
        Pencil pencil = new Pencil();
        DrawingApp mainFrame = new DrawingApp();
        Canvas canvas = new Canvas();
        pencil.addObserver(canvas);
        pencil.addObserver(statusBar);
        //Just to add graphical fun stuff
        canvas.addMouseListener(pencil);
        canvas.addMouseMotionListener(pencil);


        statusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
        mainFrame.add(statusBar, BorderLayout.SOUTH);
        statusBar.setPreferredSize(new Dimension(mainFrame.getWidth(), 25));

        mainFrame.setJMenuBar(mainFrame.createMenuBar());

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(canvas);
        mainFrame.pack();
        mainFrame.setLocationByPlatform(true);
        mainFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);

    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem item = new JMenuItem("Exit");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(item);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
