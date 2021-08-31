import java.awt.*;

public class Handler {
    private Waves[] waves;

    public static final int COLOR_CHANGE = 5, COLOR_START = 245, LINE_START = 0;

    public Handler(int width, int height, int num){
        waves = new Waves[num];
        for (int i = 0; i < num; i++){
            waves[i] = new Waves(60, .13 * i, LINE_START + -5 * i, -12 * i);
        }
    }

    public void tick(int width, int height){
        for (int i = 0; i < waves.length; i++){
            waves[i].tick(width, height);
        }
    }

    public void render(Graphics g, int width, int height){
        for (int i = 0; i < waves.length; i++){
            waves[i].render(g, width, height);
        }
    }
}
