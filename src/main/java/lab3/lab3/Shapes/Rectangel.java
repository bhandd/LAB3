package lab3.lab3.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Rectangel extends FillableShapes {

    private double width, height;

    protected Rectangel(double x, double y, double width, double height, Color color, boolean filled) {
        super(x, y, color, filled);
        this.height = height;
        this.width = width;
    }

    protected Rectangel() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double newwidth) {
        width = newwidth;
    }

    public void setHeight(double newheight) {
        height = newheight;
    }

    @Override
    public void move(long elapsedTimeNs) {
        super.move(elapsedTimeNs);
        double x3 = getX() + width;
        double y3 = getY() + height;

        x3 += getDx() * elapsedTimeNs / BILLION;
        y3 += getDy() * elapsedTimeNs / BILLION;

    }

    @Override
    public void paint(GraphicsContext gc) {
        if (isFilled()) {
            gc.setFill(getColor());
            gc.fillRect(getX(), getY(), width, height);
        } else {
            gc.setStroke(getColor());
            gc.strokeRect(getX(), getY(), width, height);
        }

    }

    @Override
    public void constrain(double boxX, double boxY,
                          double boxWidth, double boxHeight) {
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        double dx = getDx();
        double dy = getDy();
        double x3 = width + getX();
        double y3 = height + getY();

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


    public String toString() {
        String info = "Re";
        return info;
    }
}
