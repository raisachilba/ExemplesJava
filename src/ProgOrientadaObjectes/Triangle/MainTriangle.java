package ProgOrientadaObjectes.Triangle;

import processing.core.PApplet;

public class MainTriangle extends PApplet {

    Punt2D p1, p2, p3;
    Triangle t1, t2;

    public static void main(String[] args) {
        PApplet.main("ProgOrientadaObjectes.Triangle.MainTriangle");
    }

    public void settings(){
        size(800, 800);
    }
    public void setup(){
        p1 = new Punt2D();
        p2 = new Punt2D("A", 200, 200);
        p3 = new Punt2D("B", -200, 100);

        t1 = new Triangle(p1, p2, p3);
        t2 = new Triangle(-200, -200, 0, -50, 200, -100);
    }
    public void draw(){
       background(255);
       translate(width/2, height/2);

       line(-width, 0, width, 0);
       line(0, -height, 0, height);

       t1.display(this, color(255, 100, 50, 50));
       t2.display(this, color(50, 255, 100, 50));
    }

    public void mousePressed(){
        Punt2D pMouse = new Punt2D("A", mouseX - width/2, mouseY - height/2);
        t1.setA(pMouse);
    }
}
