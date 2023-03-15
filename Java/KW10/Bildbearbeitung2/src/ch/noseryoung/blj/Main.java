package ch.noseryoung.blj;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File("C:\\Users\\ilija\\BLJ2022IlPre\\Java\\KW10\\Bildbearbeitung2\\src\\ch\\noseryoung\\blj\\Noah.png"));


        BufferedImage grayscaleImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        grayscaleImage.getGraphics().drawImage(image, 0, 0, null);

        String asciiScale = " .:-=+*#%@";

        StringBuilder asciiArtBuilder = new StringBuilder();
        for (int y = 0; y < grayscaleImage.getHeight(); y++) {
            for (int x = 0; x < grayscaleImage.getWidth(); x++) {

                int brightness = new Color(grayscaleImage.getRGB(x, y)).getRed();


                int asciiIndex = (int) (brightness / 25.5);
                char asciiChar = asciiScale.charAt(asciiIndex);


                asciiArtBuilder.append(asciiChar);
            }
            asciiArtBuilder.append("\n");
        }
        String asciiArt = asciiArtBuilder.toString();


        FileWriter writer = new FileWriter("ascii_art.txt");
        writer.write(asciiArt);
        writer.close();
    }
}


