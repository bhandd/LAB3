package lab3.lab3.Shapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {

    private double x2, y2;
    public double dy2;
    public double dx2;

    public Line(double x, double y, double x2, double y2, Color color){
        super(x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(){
        super();
        this.x2 = 100;
        this.y2 = 100;

    }


//    public Line(int i, int i1, int i2, Color red) {
//    }

    //TODO: test get and set-methods
    public double getX2(){
        return x2;
    }
    public void setX2(double x2){
        if(x2 < 0){
            this.x2 = 0;
        }else{ this.x2 = x2;}
    }
    public double getY2(){
        return y2;
    }
    public void setY2(double y2){
        if(y2 < 0){
            this.y2 = 0;
        }else{ this.y2 = y2;}
    }
    @Override
    public void move(long elapsedTimeNs){
        super.move(elapsedTimeNs);

        x2 += getDx() * elapsedTimeNs / BILLION;
        y2 += getDy() * elapsedTimeNs / BILLION;
    }
    @Override
    public void paint(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(getX(), getY(), x2, y2);
    }
    @Override
    public void constrain(double boxX, double boxY,
                          double boxWidth, double boxHeight){
        super.constrain(boxX, boxY, boxWidth, boxHeight);
        double dx = getDx();
        double dy = getDy();


        if (x2 < boxX) {
            setVelocity(Math.abs(dx), dy ) ;
        } else if (x2 > boxWidth) {
            setVelocity(-Math.abs(dx), dy );
        }
        if (y2 < boxY) {
            setVelocity(dx, Math.abs(dy) );
        } else if (y2 > boxHeight) {
            setVelocity(dx, -Math.abs(dy) );
        }
    }

    @Override
    public String toString(){
        return super.toString() +
                ", x2=" + x2 +
                ", y2=" + y2;
    }
}
