package ch.noseryoung.blj;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CSLineSegment extends JPanel implements Shape{

    private CSPoint startPoint;
    private CSPoint endPoint;

    public CSLineSegment(CSPoint startPoint, CSPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }



    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldScale) {
        CSPoint startpoint = translatePoint(cs, fieldScale, this.startPoint.x, this.startPoint.y);
        CSPoint endpoint = translatePoint(cs, fieldScale, this.endPoint.x, this.endPoint.y);
        g2d.setColor(Color.BLUE);
        g2d.drawLine(startpoint.x, startpoint.y, endpoint.x, endpoint.y);
    }
}
