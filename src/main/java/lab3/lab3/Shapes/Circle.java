package lab3.lab3.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Circle extends FillableShapes{

    private double diameter;

    protected Circle(double x, double y, boolean filled, double diameter, Color color) {
        super(x, y, color, filled);
        this.diameter = diameter;
    }

    protected Circle() {
        super();
        this.diameter = 0.0;
    }

    public double getDiameter() {return diameter;}

    public void setDiameter(double newdiameter) {diameter = newdiameter;}

    @Override
    public void move(long elapsedTimeNs) {
        super.move(elapsedTimeNs);
        double x3 = getX() + diameter;
        double y3 = getY() + diameter;

        x3 += getDx() * elapsedTimeNs / BILLION;
        y3 += getDy() * elapsedTimeNs / BILLION;
    }

    @Override
    public void paint(GraphicsContext gc) {
        if (isFilled()) {
            gc.setFill(getColor());
            gc.fillOval(getX(), getY(), diameter, diameter);
        } else {
            gc.setStroke(getColor());
            gc.strokeOval(getX(), getY(), diameter, diameter);
        }
    }

    @Override
    public void constrain(double boxX, double boxY,
                          double boxWidth, double boxHeight) {
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        double dx = getDx();
        double dy = getDy();
        double x3 = getX() + diameter;
        double y3 = getY() + diameter;

        if (x3 < boxX) {
            setVelocity(Math.abs(dx), dy);
        } else if (x3 > boxWidth) {
            setVelocity(-Math.abs(dx), dy);
        }
        if (y3 < boxY) {
            setVelocity(dx, Math.abs(dy));
        } else if (y3 > boxHeight) {
            setVelocity(dx, -Math.abs(dy));
        }
    }

    @Override
    public String toString() {
        String info = "Circle" + diameter;

        return info;
    }
}