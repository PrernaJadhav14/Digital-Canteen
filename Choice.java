package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

class Choice extends JFrame implements ActionListener {

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
    private JButton NonVEG,VEG,bev;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;


    // constructor, to initialize the components
    // with default values.
    public Choice()
    {
        setTitle("Pillai Canteen Login");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        newF = getContentPane();
        ImageIcon background=new ImageIcon("pizza.jpg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(300,80,700,500);
        newF.add(back);
        setVisible(true);
        newF = getContentPane();
        newF.setLayout(null);
        //      c.setBorder(new LineBorder(Color.blue));
        newF.setBackground(Color.BLACK.brighter());
        setVisible(true);

        title2 = new JLabel("Choose your Meal ");
        title2.setFont(new Font("Calibiri", Font.BOLD, 30));
        title2.setForeground(Color.white);
        title2.setSize(300, 40);
        title2.setLocation(300, 30);
        newF.add(title2);
        title2.setVisible(true);

        VEG = new JButton("VEG");
        VEG.setSize(100,40);
        VEG.setFont(new Font("Arial", Font.BOLD, 20));
        VEG.setLocation(35,200);
        VEG.setBackground(Color.GREEN);
        newF.add(VEG);
        VEG.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        VEG.addActionListener(this);

        NonVEG = new JButton("NON-VEG");
        NonVEG.setSize(200,40);
        NonVEG.setFont(new Font("Arial", Font.BOLD, 20));
        NonVEG.setLocation(700,200);
        NonVEG.setBackground(Color.RED.brighter().brighter());
        NonVEG.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        newF.add(NonVEG);
        NonVEG.addActionListener(this);

        bev = new JButton("BEVERAGE");
        bev.setSize(200,40);
        bev.setFont(new Font("Arial", Font.BOLD,20));
        bev.setLocation(330,480);
        bev.setBackground(Color.YELLOW.brighter().brighter());
        bev.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        newF.add(bev);
        bev.addActionListener(this);

        gengp = new ButtonGroup();
        gengp.add(VEG);
        gengp.add(NonVEG);
        gengp.add(bev);
        //

    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == VEG )
        {
            new com.company.VegMenu().setVisible(true);
            this.dispose();
            // setVisible(true);
        }
       else if (e.getSource() == NonVEG )
        {
            new com.company.NON().setVisible(true);
            this.dispose();
        }
        else
        {
            this.dispose();
        }
    }

    public static void main(String[] args) throws Exception
    {
        Choice frame2 = new Choice();
        ImageIcon icon = new ImageIcon("pillai1.png");
        frame2.setIconImage(icon.getImage());
        frame2.getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED.darker().darker()));
    }
}
