package org.example.tank.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToreDto implements Serializable {
    private static final long serialVersionUID = 6529685098267757691L;
    public List<ChargeDto> chargeList = new ArrayList<>();
    public float Y;
    public float X;
    public float alpha = 0.0F;

    public ToreDto(float y, float x) {
        Y = y;
        X = x;
    }
}
