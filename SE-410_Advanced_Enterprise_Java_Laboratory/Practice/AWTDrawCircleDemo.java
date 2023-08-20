package Practice;

import java.awt.*;
import java.applet.*;

public class AWTDrawCircleDemo extends Applet {
    public void paint(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 100;

        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        g.drawString("Your Name", centerX, centerY);
    }
}
