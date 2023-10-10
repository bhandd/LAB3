package lab3.lab3.Shapes;

abstract public class FillableShapes {

    private boolean filled;

    protected FillableShapes(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {

    }
}