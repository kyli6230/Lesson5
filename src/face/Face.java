package face;

import java.awt.Color;
import java.awt.Graphics;

public class Face {

    private int xPos, yPos, diameter;
    private Color facecolor;
    private Color eyecolor;
    private Graphics g;
    int newx, newy;
    boolean isHappy;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;

        //let the 'g' property = the 'g' param
        this.g = g;
        //default size and color
        diameter = 100;
        facecolor = Color.red;
        eyecolor = Color.black;
        isHappy = true;
    }

    public void move(Graphics g, int newx, int newy) {
        xPos = newx;
        yPos = newy;
        draw();
    }

    public void resize(Graphics g, int newd) {
        diameter = newd;
        draw();
    }

    public void togglemood() {
        isHappy = !isHappy;
    }

    public void draw() {
        drawHead();
        drawEyes();
        if (isHappy) {
            drawHappyMouth();
        } else {
            drawSadMouth();
        }
    }

    public void setfaceColor(Color c) {
        facecolor = c;
    }
    public void seteyeColor(Color c) {
        eyecolor = c;
    }
    private void drawHead() {
        g.setColor(facecolor);
        g.fillOval(xPos, yPos, diameter, diameter);
    }

    private void drawEyes() {
        g.setColor(eyecolor);
        g.fillOval(xPos + (diameter / 5), yPos + (diameter / 5), diameter / 4, diameter / 4);
        g.fillOval(xPos + (diameter / 2), yPos + (diameter / 5), diameter / 4, diameter / 4);
    }

    private void drawHappyMouth() {
        g.setColor(Color.black);
        g.drawLine(xPos + (diameter / 5), yPos + (diameter * 2 / 3), xPos + (diameter * 1 / 4), yPos + (diameter * 7 / 10));
        g.drawLine(xPos + (diameter * 1 / 4), yPos + (diameter * 7 / 10), xPos + (diameter * 4 / 5), yPos + (diameter * 7 / 10));
        g.drawLine(xPos + (diameter * 4 / 5), yPos + (diameter * 7 / 10), xPos + (diameter * 17 / 20), yPos + (diameter * 2 / 3));
    }

    private void drawSadMouth() {
        g.setColor(Color.black);
        g.drawLine(xPos + (diameter / 5), yPos + (diameter * 2 / 3), xPos + (diameter * 1 / 4), yPos + (diameter * 6 / 10));
        g.drawLine(xPos + (diameter * 1 / 4), yPos + (diameter * 6 / 10), xPos + (diameter * 4 / 5), yPos + (diameter * 6 / 10));
        g.drawLine(xPos + (diameter * 4 / 5), yPos + (diameter * 6 / 10), xPos + (diameter * 17 / 20), yPos + (diameter * 2 / 3));
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

}
