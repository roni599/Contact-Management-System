package com.Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Page3 {
    JFrame frame;
    public static void main(String[] args) {
        Page3 ob1= new Page3();
        ob1.CreateFrame();
    }
    public void CreateFrame()
    {
        frame= new JFrame();
        frame.setSize(1300,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateList();
        frame.setVisible(true);
    }
    public void CreateList()
    {
        SwingModel ob1= new SwingModel();
        ob1.CreatePanel(0,0,1300,700);
        ob1.panel.setBackground(Color.white);
        ob1.CreateLabel(750,50,300,50,"Contact List","Algerian",20);
        ob1.CreateTextfield(200,260,200,30,"ID");

        ResultSet rez= ob1.GetData("SELECT * FROM contact");
        ob1.CreateTable(430,100,800,500,rez);

        ob1.CreateButton(230,330,130,40,"Search");
        ob1.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1=ob1.textField.getText();
                String cmd;
                if(id1.equals(""))
                {
                    cmd="SELECT * FROM contact";
                }
                else
                {
                    int r_n=Integer.parseInt(id1);
                    cmd= "SELECT * FROM contact where `id`='"+r_n+"'";
                }
                ResultSet rz1= ob1.GetData(cmd);
                ob1.scrollPane.setVisible(false);
                ob1.CreateTable(430,100,800,500,rz1);
                ob1.panel.add(ob1.scrollPane);

            }
        });



        ob1.panel.add(ob1.label);
        ob1.panel.add(ob1.textField);
        ob1.panel.add(ob1.button);
        ob1.panel.add(ob1.scrollPane);
        frame.add(ob1.panel);
    }
}
