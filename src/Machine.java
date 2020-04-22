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



public class Machine extends JFrame implements MouseListener
{
    JFrame frame = new JFrame();


    private JPanel j1= new JPanel(new BorderLayout());
    private JPanel endPage = new JPanel(new FlowLayout());
    private JPanel j2= new JPanel (new GridLayout(0, 3, 5, 0));
    private JPanel j3= new JPanel (new FlowLayout());
    private JPanel j4= new JPanel (new FlowLayout());
    private JPanel j5= new JPanel (new GridLayout(0, 3, 10, 10));

    private JLabel title = new JLabel("음료수 자판기");
    private JButton btnEnd = new JButton("구매가 완료되었습니다!");
    ImageIcon b1 = new ImageIcon("C:\\Users\\dpfls\\eclipse-workspace\\Japangi\\src\\coffee.png");
    JLabel imagelabel1 = new JLabel(b1);
    ImageIcon b2 = new ImageIcon("C:\\Users\\dpfls\\eclipse-workspace\\Japangi\\src\\milk.png");
    JLabel imagelabel2 = new JLabel(b2);
    ImageIcon b3 = new ImageIcon("C:\\Users\\dpfls\\eclipse-workspace\\Japangi\\src\\cola.png");
    JLabel imagelabel3 = new JLabel(b3);

    private JLabel name1 = new JLabel("커피 : 1300원");
    private JLabel name2 = new JLabel("바나나우유 : 1200원");
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

    private JLabel s2 = new JLabel("0");
    private JButton ss2 = new JButton("구매");

    private static int Num1=0;
    private static int Num2=0;
    private static int Num3=0;





    public Machine()
    {
        super("자판기");

        init();
        start();
    }

    public void init()
    {
        this.setSize(600,600);

        j2.setBorder(BorderFactory.createEmptyBorder(50 , 0 , 0, 0));


        name1.setFont(new Font("굴림", Font.BOLD, 15));
        name2.setFont(new Font("굴림", Font.BOLD, 15));
        name3.setFont(new Font("굴림", Font.BOLD, 15));
        btnEnd.setFont(new Font("굴림", Font.BOLD, 15));
        j1.add(title);
        this.add("North",j1);

        endPage.add(btnEnd);

        j2.add(imagelabel1);
        j2.add(imagelabel2);
        j2.add(imagelabel3);
        this.add("North",j2);


        this.add("Center",j5);
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
        this.add("South",j3);

        j4.add(s2);
        j4.add(ss2);
        this.add("South",j4);

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

        j2.setPreferredSize(new Dimension(200, 200));
        j3.setPreferredSize(new Dimension(100,100));
        j4.setPreferredSize(new Dimension(100,100));
        j5.setPreferredSize(new Dimension(100,100));

        this.getContentPane().add(j1,BorderLayout.NORTH);
        this.getContentPane().add(j2,BorderLayout.NORTH);
        this.getContentPane().add(j5,BorderLayout.CENTER);
        this.getContentPane().add(j3,BorderLayout.SOUTH);
        this.getContentPane().add(j4,BorderLayout.SOUTH);

        endPage.setVisible(false);

        this.setVisible(true);


        ss2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().add(endPage,BorderLayout.CENTER);
                endPage.setVisible(true);
                j2.setVisible(false);
                j3.setVisible(false);
                j4.setVisible(false);
                j5.setVisible(false);
            }

        });

        btnEnd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });







    }


    public void start()
    {
        bu1.addMouseListener(this);
        bu2.addMouseListener(this);
        bu3.addMouseListener(this);
        bu4.addMouseListener(this);
        bu5.addMouseListener(this);
        bu6.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        int val=0;
        if(e.getSource()==(JButton)bu1)
        {
            val=Integer.parseInt(s2.getText());
            val+=1300;

            this.Num1=this.Num1+1;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)bu4)
        {
            val=Integer.parseInt(s2.getText());
            val-=1300;

            this.Num1=this.Num1-1;

            l1.setText(String.valueOf(Num1));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)bu2)
        {
            val=Integer.parseInt(s2.getText());
            val+=1200;

            this.Num2=this.Num2+1;

            l2.setText(String.valueOf(Num2));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)bu5)
        {
            val=Integer.parseInt(s2.getText());
            val-=1200;

            this.Num2=this.Num2-1;

            l2.setText(String.valueOf(Num2));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)bu3)
        {
            val=Integer.parseInt(s2.getText());
            val+=1400;

            this.Num3=this.Num3+1;

            l3.setText(String.valueOf(Num3));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)bu6)
        {
            val=Integer.parseInt(s2.getText());
            val-=1400;

            this.Num3=this.Num3-1;

            l3.setText(String.valueOf(Num3));
            s2.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)ss2)
        {
            s2.setText("0");
        }
    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {

    }




}