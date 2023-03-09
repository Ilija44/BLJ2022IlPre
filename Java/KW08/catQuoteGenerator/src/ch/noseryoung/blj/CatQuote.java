package ch.noseryoung.blj;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.HttpURLConnection;


public class CatQuote {
    public static void main(String[] args) {


        try {
            URL url1 = new URL("https://zenquotes.io/api/random%22");
            HttpURLConnection con = (HttpURLConnection) url1.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in1 = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in1.readLine()) != null) {
                content.append(inputLine);
            }
            String zenquotes = content.toString();
            in1.close();

            for (int i = 8; i < zenquotes.length(); i++) {
                char zenquotesChar = zenquotes.charAt(i);
                if (zenquotesChar == '"') {
                    zenquotes = zenquotes.substring(8, i);
                    break;
                }
            }
            zenquotes = zenquotes.replaceAll(" ", "%20");

            System.out.println(zenquotes);

            String website = "https://cataas.com/cat/says/" + zenquotes;
            BufferedImage image = null;

            try {
                URL url = new URL(website);
                image = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            JFrame frame = new JFrame();
            frame.setSize(image.getWidth(), image.getHeight());
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String insertString(String originalString, String stringToInsert, int interval) {
        StringBuilder sb = new StringBuilder(originalString);

        int offset = 0;
        for (int i = interval; i < originalString.length(); i += interval + stringToInsert.length()) {
            sb.insert(i + offset, stringToInsert);
            offset += stringToInsert.length();
        }

        return sb.toString();
    }

}

