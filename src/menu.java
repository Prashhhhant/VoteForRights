import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    JButton vote, result, back1;

    menu()
    {
        vote=new JButton("VOTE");
        vote.setBounds(250,150,200,40);
        vote.setFont(new Font("Serif",Font.BOLD, 25));
        vote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new candidate();
            }
        });

        result=new JButton("RESULT");
        result.setBounds(250,300,200,40);
        result.setFont(new Font("Serif",Font.BOLD, 25));
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new result();
            }
        });

        back1=new JButton("Back");
        back1.setBounds(550,400,100,40);
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new login();
            }
        });

        add(vote);
        add(result);
        add(back1);

        setLayout(null);
        getContentPane().setBackground(Color.pink);
        setResizable(false);
        setTitle("Select");
        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new menu();
    }
}
