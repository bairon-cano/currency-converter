
package com.converter.utils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

// this class works to create reusable functions for forms.
public class UtilForms {
    private int posX;
    private int posY;
    private final JFrame form;

    public UtilForms(JFrame form) {
        this.form = form;
        this.posX = 0;
        this.posY = 0;
    }
    
    // set rounded border to the form window
    public void setRoundedBorder() {
        this.form.setShape(new RoundRectangle2D.Double(0,0,form.getWidth(),form.getHeight(),25,25)); //set rounded border
    }
    
    // let to move the window 
    public void moveWindow() {
        //detects mouse click
        this.form.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });

        // detects mouse drag. When drag is detected, it changes the position of the JFrame to make it look like it's moving across the screen.
        this.form.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - posX;
                int deltaY = e.getYOnScreen() - posY;
                form.setLocation(deltaX, deltaY);
            }
        });
    }
}
