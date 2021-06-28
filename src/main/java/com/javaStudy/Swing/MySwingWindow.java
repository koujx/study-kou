package com.javaStudy.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 902 on 2016/4/8.
 */
public class MySwingWindow extends JFrame {
    private JLabel myLabel;
    private JTextField myTextField;
    private JButton myButton;
    private JCheckBox myCheckBox;

    public MySwingWindow(){
        super();
        this.setSize(500, 500);
        this.setLocation(450, 300);
        this.getContentPane().setLayout(null);
        this.setTitle("My FIRST Swing Window");
        this.add(getJLabel(),null);
        this.add(getJButton(), null);
        this.add(getJTextField(), null);
        this.add(getJCheckBox(),null);
    }

    private JLabel getJLabel(){
        if(myLabel == null){
            myLabel = new JLabel();
            myLabel.setBounds(5, 10, 250, 30);
            myLabel.setText("Hello!Welcome to kou's Window");
        }
        return myLabel;
    }

    private JTextField getJTextField(){
        if(myTextField==null){
            myTextField = new JTextField();
            myTextField.setBounds(5,45,200,30);
            myTextField.setText("kou jia xing");
        }
        return myTextField;
    }

    private JButton getJButton(){
        if(myButton == null){
            myButton = new JButton();
            myButton.setBounds(5, 80, 100, 40);
            myButton.setText("Click me!");
            myButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    myLabel.setForeground(Color.RED);
                    myTextField.setBackground(Color.BLUE);
                }
            });
        }
        return myButton;
    }

    private JCheckBox getJCheckBox(){
        if(myCheckBox == null){
            myCheckBox = new JCheckBox();
            myCheckBox.setBounds(5, 120, 200, 30);
            myCheckBox.setText("kou");
        }
        return myCheckBox;
    }


    public static void main(String[] args){
        MySwingWindow window = new MySwingWindow();
        window.setVisible(true);
    }
}
