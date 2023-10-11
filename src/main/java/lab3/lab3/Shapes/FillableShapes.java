package lab3.lab3.Shapes;


import javafx.scene.paint.Color;

abstract public class FillableShapes extends Shape{

    private boolean filled = false;

    public FillableShapes(double x, double y, Color color, boolean filled) {
        super(x, y, color);
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        if (filled) {

        }
        filled = true;

    }
}