import java.awt.*;
import java.applet.*;
/*<applet code=Exp16 width=8000 height=10000>
</applet>*/

public class Exp16 extends Applet
{
 public void paint(Graphics g)
 {
  /*draw cone*/
  g.drawOval(10,10,20,10);
  g.drawLine(10,15,20,40);
  g.drawLine(30,15,20,40);

  /*draw cylinder*/
  g.drawOval(40,20,20,10);
  g.drawOval(40,50,20,10);
  g.drawLine(40,25,40,55);
  g.drawLine(60,25,60,55);

  /*Draw Cube*/
  g.drawRect(70,10,20,20);
  g.drawRect(80,20,20,20);
  g.drawLine(70,10,80,20);
  g.drawLine(70,30,80,40);
  g.drawLine(90,30,100,40);
  g.drawLine(90,10,100,20);
  
  /*DRAW CIRCLE INSIDE SQUARE*/
  g.drawRect(10,80,20,20);
  g.drawOval(10,80,20,20);
 
 /*Draw square in circle*/
  g.drawRect(50,75,22,28);
  g.drawOval(40,70,40,40);
 } 
}