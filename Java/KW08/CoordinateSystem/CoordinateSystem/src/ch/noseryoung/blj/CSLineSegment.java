package ch.noseryoung.blj;

import javax.swing.*;
import java.util.ArrayList;

public class CSLineSegment extends JPanel {

    private CSPoint startPoint;
    private CSPoint endPoint;

    public CSLineSegment(CSPoint startPoint, CSPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public CSPoint getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(CSPoint startPoint) {
        this.startPoint = startPoint;
    }

    public CSPoint getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(CSPoint endPoint) {
        this.endPoint = endPoint;
    }
}
