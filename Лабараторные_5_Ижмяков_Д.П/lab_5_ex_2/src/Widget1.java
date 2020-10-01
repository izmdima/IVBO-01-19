import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Widget1 extends JFrame {

    Image img;

    Widget1(String str) {

        try {
            File file = new File(str);
            img = ImageIO.read(file);
        }catch (IOException ex) {

        }


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //img = new ImageIcon(str).getImage();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - 250,dim.height/2 - 175);
        setSize(500,350);


        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img,getInsets().left,getInsets().top,null);
    }
}
