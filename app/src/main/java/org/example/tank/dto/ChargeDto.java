package org.example.tank.dto;

import java.io.Serializable;

public class ChargeDto implements Serializable {
    private static final long serialVersionUID = 6529685098267757692L;
    public int id;
    public float Y;
    public float X;
    public float alpha;
    public boolean alive = true;

}
