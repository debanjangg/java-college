import java.awt.*;
import java.applet.*;
public class Driver12 extends Applet{
    public void paint(Graphics G){
        G.drawLine(6, 7, 42, 69);
        G.drawRect(30, 30, 25, 36);
        G.setColor(Color.red);
        G.drawRoundRect(70, 70, 20, 20, 30, 30);
        G.setColor(Color.blue);
        G.drawOval(90, 10, 30, 30);
    }
}
