import javax.swing.*;
import java.awt.*;

public class result extends JFrame {
    JLabel l8,l9,l10;

    result()
    {
        this.setTitle("Result");
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        l8=new JLabel("BJP : 1");
        l8.setBounds(240,150,150,25);
        l8.setFont(new Font("Serif",Font.BOLD, 25));

        l9=new JLabel("Congress : 0");
        l9.setBounds(240,200,150,25);
        l9.setFont(new Font("Serif",Font.BOLD, 25));

        l10=new JLabel("RESULT");
        l10.setBounds(240,90,200,50);
        l10.setFont(new Font("Serif",Font.BOLD, 40));

        add(l9);
        add(l8);
        add(l10);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new result();
    }
}
