package com.Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Page1 extends Picture {
    JFrame frame;
    public static void main(String[] args) {
        Page1 ob= new Page1();
        ob.CreateFrame();

    }
   public void CreateFrame()
    {
       frame= new JFrame();
       frame.setSize(1650,1080);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       LoadMainPanel();
       frame.setVisible(true);
    }
   public void LoadMainPanel()
    {
        SwingModel ob1= new SwingModel();
        ob1.CreatePanel(0,0,1650,1080);
        ob1.panel.setBackground(new Color(1,185,211));

        ob1.CreateLabel(450,50,700,70,"Welcome To Contact Management System","Algerian",25);

        SwingModel ob2= new SwingModel();
        ob2.CreateHoverPanel(170,250,250,250);
        ob2.CreateLabel(40,210,300,50,"Create New Contact","Algerian",15);
        ob2.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page2 obn= new Page2();
                obn.CreateFrame();

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
        ob3.CreateHoverPanel(440,250,250,250);
        ob3.CreateLabel(70,210,300,50,"Contact List","Algerian",15);
        ob3.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page3 obn1= new Page3();
                obn1.CreateFrame();
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
        ob4.CreateHoverPanel(720,250,250,250);
        ob4.CreateLabel(60,210,300,50,"update Contact","Algerian",15);
        ob4.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page4 obn2= new Page4();
                obn2.CreateFrame();
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

        SwingModel ob5= new SwingModel();
        ob5.CreateHoverPanel(990,250,250,250);
        ob5.CreateLabel(60,210,300,50,"Delete Contact","Algerian",15);
        ob5.hoverpanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Page5 obn3= new Page5();
                obn3.CreateFrame();
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
        ob3.CreateResizeImage(10,5,220,220,"C:\\Users\\ekRoni\\IdeaProjects\\ContactManagementSystem\\src\\teamwork.png");
        ob2.CreateResizeImage(10,5,220,220,"C:\\Users\\ekRoni\\IdeaProjects\\ContactManagementSystem\\src\\manager.png");
        ob4.CreateResizeImage(10,10,220,220,"C:\\Users\\ekRoni\\IdeaProjects\\ContactManagementSystem\\src\\com\\Me\\team.png");



        ob1.panel.add(ob1.label);

        ob1.panel.add(ob2.hoverpanel);
        ob2.hoverpanel.add(ob2.label);
        ob2.hoverpanel.add(ob2.image_label);

        ob1.panel.add(ob3.hoverpanel);
        ob3.hoverpanel.add(ob3.label);
        ob3.hoverpanel.add(ob3.image_label);

        ob1.panel.add(ob4.hoverpanel);
        ob4.hoverpanel.add(ob4.label);
        ob4.hoverpanel.add(ob4.image_label);

        ob1.panel.add(ob5.hoverpanel);
        ob5.hoverpanel.add(ob5.label);
        frame.add(ob1.panel);
    }
}
