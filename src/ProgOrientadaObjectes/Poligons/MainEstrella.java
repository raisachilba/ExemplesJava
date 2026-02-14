package ProgOrientadaObjectes.Poligons;

import processing.core.PApplet;

public class MainEstrella extends PApplet {

    Estrella t; //Declaració
    Punt2D ce;

    public static void main(String[] args) {
        PApplet.main("ProgOrientadaObjectes.Poligons.MainEstrella");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        t = new Estrella(new Punt2D("O", 0, 0), 200, 300);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        t.display(this);

        float rInt = map(mouseX, 0, width, 100, 250);
        t.setRadiInt(rInt);
        t.updatePuntsInteriors(ce);
    }
}
