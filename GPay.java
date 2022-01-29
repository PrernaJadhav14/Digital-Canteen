package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GPay extends JFrame implements ActionListener {

    // Components of the Form
    private Container newF;
    private JLabel title2;
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
    public GPay()
    {
        setTitle("Gpay");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        tadd.setText("                                    NOTE                   "+"\n"+"        *If You are paying online then your order"+"\n"+" will be dilivered"+
                        " on your table."+"\n"+"         *If your paying money on counter your order"+"\n"+" will " +
                " be received after payment");
        tadd.setSize(700, 200);
        tadd.setLocation(100, 30);
        newF.add(tadd);


        back = new JButton();
        proceed = new JButton();
        newF.add(back,proceed);

        back = new JButton("BACK");
        back.setSize(100,40);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.setLocation(100,300);
       // back.setBackground(Color.GREEN);
        newF.add(back);
        back.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        back.addActionListener(this);



        gengp = new ButtonGroup();
        gengp.add(back);

    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()== back)
       {
           new com.company.bill().setVisible(true);
           this.dispose();
       }
    }

    public static void main(String[] args) throws Exception
    {
        GPay frame3 = new GPay();
        ImageIcon icon = new ImageIcon("pillai1.png");
        frame3.setIconImage(icon.getImage());
        frame3.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED.darker().darker()));
    }
}

