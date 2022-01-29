// Java program to implement
// a Simple Registration Form
// using Java Swing
package com.company;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.Timer;
import java.awt.event.*;

class VegMenu extends JFrame implements ActionListener {

    private Container c;
    public JTextArea Vbill;
    private JLabel title,list1;
    private JLabel menu,j1,j2,j3;
    private JCheckBox a1,a2,a3,a4,a5,a6,a7,a8;
    private JCheckBox b1,b2,b3,b4,b5,b6,b7,b8;
    private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    private JButton Button,Final;


    public VegMenu()
    {
        setTitle("Veg-Menu");
        setBounds(300, 90, 1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);
  //      c.setBorder(new LineBorder(Color.blue));
        c.setBackground(Color.GRAY.brighter());

        list1 = new JLabel("Order-List");
        // title.setHorizontalAlignment(SwingConstants.CENTER);
        list1.setForeground(Color.BLACK);
        list1.setFont(new Font("Arial", Font.BOLD, 30));
        list1.setSize(350, 70);
        list1.setLocation(920, -20);
        c.add(list1);

        title = new JLabel("Veg Menu");
       // title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.GREEN.darker());
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
        j3.setForeground(Color.orange.darker().darker());
        j3.setFont(new Font("Arial", Font.BOLD, 20));
        j3.setSize(350, 70);
        j3.setLocation(600, 90);
        c.add(j3);


        a1 = new JCheckBox("Samosa:30/-");
        a2 = new JCheckBox("Patise:30/-");
        a3 = new JCheckBox("Mendu Vada:40/-");
        a4 = new JCheckBox("Idli:30/-");
        a5 = new JCheckBox("Veg-Sandwich:30/-");
        a6 = new JCheckBox("Utapa:30/-");
        a7 = new JCheckBox("Dahi-Vada:45/-");
        a8 = new JCheckBox("Special Idli:30/-");
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

        b1 = new JCheckBox("Veg-Fried Rice:200");
        b2 = new JCheckBox("Veg thali:120/-");
        b3 = new JCheckBox("Mattar-Paneer:200/-");
        b4 = new JCheckBox("Aloo gobi:100/-");
        b5 = new JCheckBox("Veg-Sandwich:50/-");
        b6 = new JCheckBox("Utapa:50/-");
        b7 = new JCheckBox("Veg-Soup:85/-");
        b8 = new JCheckBox("Veg Burger:60/-");
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


        c1 = new JCheckBox("Veg-Fried Rice");
        c2 = new JCheckBox("Veg thali");
        c3 = new JCheckBox("Mattar-Paneer");
        c4 = new JCheckBox("Aloo gobi");
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

        Button = new JButton("Place-Order");
        Button.setSize(200,40);
        Button.setFont(new Font("Arial", Font.BOLD, 20));
        Button.setForeground(Color.BLACK.darker());
        Button.setLocation(600,500);
        c.add(Button);
        Button.setBackground(Color.BLUE.brighter().brighter().brighter().brighter());
        Button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Button.addActionListener(this);

        Final = new JButton("Confirm");
        Final.setSize(200,40);
        Final.setFont(new Font("Arial", Font.BOLD, 20));
        Final.setForeground(Color.BLACK.darker());
        Final.setLocation(300,500);
        c.add(Final);
        Final.setBackground(Color.CYAN.brighter().brighter().brighter());
        Final.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Final.addActionListener(this);

        Vbill = new JTextArea();
        Vbill.setSize(350, 500);
        Vbill.setLocation(850, 30);
        c.add(Vbill);
        Vbill.setFont(new Font("Arial", Font.PLAIN, 15));
        // bill.setLineWrap(true);
        //Vbill.setEditable(false);
        //setVisible(true);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Button)
        {
            String D = " ";
            if (a1.isSelected()) {

                D = "Samosa:"+30+"\n";
                //Vbill.setText("\n120");
            }
            if (a2.isSelected()) {
                D = D + "Patise:"+60+"\n";
            }
            if (a3.isSelected()) {

                D = D+"Mendu Vada:"+40+"\n";
                //Vbill.setText("\n120");
            }
            if (a4.isSelected()) {
                D = D + "Idli:"+30+"\n";
            }
            if (a5.isSelected()) {

                D = D+"Veg-Sandwich:"+30+"\n";
                //Vbill.setText("\n120");
            }
            if (a6.isSelected()) {
                D = D + "Utapa:"+30+"\n";
            }
            if (a7.isSelected()) {

                D = D+ "Dahi-Vada:"+45+"\n";
                //Vbill.setText("\n120");
            }

            Vbill.setFont(new Font("Arial", Font.PLAIN, 20));
            Vbill.setText(D);

        }

        if(e.getSource()== Final)
        {
            new com.company.bill();
            this.dispose();
        }
        }



    public static void main(String[] args) throws Exception
    {
        VegMenu f = new VegMenu();
      //  f.setUndecorated(true);
        f.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN.darker().darker())
        );
    }
}
