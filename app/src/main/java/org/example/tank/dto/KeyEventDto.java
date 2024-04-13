package org.example.tank.dto;


import android.view.KeyEvent;

import java.io.Serializable;

public class KeyEventDto implements Serializable {
    private static final long serialVersionUID = 8038539938717817116L;
    boolean press=false;
    int keyCode;
     int x=0;
     int y=0;
    public static KeyEventDto fromKeyEvent(KeyEvent e, boolean press){
        KeyEventDto dto = new KeyEventDto();
        dto.setPress(press);
        dto.setKeyCode(e.getKeyCode());
        return dto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getKeyCode () {
        return keyCode;
    }

    public boolean isPress() {
        return press;
    }

    public void setPress(boolean press) {
        this.press = press;
    }

    public void setKeyCode (int keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public String toString() {
        return "KeyEventDto{" +
               "keyCode=" + keyCode +
               '}';
    }
}
