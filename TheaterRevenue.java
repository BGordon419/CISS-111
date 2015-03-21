// Brandon Gordon - Unit 6, Chapter 12 #5 Theater Revenue

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TheaterRevenue extends JFrame {

   private final int WINDOW_WIDTH =  600;
   private final int WINDOW_HEIGHT = 200;
   private final double PERCENTAGE = 0.2;

   private double ag;
   private double an;
   private double cg;
   private double cn;

   private JLabel x1;
   private JLabel x2;
   private JLabel adultText;
   private JLabel adultGross;
   private JLabel adultNet;
   private JLabel percentA;
   private JLabel childText;
   private JLabel childGross;
   private JLabel childNet;
   private JLabel percentC;
   private JLabel totalGross;
   private JLabel totalNet;
   private JLabel tGrossText;
   private JLabel tNetText;

   private JButton calc;

   private JTextField adultPrice;
   private JTextField adultNumber;
   private JTextField childPrice;
   private JTextField childNumber;

   private JPanel panel00;
   private JPanel panel01;
   private JPanel panel02;
   private JPanel panel03;
   private JPanel panel04;

   private JPanel panel10;
   private JPanel panel11;
   private JPanel panel12;
   private JPanel panel13;
   private JPanel panel14;

   private JPanel panel20;
   private JPanel panel21;
   private JPanel panel22;
   private JPanel panel23;
   private JPanel panel24;

   private JPanel panel30;
   private JPanel panel31;
   private JPanel panel32;
   private JPanel panel33;
   private JPanel panel34;

   private JPanel panel40;
   private JPanel panel41;
   private JPanel panel42;
   private JPanel panel43;
   private JPanel panel44;

   private JPanel panel50;
   private JPanel panel51;
   private JPanel panel52;
   private JPanel panel53;
   private JPanel panel54;

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

   public void assign() {

      // JLabels
      adultText = new JLabel("Adult Price: $",SwingConstants.RIGHT);
      adultGross = new JLabel("$0");
      adultNet = new JLabel("$0");
      percentA = new JLabel("X 20% = ",SwingConstants.RIGHT);
      x1 = new JLabel("X",SwingConstants.CENTER);
      childText = new JLabel("Child Price: $",SwingConstants.RIGHT);
      childGross = new JLabel("$0");
      childNet = new JLabel("$0");
      percentC = new JLabel("X 20% = ",SwingConstants.RIGHT);
      x2 = new JLabel("X",SwingConstants.CENTER);
      tGrossText = new JLabel("Gross Total: ",SwingConstants.RIGHT);
      tNetText = new JLabel("Net Total: ",SwingConstants.RIGHT);
      totalGross = new JLabel("$0");
      totalNet = new JLabel("$0");

      // JButtons
      calc = new JButton("Calculate");

      // JTextFields
      adultPrice = new JTextField(5);
      adultNumber = new JTextField(5);
      childPrice = new JTextField(5);
      childNumber = new JTextField(5);

      // JPanels
      // Row 0
      panel00 = new JPanel();
      panel01 = new JPanel();
      panel02 = new JPanel();
      panel03 = new JPanel();
      panel04 = new JPanel();
      // Row 1
      panel10 = new JPanel();
      panel11 = new JPanel();
      panel12 = new JPanel();
      panel13 = new JPanel();
      panel14 = new JPanel();
      // Row 2
      panel20 = new JPanel();
      panel21 = new JPanel();
      panel22 = new JPanel();
      panel23 = new JPanel();
      panel24 = new JPanel();
      // Row 3
      panel30 = new JPanel();
      panel31 = new JPanel();
      panel32 = new JPanel();
      panel33 = new JPanel();
      panel34 = new JPanel();
      // Row 4
      panel40 = new JPanel();
      panel41 = new JPanel();
      panel42 = new JPanel();
      panel43 = new JPanel();
      panel44 = new JPanel();
      // Row 5
      panel50 = new JPanel();
      panel51 = new JPanel();
      panel52 = new JPanel();
      panel53 = new JPanel();
      panel54 = new JPanel();

   }

   public void fillLayout() {

      // Fill Layout
      // Row 0 -----------------------------
      panel00.add(adultText);   add(panel00);
      panel01.add(adultPrice);  add(panel01);
      panel02.add(x1);          add(panel02);
      panel03.add(adultNumber); add(panel03);
      panel04.add(adultGross);  add(panel04);
      // Row 1 -----------------------------
      /*Blank*/                 add(panel10);
      /*Blank*/                 add(panel11);
      /*Blank*/                 add(panel12);
      panel13.add(percentA);    add(panel13);
      panel14.add(adultNet);    add(panel14);
      // Row 2 -----------------------------
      panel20.add(childText);   add(panel20);
      panel21.add(childPrice);  add(panel21);
      panel22.add(x2);          add(panel22);
      panel23.add(childNumber); add(panel23);
      panel24.add(childGross);  add(panel24);
      // Row 3 -----------------------------
      /*Blank*/                 add(panel30);
      /*Blank*/                 add(panel31);
      /*Blank*/                 add(panel32);
      panel33.add(percentC);    add(panel33);
      panel34.add(childNet);    add(panel34);
      // Row 4 -----------------------------
      /*Blank*/                 add(panel40);
      /*Blank*/                 add(panel41);
      /*Blank*/                 add(panel42);
      panel43.add(tGrossText);  add(panel43);
      panel44.add(totalGross);  add(panel44);
      // Row 5 -----------------------------
      panel50.add(calc);        add(panel50);
      /*Blank*/                 add(panel51);
      /*Blank*/                 add(panel52);
      panel53.add(tNetText);    add(panel53);
      panel54.add(totalNet);    add(panel54);

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

   public static void main(String[] args)
   {

      new TheaterRevenue();

   }

}
