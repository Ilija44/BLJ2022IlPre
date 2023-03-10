package ch.noseryoung.blj;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Starter {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ilija\\OneDrive\\Noser\\Elmar.png");
            BufferedImage bufferedImage = ImageIO.read(file);

            BufferedImage noisyImage = addNoise(bufferedImage, 0.5);
            BufferedImage smoothedImage = smoothImage(noisyImage, 5);

            setImageToFrame(smoothedImage);
        } catch (IOException e) {
            System.out.println("Bitte geben Sie einen richtigen Pfad an.");
        }
    }

    static void setImageToFrame(BufferedImage image) {
        ImageIcon imageIcon = new ImageIcon(image);

        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(700, 500);

        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);

        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static BufferedImage addNoise(BufferedImage image, double probability) {
        Random random = new Random();
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Color color = new Color(image.getRGB(x, y));
                if (random.nextDouble() < probability) {
                    color = random.nextBoolean() ? Color.BLACK : Color.WHITE;
                }
                result.setRGB(x, y, color.getRGB());
            }
        }
        return result;
    }

    public static BufferedImage smoothImage(BufferedImage image, int filterSize) {
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        int halfSize = filterSize / 2;

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int sumRed = 0, sumGreen = 0, sumBlue = 0;
                int count = 0;

                for (int i = -halfSize; i <= halfSize; i++) {
                    int xi = x + i;

                    if (xi < 0 || xi >= image.getWidth()) {
                        continue;
                    }

                    for (int j = -halfSize; j <= halfSize; j++) {
                        int yj = y + j;

                        if (yj < 0 || yj >= image.getHeight()) {
                            continue;
                        }

                        Color color = new Color(image.getRGB(xi, yj));
                        sumRed += color.getRed();
                        sumGreen += color.getGreen();
                        sumBlue += color.getBlue();
                        count++;
                    }
                }

                int avgRed = sumRed / count;
                int avgGreen = sumGreen / count;
                int avgBlue = sumBlue / count;

                Color avgColor = new Color(avgRed, avgGreen, avgBlue);
                result.setRGB(x, y, avgColor.getRGB());
            }
        }

        return result;
    }
}
