import java.applet.*;
import java.awt.*;

public class helloworld extends Applet{
	@Override 
	public void paint(Graphics g){
		g.drawString("Hello World",50,100);
	}
}

/*
<applet code="helloworld.class" width="300" height="200"></applet>
*/