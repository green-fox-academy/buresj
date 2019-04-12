import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquaresInSquares {

    public static void mainDraw(Graphics graphics) {

//        miniRect(graphics, 0, 1);
//        miniRect(graphics, 1, 0);
//        miniRect(graphics, 1, 2);
//        miniRect(graphics, 2, 1);

        miniRect(graphics, 10, 2,2);
    }

    public static int miniRect(Graphics g, int size, int x, int y) {

        g.setColor(Color.black);
        g.drawRect(WIDTH / x + size,
                HEIGHT / y + size,
                size * x,
                size * y);

        if (size == 1) {
            return 1;
        } else {
            return miniRect(g, size - 1, x, y);
        }
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