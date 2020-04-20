import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Machine extends JFrame implements MouseListener
{
    private JPanel j1 = new JPanel (new BorderLayout());
    private JPanel j2= new JPanel (new FlowLayout());
    private JPanel j3= new JPanel (new FlowLayout());
    private JPanel j4= new JPanel (new FlowLayout());
    private JPanel j5= new JPanel (new GridLayout(3,6));

    private JTextField b1 = new JTextField("포카리스웨트");
    private JTextField b2= new JTextField("게토레이");
    private JTextField b3= new JTextField("코카콜라");

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

    private JTextField s2 = new JTextField("0");
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
        this.setSize(500,500);

        j2.add(b1);
        j2.add(b2);
        j2.add(b3);
        this.add("North",j2);


        this.add("Center",j5);
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

        this.getContentPane().add(j2,BorderLayout.NORTH);
        this.getContentPane().add(j5,BorderLayout.CENTER);
        this.getContentPane().add(j3,BorderLayout.SOUTH);
        this.getContentPane().add(j4,BorderLayout.SOUTH);


        this.setVisible(true);
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
