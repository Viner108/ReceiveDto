package org.example.tank.dto;

import java.io.Serializable;

public class TankDto implements Serializable {
    private static final long serialVersionUID = 8038539938717817115L;
    int id;
    private float speed = 5;
    public float alpha = 0;
    float deltaX = 0;
    float deltaY = 0;
    float deltaAlpha = 0;
    float speedAlpha = 2;
    private ToreDto tore;

    private float X = 0;

    private float Y = 0;
    public boolean isFocusable= false;
    public boolean isAlive = true;
    public TankDto(int id) {
        this.id = id;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public float getDeltaAlpha() {
        return deltaAlpha;
    }

    public void setDeltaAlpha(float deltaAlpha) {
        this.deltaAlpha = deltaAlpha;
    }

    public float getSpeedAlpha() {
        return speedAlpha;
    }

    public void setSpeedAlpha(float speedAlpha) {
        this.speedAlpha = speedAlpha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public ToreDto getTore() {
        return tore;
    }

    public void setTore(ToreDto tore) {
        this.tore = tore;
    }

    @Override
    public String toString() {
        return "TankDto{" +
               "id=" + id +
               ", X=" + X +
               ", Y=" + Y +
               '}';
    }
}
