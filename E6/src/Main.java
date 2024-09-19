import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button1");
    }
}

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }

    ActionListener actionListener1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button2");
        }
    };

    public void start() {
        JButton button1 = new JButton("Mega Button1");
        button1.setBounds(0,0, 400,200);
        button1.addActionListener(new MyActionListener());
        add(button1);

        JButton button2 = new JButton("Mega Button2");
        button2.setBounds(0,200, 400,200);
        button2.addActionListener(actionListener1);
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        button3.setBounds(0,400, 400,200);
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button3");
            }
        });
        add(button3);

        setSize(400,600);
        setLayout(null);
        setVisible(true);

    }
}