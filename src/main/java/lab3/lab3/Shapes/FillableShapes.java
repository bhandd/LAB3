package lab3.lab3.Shapes;


import javafx.scene.paint.Color;

abstract public class FillableShapes extends Shape{

    private boolean filled;

    public FillableShapes(double x, double y, Color color, boolean filled) {
        super(x, y, color);
        this.filled = filled;
    }

    public FillableShapes () {
        super();
        this.filled = false;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}