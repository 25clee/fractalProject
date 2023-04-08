import processing.core.PApplet;
public class Main extends PApplet {
    public static PApplet app;
    private int length = 200;

    private float r1 = random(255);
    private float g1 = random(255);
    private float b1 = random(255);
    private float r2 = random(255);
    private float g2 = random(255);
    private float b2 = random(255);

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main() {
        super();
        app = this;
    }

    public void settings() {
        size(800, 600);
    }

    public void draw() {
        background(0);
        drawSquare(width/2, height/2, length);
        drawSquare2(width/2, height/2, length);
    }

    public void drawSquare(float x, float y, float length){
        noFill();
        stroke(r1,g1,b1); //for a pretty example: stroke(17, 126, 250);
        rect(x-length/2, y, length, length);
        if (length>20){
            drawSquare(x + length / 2, y + length/2, length / 2);
            drawSquare(x + length / 2, y - length / 2, length / 2);
            drawSquare(x - length / 2, y + length / 2, length / 2);
            drawCircle(x+length/2, y+length/2, length/2); //comment out this line for the fractal without circles
        }
    }

    public void drawSquare2(float x, float y, float length){
        noFill();
        stroke(r2,g2,b2); //for a pretty example: stroke(219, 87, 255);
        rect(x-length/2, y-length, length, length);
        if (length>20){
            drawSquare2(x - length / 2, y - length/2, length / 2);
            drawSquare2(x - length / 2, y + length / 2, length / 2);
            drawSquare2(x + length / 2, y - length / 2, length / 2);
            drawCircle2(x-length/2, y+length/2, length/2); //comment out this line for the fractal without circles
        }
    }
    public void drawCircle(float x, float y, float radius) {
        noFill();
        stroke(r2+50,g2+50,b2);
        ellipse(x+radius/2, y-radius, radius, radius);
    }

    public void drawCircle2(float x, float y, float radius) {
        noFill();
        stroke(r1+50,g1+50,b1);
        ellipse(x-radius/2, y-radius, radius, radius);
    }

}
//Notes to self for add-ons:
//to animate, store values of ellipse(x, y, radius, radius) and then add those values to arraylist to draw later
//maybe add random color or mouseClicked
//add else if in recursion?