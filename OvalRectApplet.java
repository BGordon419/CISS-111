//Java applet to draw ovals and rectangles

import java.awt.*;
import javax.swing.*;

public class OvalRectApplet extends JApplet
{
   private final int SIZE = 200;
   
   public void paint(Graphics g)
   {
      int shape;
      int noOfFigures;
      int x, count;
      int y;
      int width;
      int height;
      int red;
      int green;
      int blue;
      int[] x_values = new int[5];
      int[] y_values = new int[5];
      
      int i;
      
      //determine the number of figures
      noOfFigures = 5 + (int)(Math.random() * 10);
      
      for (i = 0; i < noOfFigures; i++)
      {
         red = (int)(Math.random() * 256);      //red component
         green = (int)(Math.random() * 256);    //green component
         blue = (int)(Math.random() * 256);     //blue component
         
         g.setColor(new Color(red, green, blue));  //color for
         //this figure
         
         x = (int)(Math.random() * SIZE);         //x value
         y = (int)(Math.random() * SIZE);         //y value
         width = (int)(Math.random() * SIZE);     //width
         height = (int)(Math.random() * SIZE);    //height
         
         shape = (int)(Math.random() * 5);
         
         /**
          *    0 : Rectangle
          *    1 : Filled Rectangle
          *    2 : Oval
          *    3 : Filled Oval
          *
          **/
         
         switch (shape)
         {
            case 0: g.drawRect(x, y, width, height);
            break;
            case 1: g.fillRect(x, y, width, height);
            break;
            case 2: g.drawOval(x, y, width, height);
            break;
            case 3: g.fillOval(x, y, width, height);
            break;
            case 4:
               for (count = 0; count < 5; count++)
            {
               x_values[count] = (int)(Math.random() * SIZE);
               y_values[count] = (int)(Math.random() * SIZE);
            }
               g.drawPolygon(x_values, y_values, 5);
               break;
         }//end switch
      }//end for
      
   }
   
}
