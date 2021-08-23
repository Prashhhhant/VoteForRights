import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class project extends JFrame {
    JLabel wel, main;
    JButton enter;

    project()
    {
        this.setTitle("Voter For Rights");
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        main = new JLabel("VOTE FOR RIGHTS");
        main.setBounds(200,90,350,45);
        main.setFont(new Font("Serif",Font.BOLD, 35));

        wel = new JLabel("Welcome");
        wel.setBounds(300, 150, 100, 70);
        wel.setFont(new Font("Serif",Font.ITALIC, 25));

        enter = new JButton("ENTER");
        enter.setBounds(270, 300, 150, 35);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new login();
                }
            });
        this.add(main);
        this.add(wel);
        this.add(enter);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new project();
    }
}
