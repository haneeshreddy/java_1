import java.applet*;
import java.awt.*;
/*<applet code="myApplet.class"height=100,width=200>
</applet>*/
public class MyApplet extends Applet
{
public void init()
{
system.out.println("initialization method is started");
}
public void start()
{
system.out.println("applet is started");
}
public void paint(Graphics g)
g.drawstring("welcome"100,200)
{
system.out.println("paint method is wroking);
}
public void stop()
{
system.out.println("window is minimized");
}
public void destroy()
{
system.out.println("applet is closed");
}
}
