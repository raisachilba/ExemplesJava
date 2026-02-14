package ProgOrientadaObjectes.Poligons;

import static processing.core.PApplet.*;
import static processing.core.PApplet.radians;

public class Estrella extends Poligon{

    float radiInt;

    Estrella(Punt2D c, float radiExt, float radiInt){
        super(12, c, radiExt);
        float angStep = 360f / 12;
        float ang = 0;
        updatePuntsInteriors(c);
        this.radiInt = radiInt;
    }

    public void setRadiInt(float r){ this.radiInt = r; }

    public void updatePuntsInteriors(Punt2D c){
        float angStep = 360f / 12;
        float ang = 0;
        for(int i = 0; i< punts.length; i+=2){
            punts[i].x = c.x + radiInt * cos(radians(ang));
            punts[i].y = c.x + radiInt * sin(radians(ang));
            ang += 2*angStep;
        }
    }
}
