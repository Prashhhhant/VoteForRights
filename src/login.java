import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class login extends JFrame {
    JLabel user, pass, incorrect, message;
    //Connection con=null;
    public void displayMessage(){
        message = new JLabel("LOGIN");
        message.setForeground(Color.BLACK);
        message.setFont(new Font("Serif",Font.BOLD, 40));
        message.setBounds(260,90,220,30);
        getContentPane().add(message);
    }
    public void loginform()
    {
        final JTextField u;
        final JPasswordField p;
        JButton login, back5;

        user=new JLabel("Username: ");
        user.setBounds(240,150,100,20);
        user.setForeground(Color.BLACK);
        u=new JTextField();
        u.setEditable(true);
        u.setBounds(330,150,100,20);

        pass=new JLabel("Password: ");
        pass.setBounds(240,200,100,20);
        pass.setForeground(Color.BLACK);
        p=new JPasswordField();
        p.setBounds(330,200,100,20);

        incorrect=new JLabel("Incorrect Password");
        incorrect.setBounds(275,270,190,30);
        incorrect.setForeground(Color.red);

        login=new JButton("Login");
        login.setBounds(240,270,190,30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String username = u.getText();
                String password = p.getText();
                if(username.equals("prashant") && password.equals("prash"))
                {
                    JOptionPane.showMessageDialog(null, "Successfully logged in");
                    dispose();
                    new menu();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid data");
                }
               /*try
                {
                    String user=u.getText();
                    String pwd=p.getText();

                    PreparedStatement pst;
                    pst = (PreparedStatement) con.prepareStatement("insert into user(user,pass) values(?,?)");
                    pst.setString(1, user);
                    pst.setString(2, pwd);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data added");
                    u.setText("");
                    p.setText("");
                    dispose();
                    new menu();


                }
                catch (Exception e2)
                {
                    e2.printStackTrace();
                }*/
            }
        });

        back5=new JButton("Back");
        back5.setBounds(550,400,100,40);
        back5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new project();
            }
        });

        displayMessage();
        add(user);
        add(pass);
        add(u);
        add(p);
        add(login);
        add(back5);

    }
    login()
    {
        loginform();
        setLayout(null);
        getContentPane().setBackground(Color.pink);
        setResizable(false);
        setTitle("Login Page");
        setVisible(true);
        setMinimumSize(new Dimension(700,500));
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new login();
    }
}
