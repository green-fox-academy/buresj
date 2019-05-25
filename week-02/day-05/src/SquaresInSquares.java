import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquaresInSquares {

    public static void mainDraw(Graphics graphics) {

//        miniRect(graphics, 0, 1);
//        miniRect(graphics, 1, 0);
//        miniRect(graphics, 1, 2);
//        miniRect(graphics, 2, 1);

        // pyramid(graphics, 100, 10);

        fourSquares(graphics, WIDTH, HEIGHT, 10, WIDTH);

//        for (int i = 10; i < 100; i += 2) {
//
//                graphics.drawRect(WIDTH / 2 - i,
//                        HEIGHT / 2 - i,
//                        i * 2,
//                        i * 2);
//            }
//
    }

    public static void pyramid(Graphics g, int size, int diff) {

        if (size >= 1) {
            pyramid(g, size - diff, diff + 1);
        }

        g.setColor(Color.black);
        g.drawRect(WIDTH / 2 - size,
                HEIGHT / 2 - size,
                size * 2,
                size * 2);
    }

    public static void fourSquares(Graphics g, int x, int y, int size, int base) {

        int nsize;
        int nx;
        int ny;

        g.setColor(Color.black);

        if (size >= 1) {

            nx = base / 3;
            nsize = size / 3;
            ny = 0;

            g.drawRect(nx, ny, nsize, nsize);
            fourSquares(g, nx, ny, nsize, nsize);
        }
    }


    // Don't touch the code below
    static int WIDTH = 330;
    static int HEIGHT = 330;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}