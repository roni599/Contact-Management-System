package com.Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Page4 {
    JFrame frame;
    public static void main(String[] args) {
        Page4 ob= new Page4();
        ob.CreateFrame();

    }
    public void CreateFrame()
    {
        frame= new JFrame();
        frame.setSize(1650,1080);
        frame.setLayout(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoadMainPanel();
        frame.setVisible(true);
    }
    public void LoadMainPanel()
    {
        SwingModel ob1= new SwingModel();
        ob1.CreatePanel(0,0,1650,1080);
        ob1.panel.setBackground(Color.WHITE);
        ob1.panel.setBackground(new Color(1,185,211));

        ob1.CreateLabel(615,160,700,70,"Update Contact","Algerian",25);

        SwingModel ob2= new SwingModel();
        ob2.CreateHoverPanel(310,250,250,250);
        ob2.CreateLabel(90,210,300,50,"Name","Algerian",15);
        ob2.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page6 obn4= new Page6();
                obn4.CreateFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        SwingModel ob3= new SwingModel();
        ob3.CreateHoverPanel(600,250,250,250);
        ob3.CreateLabel(70,210,300,50,"Phone Number","Algerian",15);
        ob3.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page7 obn6= new Page7();
                obn6.CreateFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        SwingModel ob4= new SwingModel();
        ob4.CreateHoverPanel(880,250,250,250);
        ob4.CreateLabel(100,210,300,50,"Email","Algerian",15);
        ob4.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page8 obn7= new Page8();
                obn7.CreateFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        ob1.panel.add(ob1.label);

        ob1.panel.add(ob2.hoverpanel);
        ob2.hoverpanel.add(ob2.label);

        ob1.panel.add(ob3.hoverpanel);
        ob3.hoverpanel.add(ob3.label);

        ob1.panel.add(ob4.hoverpanel);
        ob4.hoverpanel.add(ob4.label);
        frame.add(ob1.panel);

    }
}

