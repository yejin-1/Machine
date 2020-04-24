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
import javax.swing.text.JTextComponent;


public class Machine extends JFrame implements MouseListener {

    JFrame frame = new JFrame();


    private JPanel j1 = new JPanel(new BorderLayout());
    private JPanel endPage = new JPanel(new FlowLayout());
    private JPanel j2 = new JPanel(new GridLayout(0, 3, 5, 0));
    private JPanel j3 = new JPanel(new FlowLayout());
    private JPanel j6 = new JPanel(new GridLayout(0, 6, 10, 5));
    private JPanel j5 = new JPanel(new GridLayout(0, 3, 10, 10));


    private JLabel title = new JLabel("음식 자판기");
    private JButton btnEnd = new JButton("구매가 완료되었습니다!");
    ImageIcon b1 = new ImageIcon("./image/food1.jpg");
    JLabel imagelabel1 = new JLabel(b1);
    ImageIcon b2 = new ImageIcon("./image/food2.jpg");
    JLabel imagelabel2 = new JLabel(b2);
    ImageIcon b3 = new ImageIcon("./image/food3.jpg");
    JLabel imagelabel3 = new JLabel(b3);

    private JLabel name1 = new JLabel("햄버거 : 1300원");
    private JLabel name2 = new JLabel("치킨 : 1200원");
    private JLabel name3 = new JLabel("콜라 : 1400원");

    private JLabel l1 = new JLabel("0");
    private JButton bu1 = new JButton("+1");
    private JButton bu4 = new JButton("-1");

    private JLabel l2 = new JLabel("0");
    private JButton bu2 = new JButton("+1");
    private JButton bu5 = new JButton("-1");

    private JLabel l3 = new JLabel("0");
    private JButton bu3 = new JButton("+1");
    private JButton bu6 = new JButton("-1");

    private JTextField s1 = new JTextField("0");
    private JButton ss1 = new JButton("시작");

    private JLabel s3 = new JLabel("0");
    private JButton ss3 = new JButton("투입금액");
    private JButton ss5 = new JButton("10000원");
    private JButton ss8 = new JButton("-10000원");
    private JButton ss6 = new JButton("1000원");
    private JButton ss7 = new JButton("-1000원");


    private JLabel s8 = new JLabel("");
    private JLabel s9 = new JLabel("");
    private JLabel s4 = new JLabel("0");
    private JButton ss4 = new JButton("거스름돈");

    private JLabel s2 = new JLabel("0");
    private JButton ss2 = new JButton("구매");


    private static int Num1 = 0;
    private static int Num2 = 0;
    private static int Num3 = 0;
    private static int Num4 = 0;
    private static int Num5 = 0;
    private static int Num6 = 0;


    public Machine()
    {
        super("자판기");

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
        j1.add(title);
        this.add("North", j1);

        endPage.add(btnEnd);

        j2.add(imagelabel1);
        j2.add(imagelabel2);
        j2.add(imagelabel3);
        this.add("North", j2);


        this.add("Center", j5);
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

        j3.add(s1);
        j3.add(ss1);
        this.add("South", j3);

        j6.add(s3);
        j6.add(ss3);
        j6.add(ss5);
        j6.add(ss8);
        j6.add(ss6);
        j6.add(ss7);

        this.add("South", j6);
        j6.add(s8);
        j6.add(s4);
        j6.add(ss4);

        j6.add(s2);
        j6.add(ss2);
        j6.add(s9);
        this.add("South", j6);


        l1.setHorizontalAlignment(l1.CENTER);
        l2.setHorizontalAlignment(l2.CENTER);
        l3.setHorizontalAlignment(l3.CENTER);

        bu1.setHorizontalAlignment(bu1.CENTER);
        bu2.setHorizontalAlignment(bu2.CENTER);
        bu3.setHorizontalAlignment(bu3.CENTER);
        bu4.setHorizontalAlignment(bu4.CENTER);
        bu5.setHorizontalAlignment(bu5.CENTER);
        bu6.setHorizontalAlignment(bu6.CENTER);

        s1.setHorizontalAlignment(s1.CENTER);
        s2.setHorizontalAlignment(s2.CENTER);

        s3.setHorizontalAlignment(s3.CENTER);
        s4.setHorizontalAlignment(s4.CENTER);

        j2.setPreferredSize(new Dimension(200, 200));
        j3.setPreferredSize(new Dimension(100, 100));
        j6.setPreferredSize(new Dimension(100, 100));
        j5.setPreferredSize(new Dimension(100, 100));


        this.getContentPane().add(j1, BorderLayout.NORTH);
        this.getContentPane().add(j2, BorderLayout.NORTH);
        this.getContentPane().add(j5, BorderLayout.CENTER);
        this.getContentPane().add(j3, BorderLayout.SOUTH);
        this.getContentPane().add(j6, BorderLayout.SOUTH);

        endPage.setVisible(false);

        this.setVisible(true);


        ss2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().add(endPage, BorderLayout.CENTER);
                endPage.setVisible(true);
                j2.setVisible(false);
                j3.setVisible(false);
                j5.setVisible(false);
                j6.setVisible(false);
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
        ss5.addMouseListener(this);
        ss6.addMouseListener(this);
        ss7.addMouseListener(this);
        ss8.addMouseListener(this);

    }

    public void mouseClicked(MouseEvent e) {
        int val = 0;
        int input = 0;
        int sub = 0;

        if (e.getSource() == (JButton) bu1) {
            val = Integer.parseInt(s2.getText());
            val += 1300;
            this.Num1 = this.Num1 + 1;
            sub = Integer.parseInt(s4.getText());
            sub -= 1300;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
            s4.setText(String.valueOf(sub));
        } else if (e.getSource() == (JButton) bu4) {
            val = Integer.parseInt(s2.getText());
            val -= 1300;
            this.Num1 = this.Num1 - 1;
            sub = Integer.parseInt(s4.getText());
            sub += 1300;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
            s4.setText(String.valueOf(sub));
        } else if (e.getSource() == (JButton) bu2) {
            val = Integer.parseInt(s2.getText());
            val += 1200;
            this.Num2 = this.Num2 + 1;
            sub = Integer.parseInt(s4.getText());
            sub -= 1200;
            s4.setText(String.valueOf(sub));
            l2.setText(String.valueOf(Num2));
            s2.setText(String.valueOf(val));
        } else if (e.getSource() == (JButton) bu5) {
            val = Integer.parseInt(s2.getText());
            val -= 1200;
            this.Num2 = this.Num2 - 1;
            sub = Integer.parseInt(s4.getText());
            sub += 1200;

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
        } else if (e.getSource() == (JButton) ss2) {
            s2.setText("0");
        } else if (e.getSource() == ss5) {
            input = Integer.parseInt(s3.getText());
            input += 10000;
            sub = Integer.parseInt(s4.getText());
            sub += 10000;
            s4.setText(String.valueOf(sub));
            s3.setText(String.valueOf(input));
        } else if (e.getSource() == (JButton) ss6) {
            input = Integer.parseInt(s3.getText());
            input += 1000;
            sub = Integer.parseInt(s4.getText());
            sub += 1000;
            s4.setText(String.valueOf(sub));
            s3.setText(String.valueOf(input));

        } else if (e.getSource() == ss8) {
            input = Integer.parseInt(s3.getText());
            input -= 10000;
            sub = Integer.parseInt(s4.getText());
            sub -= 10000;
            s4.setText(String.valueOf(sub));
            s3.setText(String.valueOf(input));

        } else if (e.getSource() == ss7) {
            input = Integer.parseInt(s3.getText());
            input -= 1000;

            sub = Integer.parseInt(s4.getText());
            sub -= 1000;
            s4.setText(String.valueOf(sub));
            s3.setText(String.valueOf(input));

        } else if (e.getSource() == ss3) {
            s3.setText("0");
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

