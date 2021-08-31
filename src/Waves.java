import java.awt.*;

public class Waves {
    private double t;
    private int lines;
    private int startX;
    private int startY;
    // private int color;

    public static final int LINE_WIDTH = 23, CIRCLE_HEIGHT = 6;


    public Waves(int lines, double t, int startX, int startY){
        this.t = t;
        this.lines = lines;
        this.startX = startX;
        this.startY = startY;
        // this.color = color;
    }

    public void tick(int height, int width){
        t += .03;
    }

    public void render(Graphics g, int width, int height){

        g.setColor(Color.WHITE);
        for (int i = 0; i < lines; i++){
            int length = (int) (Math.sin(t + .1 * i) * (height - 100)) / 8;
            int color = (int) (((-1.0 * length - 87) / 174) * 85 + 155);
            g.setColor(new Color(color - 20, color - 20, 255 - color + 20));
            g.fillRect(startX + i * 30, 200 + length - startY, LINE_WIDTH, 140 - length);
            g.fillOval(startX + i * 30, 340 - (CIRCLE_HEIGHT / 2) - startY, LINE_WIDTH, CIRCLE_HEIGHT);
            g.setColor(new Color(color, color, 255 - color));
            g.fillOval(startX + i * 30, 200 + length - (CIRCLE_HEIGHT / 2) - startY, LINE_WIDTH, CIRCLE_HEIGHT);
        }

    }
}
