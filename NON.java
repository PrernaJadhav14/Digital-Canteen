package com.company;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

class NON extends JFrame implements ActionListener {

    private final Container c;
    private final JLabel title;
    private JLabel menu;
    private final JLabel j1;
    private final JLabel j2;
    private final JLabel list;
    private final JCheckBox a1;
    private final JCheckBox a2;
    private final JCheckBox a3;
    private final JCheckBox a4;
    private final JCheckBox a5;
    private final JCheckBox a6;
    private final JCheckBox a7;
    private final JCheckBox a8;
    private final JCheckBox b1;
    private final JCheckBox b2;
    private final JCheckBox b3;
    private final JCheckBox b4;
    private final JCheckBox b5;
    private final JCheckBox b6;
    private final JCheckBox b7;
    private final JCheckBox b8;
    private final JCheckBox c1;
    private final JCheckBox c2;
    private final JCheckBox c3;
    private final JCheckBox c4;
    private final JCheckBox c5;
    private final JCheckBox c6;
    private final JCheckBox c7;
    private final JCheckBox c8;
    private JRadioButton female;
    private ButtonGroup gengp;
    private final JLabel j3;
    private JLabel add;
    public JTextArea NonVbill;
    private JButton Button1,Final2;


    public NON()
    {
        setTitle("Menu");

        // setLocation(null);
        setBounds(300, 90, 1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);
        //      c.setBorder(new LineBorder(Color.blue));
        c.setBackground(Color.GRAY.brighter());


        list = new JLabel("Order-List");
        // title.setHorizontalAlignment(SwingConstants.CENTER);
        list.setForeground(Color.BLACK);
        list.setFont(new Font("Arial", Font.BOLD, 30));
        list.setSize(350, 70);
        list.setLocation(920, -20);
        c.add(list);

        title = new JLabel("Non-Veg Menu");
        // title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.RED);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setSize(350, 70);
        title.setLocation(350, 30);
        c.add(title);

        j1 = new JLabel("Morning Breakfast");
        j1.setForeground(Color.black.darker());
        j1.setFont(new Font("Arial", Font.BOLD, 20));
        j1.setSize(350, 70);
        j1.setLocation(85, 90);
        c.add(j1);

        j2 = new JLabel("Post-Lecture apetite");
        j2.setForeground(Color.black.darker());
        j2.setFont(new Font("Arial", Font.BOLD, 20));
        j2.setSize(350, 70);
        j2.setLocation(350, 90);
        c.add(j2);

        j3 = new JLabel("Pillaites Favourite");
        j3.setForeground(Color.red.darker().darker());
        j3.setFont(new Font("Arial", Font.BOLD, 20));
        j3.setSize(200, 70);
        j3.setLocation(600, 90);
        c.add(j3);


        a1 = new JCheckBox("Chiken Patice:60/-");
        a2 = new JCheckBox("Nuggets:80/-");
        a3 = new JCheckBox("Chiken Sandwich:60/-");
        a4 = new JCheckBox("Cheese Nuggets:100/-");
        a5 = new JCheckBox("Shawerma :120/-");
        a6 = new JCheckBox("Utapa:30/-");
        a7 = new JCheckBox("Dahi-Vada:40/-");
        a8 = new JCheckBox("Idli:20/-");
        a1.setFont(new Font("Arial", Font.BOLD, 20));
        a2.setFont(new Font("Arial", Font.BOLD, 20));
        a3.setFont(new Font("Arial", Font.BOLD, 20));
        a4.setFont(new Font("Arial", Font.BOLD, 20));
        a5.setFont(new Font("Arial", Font.BOLD, 20));
        a6.setFont(new Font("Arial", Font.BOLD, 20));
        a7.setFont(new Font("Arial", Font.BOLD, 20));
        a8.setFont(new Font("Arial", Font.BOLD, 20));
        a1.setSelected(false);
        a2.setSelected(false);
        a3.setSelected(false);
        a4.setSelected(false);
        a5.setSelected(false);
        a6.setSelected(false);
        a7.setSelected(false);
        a8.setSelected(false);
        a1.setSize(240, 20);
        a2.setSize(240, 20);
        a3.setSize(240, 20);
        a4.setSize(240, 20);
        a5.setSize(240, 20);
        a6.setSize(240, 20);
        a7.setSize(240, 20);
        a8.setSize(240, 20);
        a1.setLocation(85, 150);
        a2.setLocation(85, 190);
        a3.setLocation(85, 230);
        a4.setLocation(85, 270);
        a5.setLocation(85, 310);
        a6.setLocation(85, 350);
        a7.setLocation(85, 390);
        a8.setLocation(85, 430);
        c.add(a1);
        c.add(a2);
        c.add(a3);
        c.add(a4);
        c.add(a5);
        c.add(a6);
        c.add(a7);
        c.add(a8);


        b1 = new JCheckBox("Chiken-FriedRice:120/-");
        b2 = new JCheckBox("Butter-Chiken:200/-");
        b3 = new JCheckBox("Chiken Paratha:200/-");
        b4 = new JCheckBox("Chiken-Momos:120/-");
        b5 = new JCheckBox("Cheese-Momos:200/-");
        b6 = new JCheckBox("Chiken Frankie:90/-");
        b7 = new JCheckBox("Chiken-Burger:120/-");
        b8 = new JCheckBox("Idli");
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setSelected(false);
        b2.setSelected(false);
        b3.setSelected(false);
        b4.setSelected(false);
        b5.setSelected(false);
        b6.setSelected(false);
        b7.setSelected(false);
        b8.setSelected(false);
        b1.setSize(240, 20);
        b2.setSize(240, 20);
        b3.setSize(240, 20);
        b4.setSize(240, 20);
        b5.setSize(240, 20);
        b6.setSize(240, 20);
        b7.setSize(240, 20);
        b8.setSize(240, 20);
        b1.setLocation(350, 150);
        b2.setLocation(350, 190);
        b3.setLocation(350, 230);
        b4.setLocation(350, 270);
        b5.setLocation(350, 310);
        b6.setLocation(350, 350);
        b7.setLocation(350, 390);
        b8.setLocation(350, 430);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);

        c1 = new JCheckBox("Fried Rice:120/-");
        c2 = new JCheckBox("N-Veg thali:/200");
        c3 = new JCheckBox("Mattar-Paneer:120/-");
        c4 = new JCheckBox("NonV gobi:200/-");
        c5 = new JCheckBox("Veg-Sandwich");
        c6 = new JCheckBox("Utapa");
        c7 = new JCheckBox("Dahi-Vada");
        c8 = new JCheckBox("Idli");
        c1.setFont(new Font("Arial", Font.BOLD, 20));
        c2.setFont(new Font("Arial", Font.BOLD, 20));
        c3.setFont(new Font("Arial", Font.BOLD, 20));
        c4.setFont(new Font("Arial", Font.BOLD, 20));
        c5.setFont(new Font("Arial", Font.BOLD, 20));
        c6.setFont(new Font("Arial", Font.BOLD, 20));
        c7.setFont(new Font("Arial", Font.BOLD, 20));
        c8.setFont(new Font("Arial", Font.BOLD, 20));
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        c5.setSelected(false);
        c6.setSelected(false);
        c7.setSelected(false);
        c8.setSelected(false);
        c1.setSize(240, 20);
        c2.setSize(240, 20);
        c3.setSize(240, 20);
        c4.setSize(240, 20);
        c5.setSize(240, 20);
        c6.setSize(240, 20);
        c7.setSize(240, 20);
        c8.setSize(240, 20);
        c1.setLocation(600, 150);
        c2.setLocation(600, 190);
        c3.setLocation(600, 230);
        c4.setLocation(600, 270);
        c5.setLocation(600, 310);
        c6.setLocation(600, 350);
        c7.setLocation(600, 390);
        c8.setLocation(600, 430);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.add(c7);
        c.add(c8);

        Final2 = new JButton("Confirm");
        Final2.setSize(200,40);
        Final2.setFont(new Font("Arial", Font.BOLD, 20));
        Final2.setForeground(Color.BLACK.darker());
        Final2.setLocation(300,500);
        c.add(Final2);
        Final2.setBackground(Color.CYAN.brighter().brighter().brighter());
        Final2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Final2.addActionListener(this);

        Button1 = new JButton("Place-Order");
        Button1.setSize(200,40);
        Button1.setFont(new Font("Arial", Font.BOLD, 20));
        Button1.setForeground(Color.BLACK.darker().darker().darker());
        Button1.setLocation(600,500);
        Button1.setBackground(Color.BLUE.brighter().brighter().brighter().brighter());
        Button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        c.add(Button1);
        Button1.addActionListener(this);


        NonVbill = new JTextArea();
        NonVbill.setSize(350, 500);
        NonVbill.setLocation(850, 30);
        c.add(NonVbill);
        NonVbill.setFont(new Font("Arial", Font.PLAIN, 15));
        NonVbill.setLineWrap(true);
        NonVbill.setEditable(false);
        setVisible(true);


        //    gengp = new ButtonGroup();
        //    gengp.add(a1);
        //    gengp.add(a2);
        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Button1)
        {
            String D = " ";
            if (a1.isSelected()) {

                D = "Chiken Patice :"+60+"\n";
                //Vbill.setText("\n120");
            }
            if (a2.isSelected()) {
                D = D + "Nuggets : "+200+"\n";
            }
            if (a3.isSelected()) {

                D = D+"Chiken Sandwich:"+60+"\n";
                //Vbill.setText("\n120");
            }
            if (a4.isSelected()) {
                D = D + "Cheese Nuggets: "+100+"\n";
            }
            if (a5.isSelected()) {
                D = D + "Shawerma : "+120+"\n";
            }
            if (a6.isSelected()) {
                D = D + "Nuggets : "+200+"\n";
            }

            NonVbill.setFont(new Font("Arial", Font.PLAIN, 20));
            NonVbill.setText(D);
        }
        if(e.getSource()==Final2)
        {
            new com.company.bill();
            this.dispose();
        }


    }

    public static void main(String[] args) throws Exception
    {
        NON frame3 = new NON();
        //  f.setUndecorated(true);
        frame3.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red.darker().darker())
        );
    }
}
