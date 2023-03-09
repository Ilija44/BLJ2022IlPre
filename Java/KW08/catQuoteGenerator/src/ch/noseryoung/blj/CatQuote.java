package ch.noseryoung.blj;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




    public class CatQuote {
        public static void main( String[] args )
        {
            Image image = null;
            try {
                URL url = new URL("https://cataas.com/cat/says/hello%20world!");
                image = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame();
            frame.setSize(300, 300);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.setVisible(true);
        }
    }

