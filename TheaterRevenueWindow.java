import javax.swing.*;
import java.awt.*;

public class TheaterRevenueWindow extends JFrame {
   
   //Constructor
   public TheaterRevenueWindow() {
      
      final int WINDOW_WIDTH =  500;
      final int WINDOW_HEIGHT = 900;
      
      setTitle("Theater Revenue");
      
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setVisible(true);
   }
}