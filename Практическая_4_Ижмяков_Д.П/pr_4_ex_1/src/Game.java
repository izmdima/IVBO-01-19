import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    private int M = 0;
    private int RM = 0;

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: " + M + " X " + RM);
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Wineer: Draw");

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();



    Game() {
        super("Game");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand() + "\t" + e.getModifiers() + "\t" + e.getWhen());
                ++M;
                lbl1.setText("Result: " + M + " X " + RM);
                lbl2.setText("Last Scorer: AC Milan");
                if (M > RM)
                    lbl3.setText("Wineer: AC Milan");
                else if (M == RM)
                    lbl3.setText("Wineer: Draw");
                else
                    lbl3.setText("Wineer: Real Madrid");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++RM;
                lbl1.setText("Result: " + M + " X " + RM);
                lbl2.setText("Last Scorer: Real Madrid");
                if (M > RM)
                    lbl3.setText("Wineer: AC Milan");
                else if (M == RM)
                    lbl3.setText("Wineer: Draw");
                else
                    lbl3.setText("Wineer: Real Madrid");
            }
        });

        panel1.add(lbl1);
        panel2.add(lbl2);
        panel3.add(lbl3);
        panel4.add(button1);
        panel5.add(button2);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 500;
        int sizeHeight = 200;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;
        this.setBounds(locationX, locationY, sizeWidth, sizeHeight);

        this.setResizable(false);

        add(panel4,BorderLayout.WEST);
        add(panel5,BorderLayout.EAST);
        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.NORTH);
        add(panel3,BorderLayout.SOUTH);

        setVisible(true);
    }
}
