import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectcongress extends JFrame{
    JLabel l4;
    selectcongress()
    {
        JButton b4, back4;

        l4= new JLabel(new ImageIcon("C:\\Users\\MADHURI NILAJKAR\\Desktop\\Prashant\\New folder\\Expt15.4.png"));
        l4.setBounds(200, 50, 300, 250);

        b4=new JButton("Vote Congress");
        b4.setBounds(250,320,190,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Are you sure?","Sure??",JOptionPane.YES_NO_CANCEL_OPTION);
                JOptionPane.showMessageDialog(null, "Vote Counted");
                dispose();
                new menu();
            }
        });

        back4=new JButton("Back");
        back4.setBounds(550,400,100,40);
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new candidate();
            }
        });

        add(l4);
        add(b4);
        add(back4);

        setLayout(null);
        getContentPane().setBackground(Color.pink);
        setResizable(false);
        setTitle("Vote for Congress");
        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new selectcongress();
    }
}
