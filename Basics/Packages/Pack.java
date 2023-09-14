package Packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pack extends Frame {
    public Pack(String title) {
        super(title);
        setSize(500, 500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 50);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 30);

        g.setFont(sansSerifLarge);
        g.drawString("First Graphical User Interface In Java", 250, 250);
        g.setFont(sansSerifSmall);
        g.drawString("By Kaizer", 250, 300);
    }
}
