package com.Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page2 {
    JFrame frame;
    public static void main(String[] args) {
        Page2 ob1= new Page2();
        ob1.CreateFrame();

    }
    public void CreateFrame()
    {
        frame= new JFrame();
        frame.setSize(1300,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateNewContact();
        frame.setVisible(true);
    }
    public void CreateNewContact()
    {
        SwingModel ob1= new SwingModel();
        ob1.CreatePanel(0,0,1300,700);
        ob1.CreateLabel(555,20,300,50,"Create New Contact","Algerian",20);
        ob1.CreateTextfield(570,150,200,30,"Name");

        SwingModel ob2= new SwingModel();
        ob2.CreateTextfield(570,200,200,30,"Phone Number");

        SwingModel ob3= new SwingModel();
        ob3.CreateTextfield(570,250,200,30,"Email");

        ob3.CreateButton(600,330,130,40,"Create");
        ob3.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1=ob1.textField.getText();
                String phone1=ob2.textField.getText();
                String email1=ob3.textField.getText();
                String command="INSERT INTO contact (Name,phone,email) VALUES('"+name1+"','"+phone1+"','"+email1+"')";
                ob3.SendData(command);
            }
        });


        ob1.panel.add(ob1.label);
        ob1.panel.add(ob1.textField);
        ob1.panel.add(ob2.textField);

        ob1.panel.add(ob3.textField);
        ob1.panel.add(ob3.button);
        frame.add(ob1.panel);
    }
}
