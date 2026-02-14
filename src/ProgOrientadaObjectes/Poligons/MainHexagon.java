package ProgOrientadaObjectes.Poligons;

import processing.core.PApplet;

public class MainHexagon extends PApplet {

    Poligon t; //Declaració

    public static void main(String[] args) {
        PApplet.main("ProgOrientadaObjectes.Poligons.MainHexagon");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        t = new Hexagon(new Punt2D("O", 0, 0), 200);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        t.display(this);
    }
}
