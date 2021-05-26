package GUI.sin;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    int grain = 40;
    int range = 60;
    int freq = 30;
    int shift=3;
    //int width = this.getWidth();
    //int height = this.getHeight();

    @Override
    protected void paintComponent(Graphics g) {
        int width = this.getWidth();
        int height = this.getHeight();
        //g.setColor(Color.BLACK);
        //画一条中间坐标横线
        g.clearRect(0,0,width,height);
        g.drawLine(0, height/2, width, height/2);
        int center = height / 2;
        int x1 = 0, y1 = center, x2 , y2;
        for (int i = 0; i <= width; i += grain) {
            x2 = i+shift;
            y2 = (int) (range * Math.sin(Math.toRadians(x2 *freq)+shift) + center);
            g.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;

        }
    }
}



