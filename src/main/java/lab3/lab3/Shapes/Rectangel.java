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

       // width += getDx() * elapsedTimeNs / BILLION;
        //height += getDy() * elapsedTimeNs / BILLION;
    }
    @Override
    public void paint(GraphicsContext gc) {
        gc.setFill(getColor());
        gc.fillRect(getX(), getY(), width, height);
    }
    @Override
    public void constrain(double boxX, double boxY,
                          double boxWidth, double boxHeight){
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        double dx = getDx();
        double dy = getDy();
        double x3 = width+getX();
        double y3 = width+getY();

        if (width < boxX) {
           setVelocity(Math.abs(dx), dy ) ;
        } else if (width > boxWidth) {
            setVelocity(-Math.abs(dx), dy );
        }
        if (height < boxY) {
            setVelocity(dx, Math.abs(dy) );
        } else if (height > boxHeight) {
            setVelocity(dx, -Math.abs(dy) );
       }
    }


    public String toString() {
        String info = "Re";
        return info;
    }
}