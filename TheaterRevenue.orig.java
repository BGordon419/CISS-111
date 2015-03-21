// Brandon Gordon - Unit 6, Chapter 12 #5 Theater Revenue

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TheaterRevenue extends JFrame {
   
   private final int WINDOW_WIDTH =  1000;
   private final int WINDOW_HEIGHT = 300;
   private final double PERCENTAGE = 0.2;
   
   double ag;
   double an;
   double cg;
   double cn;
   
   
   JLabel x1;
   JLabel x2;
   JLabel adultText;
   JLabel adultGross;
   JLabel adultNet;
   JLabel percentA;
   JLabel childText;
   JLabel childGross;
   JLabel childNet;
   JLabel percentC;
   JLabel totalGross; 
   JLabel totalNet;
   JLabel totalGText;
   JLabel totalNText;
   
   JButton calc;
   
   JTextField adultPrice;
   JTextField childPrice;
   JTextField adultNumber;
   JTextField childNumber;
   
   JPanel panel00;
   JPanel panel01;
   JPanel panel02;
   JPanel panel03;
   JPanel panel04;
   
   JPanel panel10;
   JPanel panel11;
   JPanel panel12;
   JPanel panel13;
   JPanel panel14;
   
   JPanel panel20;
   JPanel panel21;
   JPanel panel22;
   JPanel panel23;
   JPanel panel24;
   
   JPanel panel30;
   JPanel panel31;
   JPanel panel32;
   JPanel panel33;
   JPanel panel34;
   
   JPanel panel40;
   JPanel panel41;
   JPanel panel42;
   JPanel panel43;
   JPanel panel44;
   
   JPanel panel50;
   JPanel panel51;
   JPanel panel52;
   JPanel panel53;
   JPanel panel54;
   
   // Constructor
   public TheaterRevenue() {
      
      setTitle("Theater Revenue");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new GridLayout(6,5));
      
      assign();
      fillLayout();
      
      calc.addActionListener(new buttonActionListener());
      
      setVisible(true);
   }
   
   //Assigns variables
   public void assign() {
      
      adultText = new JLabel("Adult Price: $",SwingConstants.RIGHT);
      childText = new JLabel("Child Price: $",SwingConstants.RIGHT);
      x1 = new JLabel("X",SwingConstants.CENTER);
      x2 = new JLabel("X",SwingConstants.CENTER);
      adultGross = new JLabel("$0");
      adultNet = new JLabel("$0");
      childGross = new JLabel("$0");
      childNet = new JLabel("$0");
      totalGross = new JLabel("$0"); 
      totalNet = new JLabel("$0");
      
      calc = new JButton("Calculate");
      
      adultPrice = new JTextField(5);
      childPrice = new JTextField(5);
      adultNumber = new JTextField(5);
      childNumber = new JTextField(5);
      
      percentA = new JLabel("X 20% = ",SwingConstants.RIGHT);
      percentC = new JLabel("X 20% = ",SwingConstants.RIGHT);
      totalGText = new JLabel("Gross Total: ",SwingConstants.RIGHT);
      totalNText = new JLabel("Net Total: ",SwingConstants.RIGHT);
      
      
   }
   
   public void fillLayout() {
      
      // Fill Layout
      
      // Row 0
      panel00.add(adultText);   add(panel00);
      panel01.add(adultPrice);  add(panel01);
      panel02.add(x1);          add(panel02);
      panel03.add(adultNumber); add(panel03);
      panel04.add(adultGross);  add(panel04);
      
      // Row 1
      add(panel10);
      add(panel11);
      add(panel12);
      add(panel13);
      add(panel14);
      
      // Row 2
      add(panel20);
      add(panel21);
      add(panel22);
      add(panel23);
      add(panel24);
      
      // Row 3
      add(panel30);
      add(panel31);
      add(panel32);
      add(panel33);
      add(panel34);
      
      // Row 4
      add(panel40);
      add(panel41);
      add(panel42);
      add(panel43);
      add(panel44);
      
      // Row 5
      /**panelCalc.add(calc);**/ add(panel50);
      add(panel51);
      add(panel52);
      add(panel53);
      add(panel54);
      
   }
   
   private void buildPanel() {
      
      calc.addActionListener(new buttonActionListener());
   }
   
   private class buttonActionListener implements ActionListener{
      
      public void actionPerformed(ActionEvent e) {
         
         // Uses input from text boxes to calculate
         
         ag = (Double.parseDouble(adultPrice.getText()) * 
               Double.parseDouble(adultNumber.getText()));
         
         an = (Double.parseDouble(adultPrice.getText()) * 
               Double.parseDouble(adultNumber.getText()) * PERCENTAGE);
         
         cg = (Double.parseDouble(childPrice.getText()) * 
               Double.parseDouble(childNumber.getText()));
         
         cn = (Double.parseDouble(childPrice.getText()) * 
               Double.parseDouble(childNumber.getText()) * PERCENTAGE);
         
         adultGross.setText("$" + ag);
         
         adultNet.setText("$" + an);
         
         childGross.setText("$" + cg);
         
         childNet.setText("$" + cn);
         
         totalGross.setText("$" + (ag +cg));
         
         totalNet.setText("$" + (an +cn));
         
      }
   }
   
   public static void main(String[] args) {
      
      new TheaterRevenue();
      
   }
   
}