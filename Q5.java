import java.awt.*;    
    import java.applet.*;    
        
    public class Q5 extends Applet    
     {    
       public void  paint(Graphics g)    
       {    
          g.drawLine(25,25,100,25);    
        
          g.drawRect(25,40,100,50);    
        
          g.fillRect(145,40,100,50);    
        
          g.drawRect(265,40,50,50);    
        
          g.drawOval(25,205,100,50);    
          g.setColor(Color.RED); 
          g.fillOval(145,205,100,50);    
          g.setColor(Color.CYAN); 
          g.drawOval(265,205,50,50);    
        
           
       }    
     }
/*
<applet code = "Q5.class" width = "320" height = "120"></applet>
*/


import java.applet.*;
import java.awt.*;

public class Q5 extends Applet{
	
	public void paint(Graphics g){
		g.setColor(Color.YELLOW);    	
		g.fillOval(200,200,200,200); 	
		g.setColor(Color.RED);    	
		g.fillOval(800,400,300,300);
		g.setColor(Color.BLACK);
		g.drawLine(10,50,10,100);
		g.drawRect(30,10,100,100);
		g.fillRect(30,10,100,100);
	}
}

/*
<applet code = "Q5.class" width = "320" height = "120"></applet>
*/