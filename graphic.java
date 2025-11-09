

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

 class ShapeDrawer extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.drawRect(50, 50, 100, 60); // x, y, width, height

        // Draw an oval
        g.drawOval(200, 50, 100, 60); // x, y, width, height

        // Draw a line
        g.drawLine(50, 150, 150, 200); // x1, y1, x2, y2

        // Draw text
        g.drawString("Hello Kalpesh!", 200, 150); // text, x, y
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        ShapeDrawer panel = new ShapeDrawer();

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}


