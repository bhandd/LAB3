package lab3.lab3.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public abstract class Rectangel {

    private double width, height;

    protected Rectangel(double width, double height) {
        this.height = height;
        this.width = width;
    }

    protected Rectangel() {this(0.0,0.0);}

    public double getWidth() {return width;}

    public double getHeight() {return height;}

    public void setWidth(double newwidth) {width = newwidth;}

    public void setHeight(double newheight) {height = newheight;}

    public abstract void paint(GraphicsContext gc);

    public void constrain(double height, double width /* add two more double*/) {

    }

    public String toString() {
        String info = "Re";
        return info;
    }
}