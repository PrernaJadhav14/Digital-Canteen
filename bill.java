package com.company;

import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.concurrent.locks.Condition;

class bill extends JFrame implements ActionListener {

    //Canvas C = new Canvas();
    JPanel j = new JavaPanel();
    // Components of the Form

    private Container c,n;
    private JLabel title;
    private JLabel menu,j1,j2;
    private JTextField tname;
    private JLabel query;
    private JTextField tmno;
    private JLabel amount,slash,option;
    private ButtonGroup gengp;

    private JCheckBox term;
    private JButton online,offline,condition;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;


    public bill()
    {
        setTitle("BILL");

        setBounds(300, 90, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        c = getContentPane();
        ImageIcon background=new ImageIcon("pillai1.png");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
        //   Imbackground=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(350,90,800,600);
        c.add(back);
        setVisible(true);
        c = getContentPane();
        c.setLayout(null);
        //      c.setBorder(new LineBorder(Color.blue));
        c.setBackground(Color.BLACK.brighter());

        title = new JLabel("Bill Payment");
        // title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.RED);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setSize(350, 70);
        title.setLocation(280, 30);
        c.add(title);

        amount = new JLabel("Total Bill: ");
        amount.setFont(new Font("Arial", Font.BOLD, 40));
        amount.setForeground(Color.white);
        amount.setSize(350, 50);
        amount.setLocation(30, 100);
        c.add(amount);
        amount.setVisible(true);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.BOLD, 20));
        tname.setText("120");
        tname.setSize(250, 50);
        tname.setLocation(230, 100);
        c.add(tname);

        slash = new JLabel("/-");
        slash.setFont(new Font("Arial", Font.BOLD, 40));
        slash.setForeground(Color.white);
        slash.setSize(350, 50);
        slash.setLocation(490, 100);
        c.add(slash);
        slash.setVisible(true);

        option = new JLabel("*Choose the billing option: ");
        option.setFont(new Font("Arial", Font.BOLD, 20));
        option.setForeground(Color.white);
        option.setSize(300, 40);
        option.setLocation(30, 400);
        c.add(option);
        option.setVisible(true);

        online = new JButton("Online/Gpay");
        online.setForeground(Color.black);
        online.setFont(new Font("Arial", Font.BOLD, 20));
        online.setSize(150, 40);
        online.setLocation(320, 400);
       // online.addActionListener(this);
        c.add(online);
        online.addActionListener(this);
        offline = new JButton("Offline");
        offline.setForeground(Color.black);
        offline.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        online.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        offline.setFont(new Font("Arial", Font.BOLD, 20));
        offline.setSize(150, 40);
        offline.setLocation(500, 400);
        offline.addActionListener(this);
        // online.addActionListener(this);
        c.add(offline);


        condition = new JButton("Check Condition");
        condition.setForeground(Color.black);
        condition.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        condition.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        condition.setFont(new Font("Arial", Font.BOLD, 10));
        condition.setSize(150, 40);
        condition.setLocation(100, 500);
        condition.addActionListener(this);
        // online.addActionListener(this);
        c.add(condition);

        query = new JLabel("<---- Payment related query");
        query.setFont(new Font("Arial", Font.BOLD, 30));
        query.setForeground(Color.white);
        query.setSize(400, 40);
        query.setLocation(250, 500);
        c.add(query);
           gengp = new ButtonGroup();
           gengp.add(online);
           gengp.add(offline);
           gengp.add(condition);



        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == offline)
        {
            new com.company.Offline().setVisible(true);
            this.dispose();
        }
        else if(e.getSource() == online)
        {
            new com.company.Online().setVisible(true);
            this.dispose();
        }
        else
        {
            new com.company.GPay().setVisible(true);
            this.dispose();
        }


    }





    public static void main(String[] args) throws Exception
    {
        bill b = new bill();
        //  f.setUndecorated(true);
        b.getRootPane().setBorder( BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red.darker().darker()));
      //  b.setVisible(true);


    }

}
