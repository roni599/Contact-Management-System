package com.Me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Page6 {
    JFrame frame;
    ResultSet rz2;
    String cmd2,cmd3;
    public static void main(String[] args) {
        Page6 ob1= new Page6();
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
        ob1.panel.setBackground(Color.WHITE);
        ob1.CreateLabel(750,50,300,50,"Update Name","Algerian",20);
        ob1.CreateTextfield(200,260,200,30,"ID");
        ResultSet rz=ob1.GetData("SELECT * FROM contact");
        ob1.CreateTable(430,100,800,500,rz);
        ob1.CreateButton(230,330,130,40,"Search");
        ob1.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1=ob1.textField.getText();

                if(id1.equals(""))
                {
                    cmd2="SELECT * FROM contact";
                }
                else
                {
                    int r_n1=Integer.parseInt(id1);
                    cmd2= "SELECT * FROM contact where `id`='"+r_n1+"'";
                }
                rz2=ob1.GetData(cmd2);
                ob1.scrollPane.setVisible(false);
                ob1.CreateTable(430,100,800,500,rz2);
                ob1.panel.add(ob1.scrollPane);
            }
        });

        SwingModel ob2= new SwingModel();
        ob2.CreateTextfield(200,400,200,30,"Name");
        ob2.CreateButton(230,460,130,40,"Update");
        ob2.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id_check=Integer.parseInt(ob1.textField.getText());
                String newName=ob2.textField.getText();
                    if(!newName.equals("")) {
                        String command = "UPDATE contact SET name='" + newName + "' WHERE id='" + id_check + "'";
                        ob2.Update(command);
                        cmd3 = "SELECT * FROM contact Name";
                        rz2 = ob1.GetData(cmd3);
                        ob1.scrollPane.setVisible(false);
                        ob1.CreateTable(430, 100, 800, 500, rz2);
                        ob1.panel.add(ob1.scrollPane);
                    }
                    else
                    {
                        cmd3 = "SELECT * FROM contact Name";
                        rz2 = ob1.GetData(cmd3);
                        ob1.scrollPane.setVisible(false);
                        ob1.CreateTable(430, 100, 800, 500, rz2);
                        ob1.panel.add(ob1.scrollPane);
                    }

            }
        });


        ob1.panel.add(ob1.label);
        ob1.panel.add(ob1.textField);
        ob1.panel.add(ob1.button);
        ob1.panel.add(ob1.scrollPane);
        ob1.panel.add(ob2.textField);
        ob1.panel.add(ob2.button);
        frame.add(ob1.panel);
    }
}
