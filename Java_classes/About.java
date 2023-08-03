package Electricity;

// no need to connect this to the database
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;        //awt


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;          //swing

public class About extends JFrame implements ActionListener {   //ActionListerner interface from awt  ,JFram class form swing

    //swing
    JButton b1;
    JLabel l1;

    //awt
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);  //layout defaut
        JButton b1 = new JButton("Exit");   //incialing the button (with the button text name as  "exit")
        add(b1);  //adding the button
        b1.setBounds(180, 430, 120, 20); //setting the bounds for the button
        b1.addActionListener(this);  //onclick action

        Font f = new Font("RALEWAY", Font.BOLD, 180); //incialise font by the style,bold,size
        setFont(f);

        s = "                                    About us!         \n  "
                + "\nElectricity Billing System is a software-based application "
                + "developed in Java programming language. The project aims at serving"
                + "the department of electricity by computerizing the billing system. "
                + "It mainly focuses on the calculation of Units consumed during the "
                + "specified time and the money to be paid to electricity offices. "
                + "This computerized system will make the overall billing system easy, "
                + "accessible, comfortable and effective for consumers.\n\n"
                +  " \n\n"
                +  "   copyrights -  Manoj B\n\n"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL); //passing the string || x and y corrdinate || verticaly scrollable
        t1.setEditable(false); //we can't edit
        t1.setBounds(20, 100, 450, 300); //set bound for the textarea

        add(t1);  //add the textarea to the frame

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);      //set the font to our textarea

        Container contentPane = this.getContentPane();   //geting the contents from the Jfram


        t1 = new TextArea();    //inciallising the new textarea

        JLabel l1 = new JLabel("About Project");
        add(l1);      //incialling and adding the lable
        l1.setBounds(170, 10, 180, 80);   //set bounds x,y ||width, hight
        l1.setForeground(Color.red);        //set color

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);  //bounds for the jframes

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {  // onclick action input e
        dispose(); //it will be disposed on the press of "exit"
    }

    public static void main(String args[]) {

        new About().setVisible(true);  //  //it will open the about window
    }

}
