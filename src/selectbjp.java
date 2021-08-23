import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectbjp extends JFrame{
    JLabel l3;

    selectbjp()
    {
        JButton b3, back3;

        l3= new JLabel(new ImageIcon("C:\\Users\\MADHURI NILAJKAR\\Desktop\\Prashant\\New folder\\Expt15.3.png"));
        l3.setBounds(200, 50, 300, 250);

        b3=new JButton("Vote BJP");
        b3.setBounds(250,320,190,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Are you sure?","Sure??",JOptionPane.YES_NO_CANCEL_OPTION);
                JOptionPane.showMessageDialog(null, "Vote Counted");
                dispose();
                new menu();
            }
        });

        back3=new JButton("Back");
        back3.setBounds(550,400,100,40);
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new candidate();
            }
        });

        add(l3);
        add(b3);
        add(back3);

        setLayout(null);
        getContentPane().setBackground(Color.pink);
        setResizable(false);
        setTitle("Vote for BJP");
        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new selectbjp();
    }
}
