package org.example.tank.dto;

import android.graphics.Point;

import java.io.Serializable;

public class MouseEventDto implements Serializable {
    private static final long serialVersionUID = 8038539938717817111L;
    public int x;
    public int y;

//    public static MouseEventDto fromMouseEvent(MouseEvent e) {
//        MouseEventDto dto = new MouseEventDto();
//        dto.x = e.getX();
//        dto.y = e.getY();
//        return dto;
//    }

    public Point getPoint() {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "MouseEventDto{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }
}
