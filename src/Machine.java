import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Machine extends JFrame implements MouseListener {


    private JPanel j1 = new JPanel(new BorderLayout());
    private JPanel endPage = new JPanel(new FlowLayout());
    private JPanel j2 = new JPanel(new GridLayout(0, 3, 5, 0));
    private JPanel j7 = new JPanel(new GridLayout(0,2,10,10));
    private JPanel j5 = new JPanel(new GridLayout(0, 3, 10, 10));

   private JLabel title1 = new JLabel("Put the money in and choose the drink you want.");

    private JButton btnEnd = new JButton("Your purchase has been completed!");
    ImageIcon b1 = new ImageIcon("images/coffee.png");
    JLabel imagelabel1 = new JLabel(b1);
    ImageIcon b2 = new ImageIcon("images/juice.png");
    JLabel imagelabel2 = new JLabel(b2);
    ImageIcon b3 = new ImageIcon("images/coka.png");
    JLabel imagelabel3 = new JLabel(b3);

    private JLabel name1 = new JLabel("COFFEE | 1200₩");
    private JLabel name2 = new JLabel("JUICE | 1100₩");
    private JLabel name3 = new JLabel("COKE | 1400₩");

    private JLabel l1 = new JLabel("0");
    private JButton bu1 = new JButton("+1");
    private JButton bu4 = new JButton("-1");

    private JLabel l2 = new JLabel("0");
    private JButton bu2 = new JButton("+1");
    private JButton bu5 = new JButton("-1");

    private JLabel l3 = new JLabel("0");
    private JButton bu3 = new JButton("+1");
    private JButton bu6 = new JButton("-1");

    private JLabel s3 = new JLabel("0");
    private JButton ss3 = new JButton("INPUT(Only 1000₩)");

    private JLabel s4 = new JLabel("0");
    private JButton ss4 = new JButton("CHANGE");

    private JLabel s2 = new JLabel("0");
    private JButton ss2 = new JButton("PURCHASE!");

    private static int Num1 = 0;
    private static int Num2 = 0;
    private static int Num3 = 0;
    private static int Num4 = 0;
    private static int Num5 = 0;
    private static int Num6 = 0;


    public Machine()
    {
        super("COFFEE MACHINE");

        init();
        start();
    }

    public void init()
    {
        this.setSize(600, 600);

        j2.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));


        name1.setFont(new Font("굴림", Font.BOLD, 15));
        name2.setFont(new Font("굴림", Font.BOLD, 15));
        name3.setFont(new Font("굴림", Font.BOLD, 15));
        btnEnd.setFont(new Font("굴림", Font.BOLD, 15));

        endPage.add(btnEnd);

        j1.add(title1);

        this.add("North", j1);

        j1.setBackground(Color.ORANGE);

        this.add("Center", j5);
        j5.add(imagelabel1);
        j5.add(imagelabel2);
        j5.add(imagelabel3);
        j5.add(name1);
        j5.add(name2);
        j5.add(name3);
        j5.add(l1);
        j5.add(l2);
        j5.add(l3);
        j5.add(bu1);
        j5.add(bu2);
        j5.add(bu3);
        j5.add(bu4);
        j5.add(bu5);
        j5.add(bu6);
        j5.setBackground(Color.WHITE);

        j7.add(s3);
        j7.add(ss3);

        j7.add(s4);
        j7.add(ss4);


        j7.add(s2);
        j7.add(ss2);
        this.add("South", j7);

        title1.setHorizontalAlignment(title1.CENTER);

        l1.setHorizontalAlignment(l1.CENTER);
        l2.setHorizontalAlignment(l2.CENTER);
        l3.setHorizontalAlignment(l3.CENTER);


        name1.setHorizontalAlignment(name1.CENTER);
        name2.setHorizontalAlignment(name2.CENTER);
        name3.setHorizontalAlignment(name3.CENTER);

        bu1.setHorizontalAlignment(bu1.CENTER);
        bu2.setHorizontalAlignment(bu2.CENTER);
        bu3.setHorizontalAlignment(bu3.CENTER);
        bu4.setHorizontalAlignment(bu4.CENTER);
        bu5.setHorizontalAlignment(bu5.CENTER);
        bu6.setHorizontalAlignment(bu6.CENTER);

        s2.setHorizontalAlignment(s2.CENTER);
        s3.setHorizontalAlignment(s3.CENTER);
        s4.setHorizontalAlignment(s4.CENTER);



        j1.setPreferredSize(new Dimension(70, 70));
        j5.setPreferredSize(new Dimension(380, 380));
        j7.setPreferredSize(new Dimension(150, 150));



        this.getContentPane().add(j1, BorderLayout.NORTH);
        this.getContentPane().add(j5, BorderLayout.CENTER);
        this.getContentPane().add(j7, BorderLayout.SOUTH);

        endPage.setVisible(false);

        this.setVisible(true);


        ss2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().add(endPage, BorderLayout.CENTER);
                endPage.setVisible(true);
                j1.setVisible(false);
                j5.setVisible(false);
                j7.setVisible(false);
            }

        });

        btnEnd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

    }


    public void start() {
        bu1.addMouseListener(this);
        bu2.addMouseListener(this);
        bu3.addMouseListener(this);
        bu4.addMouseListener(this);
        bu5.addMouseListener(this);
        bu6.addMouseListener(this);
        ss3.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        int val = 0;
        int input = 0;
        int sub = 0;

        if (e.getSource() == (JButton) bu1) {
            val = Integer.parseInt(s2.getText());
            val += 1200;
            this.Num1 = this.Num1 + 1;
            sub = Integer.parseInt(s4.getText());
            sub -= 1200;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
            s4.setText(String.valueOf(sub));
        } else if (e.getSource() == (JButton) bu4) {
            val = Integer.parseInt(s2.getText());
            val -= 1200;
            this.Num1 = this.Num1 - 1;
            sub = Integer.parseInt(s4.getText());
            sub += 1200;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
            s4.setText(String.valueOf(sub));
        } else if (e.getSource() == (JButton) bu2) {
            val = Integer.parseInt(s2.getText());
            val += 1100;
            this.Num2 = this.Num2 + 1;
            sub = Integer.parseInt(s4.getText());
            sub -= 1100;
            s4.setText(String.valueOf(sub));
            l2.setText(String.valueOf(Num2));
            s2.setText(String.valueOf(val));
        } else if (e.getSource() == (JButton) bu5) {
            val = Integer.parseInt(s2.getText());
            val -= 1100;
            this.Num2 = this.Num2 - 1;
            sub = Integer.parseInt(s4.getText());
            sub += 1100;

            l2.setText(String.valueOf(Num2));
            s2.setText(String.valueOf(val));
            s4.setText(String.valueOf(sub));
        } else if (e.getSource() == (JButton) bu3) {
            val = Integer.parseInt(s2.getText());
            val += 1400;
            this.Num3 = this.Num3 + 1;
            sub = Integer.parseInt(s4.getText());
            sub -= 1400;
            s4.setText(String.valueOf(sub));
            l3.setText(String.valueOf(Num3));
            s2.setText(String.valueOf(val));
        } else if (e.getSource() == (JButton) bu6) {
            val = Integer.parseInt(s2.getText());
            val -= 1400;
            this.Num3 = this.Num3 - 1;
            sub = Integer.parseInt(s4.getText());
            sub += 1400;
            s4.setText(String.valueOf(sub));
            l3.setText(String.valueOf(Num3));
            s2.setText(String.valueOf(val));

        }
        else if (e.getSource() == (JButton) ss2) {
            s2.setText("0");

        }
        else if(e.getSource() == ss3){
            input = Integer.parseInt(s3.getText());
            input += 1000;

            sub = Integer.parseInt(s4.getText());
            sub += 1000;
            s4.setText(String.valueOf(sub));
            s3.setText(String.valueOf(input));

        }


    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }



}



