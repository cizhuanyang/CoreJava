package bounceThread;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BallComponent extends JComponent{
    private static final int DEFAULT_WIDTH=450;
    private static final int DEFAULT_HEIGHT=350;
    private List<Ball> balls=new ArrayList<>();
    public void add(Ball ball){
        balls.add(ball);
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        Graphics2D graphics2D=(Graphics2D)g;
        for (Ball ball:balls){
            graphics2D.fill(ball.getShape());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
