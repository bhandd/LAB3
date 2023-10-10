package lab3.lab3.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public abstract class Circle {

    private double diameter;

    protected Circle(double diameter) {
        this.diameter = diameter;
    }

    protected Circle() {this(0.0);}

    public double getDiameter() {return diameter;}

    public void setDiameter(double newdiameter) {diameter = newdiameter;}

    public abstract void paint(GraphicsContext gc);

    public String toString() {
        String info = "Circle" + diameter;

        return info;
    }
}