package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Offline extends JFrame implements ActionListener {

    // Components of the Form
    private Container newF;
    private JLabel img1,notice;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton back,proceed;


    // constructor, to initialize the components
    // with default values.
    public Offline()
    {
        setTitle("Gpay");
        setBounds(300, 90, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        newF = getContentPane();

        setVisible(true);
        newF = getContentPane();
        newF.setLayout(null);
        //      c.setBorder(new LineBorder(Color.blue));
        newF.setBackground(Color.BLACK.brighter());
        setVisible(true);

        tadd = new JTextArea();
        tadd.setBackground(Color.BLACK);
        tadd.setFont(new Font("Arial", Font.BOLD,30));
        tadd.setForeground(Color.WHITE);
        tadd.setWrapStyleWord(true);
        tadd.setText("                  Your order has been placed!"+"\n"+"Please "+
                "address your table number and pay bill"+"\n"+"     on the counter to get your tummy full!"+"\n"+"Have a nice Pillaite,we are "+
                "proud to have you!!"+"\n"+"                             Thank you"+"\n"+
                "--------------------------------------------------------------");




        tadd.setSize(700, 200);
        tadd.setLocation(100, 30);
        newF.add(tadd);

        notice = new JLabel("Notice");
        // title.setHorizontalAlignment(SwingConstants.CENTER);
        notice.setForeground(Color.RED);
        notice.setFont(new Font("Arial", Font.BOLD, 30));
        notice.setSize(350, 70);
        notice.setLocation(350,207);
        newF.add(notice);

        ImageIcon background=new ImageIcon("hostel1.png");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
        JLabel img1=new JLabel(background);
        img1.setLayout(null);
        img1.setBounds(90,260,650,420);
        newF.add(img1);
        setVisible(true);



    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {

    }

    public static void main(String[] args) throws Exception
    {
        Offline frame3 = new Offline();
        ImageIcon icon = new ImageIcon("pillai1.png");
        frame3.setIconImage(icon.getImage());
        frame3.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED.darker().darker()));
    }
}

