package lab3.lab3.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangel extends Shape{

    private double width, height;

    protected Rectangel(double x, double y, double width, double height, Color color) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    protected Rectangel() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public double getWidth() {return width;}

    public double getHeight() {return height;}

    public void setWidth(double newwidth) {width = newwidth;}

    public void setHeight(double newheight) {height = newheight;}

    @Override
    public void move(long elapsedTimeNs){
        super.move(elapsedTimeNs);

        width += getDx() * elapsedTimeNs / BILLION;
        height += getDy() * elapsedTimeNs / BILLION;
    }
    @Override
    public void paint(GraphicsContext gc) {

        gc.fillRect(getX(), getY(), width, height);
    }
//    @Override
//    public void constrain(double boxX, double boxY,
//                          double boxWidth, double boxHeight){
//        super.constrain(boxX, boxY, boxWidth, boxHeight);
//        double dx = getDx();
//        double dy = getDy();
//
//
//        if (x2 < boxX) {
//            setVelocity(Math.abs(dx), dy ) ;
//        } else if (x2 > boxWidth) {
//            setVelocity(-Math.abs(dx), dy );
//        }
//        if (y2 < boxY) {
//            setVelocity(dx, Math.abs(dy) );
//        } else if (y2 > boxHeight) {
//            setVelocity(dx, -Math.abs(dy) );
//        }
//    }


    public String toString() {
        String info = "Re";
        return info;
    }
}