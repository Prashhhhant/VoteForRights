import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class candidate extends JFrame {
    JLabel l1, l2;

    public void candidateform()
    {
        JButton b1, b2,back2;

        l1= new JLabel(new ImageIcon("C:\\Users\\MADHURI NILAJKAR\\Desktop\\Prashant\\New folder\\Expt15.3.png"));
        l1.setBounds(25, 50, 300, 250);
        l2= new JLabel(new ImageIcon("C:\\Users\\MADHURI NILAJKAR\\Desktop\\Prashant\\New folder\\Expt15.4.png"));
        l2.setBounds(380, 50, 300, 250);

        b1=new JButton("Click here for BJP");
        b1.setBounds(70,300,190,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new selectbjp();
            }
        });

        b2=new JButton("Click here for Congress");
        b2.setBounds(440,300,190,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new selectcongress();

            }
        });

        back2=new JButton("Back");
        back2.setBounds(550,400,100,40);
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new menu();
            }
        });

        add(l1);
        add(l2);
        add(b1);
        add(b2);
        add(back2);
    }
    candidate()
    {
        candidateform();
        setLayout(null);
        getContentPane().setBackground(Color.pink);
        setResizable(false);
        setTitle("Candidates");
        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new candidate();
    }
}
