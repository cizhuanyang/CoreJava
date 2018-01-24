package bounceThread;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {
    private int dx=1;
    private int dy=1;
    private double x;
    private double y;
    private double radius;
    public Ball(){
        x=0.0;
        y=0.0;
        radius=13;
    }
    public void move(Rectangle2D rectangle2D){
        x+=dx;
        y+=dy;
        if (x<getMinX(rectangle2D)){
            x=getMinX(rectangle2D);
            dx=-dx;
        }
        if (x+radius>getMaxX(rectangle2D)){
            x=getMaxX(rectangle2D);
            dx=-dx;
        }
        if (y<getMinY(rectangle2D)){
            y=getMinY(rectangle2D);
            dy=-dy;
        }
        if (y+radius>=getMaxY(rectangle2D)){
            y=getMaxY(rectangle2D)-radius;
            dy=-dy;
        }
    }
    private double getMinX(Rectangle2D rectangle2D){
        return rectangle2D.getMinX();
    }
    private double getMaxX(Rectangle2D rectangle2D){
        return rectangle2D.getMaxX();
    }
    private double getMinY(Rectangle2D rectangle2D){
        return  rectangle2D.getMinY();
    }
    private double getMaxY(Rectangle2D rectangle2D){
        return rectangle2D.getMaxY();
    }
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,radius,radius);
    }
}
