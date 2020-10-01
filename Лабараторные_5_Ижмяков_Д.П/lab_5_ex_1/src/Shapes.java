import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class Shapes extends JFrame {



    Shapes() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Times New Roman",Font.BOLD,20);




        setFont(font);
        setBounds(dim.width/2 - 350,dim.height/2 - 250,700,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawLine(5,5,50,50);
        g2.drawRect(70,50,20,70);
        g2.drawRect(140,50,20,20);
        g2.drawRect(140,50,20,20);
        g2.fillRoundRect(210,50,20,70,50,50);
        g2.fillRect(280,50,20,70);
        g2.fillRect(350,50,20,20);
        g2.drawRoundRect(420,50,20,70,50,50);
        g2.drawOval(490,50,50,60);
        g2.drawOval(560,50,50,60);
        g2.drawArc(70,200,60,60,0,180);
        g2.fillArc(140,200,60,60,0,270);
        g2.fillArc(210,200,60,60,0,129);

        int xpoits[] = {280,344,300,290};
        int ypoits[] = {200,250,300,310};

        g2.drawPolygon(xpoits,ypoits,4);



    }
}
