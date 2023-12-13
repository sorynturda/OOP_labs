import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        JPanel p1 = new JPanel(new FlowLayout());
        JLabel l1 = new JLabel("username");
        JTextField username = new JTextField(10);
        p1.add(l1);
        p1.add(username);
        JPanel p2 = new JPanel(new FlowLayout());
        JLabel l2 = new JLabel("password");
        JTextField password = new JTextField(10);
        p2.add(l2);
        p2.add(password);
        JCheckBox cb = new JCheckBox("Apasa, apasa apasaaaa");
        JButton btn = new JButton("Login");
        panel.add(p1);
        panel.add(p2);
        panel.add(cb);
        panel.add(btn);
        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}