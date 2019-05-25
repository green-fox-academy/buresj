import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.


        for (int row = 0; row <= WIDTH; row++) {

            for (int column = 0; column <= HEIGHT; column++) {

                float testColumn = column;
                float testRow = row;

                boolean evenColumn = (testColumn % 2) == 0;
                boolean evenRow = (testRow %= 2) == 0;


                if (evenRow) {
                    if (evenColumn) {
                        miniRect(graphics, row, column);
                    }
                } else if (!evenColumn) {

                    miniRect(graphics, row, column);

                }
            }
        }
    }

    public static void miniRect(Graphics g, int row, int column) {

        int size = 10;

        g.setColor(Color.black);
        g.fillRect(
                row * size,
                column * size,
                size, size);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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