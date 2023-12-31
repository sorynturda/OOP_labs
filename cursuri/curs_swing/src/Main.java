import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    int contor = 0;
    JFrame frame = new JFrame("hello swing");
    JPanel jpane = new JPanel();
    JLabel jlabel = new JLabel("contor");
    JButton btn1 = new JButton("0");
    JButton btn2 = new JButton("ReS3t");

    public static void main(String[] args) {
        Main cls = new Main();
        cls.createGUI();
    }

    public void createGUI() {
        btn1.setFont(new Font("Arial", Font.BOLD, 72));
        btn1.addActionListener(new ButtonListener());
        btn2.setFont(new Font("Arial", Font.BOLD, 72));
        btn2.addActionListener(new Reset());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        jpane.add(jlabel);
        jpane.add(btn1);
        jpane.add(btn2);
        frame.add(jpane);
        frame.setVisible(true);
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            contor++;
            btn1.setText(contor + "");
        }
    }

    public class Reset implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            contor = 0;
            btn1.setText("0");
        }
    }
}