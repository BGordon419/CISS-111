import java.util.Scanner;

public class morseCode {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      String userIn = input.nextLine();
      String result = "";
      
      for(int x=0;x<userIn.length();x++) {
         result += morse(userIn.charAt(x));
      }
      System.out.println(result);
   }
   public static String morse(char in) {
      switch(Character.toUpperCase(in)) {
         case 'A' : return ".-";
         case 'B' : return "-...";
         case 'C' : return "-.-.";
         case 'D' : return "-..";
         case 'E' : return ".";
         case 'F' : return "..-.";
         case 'G' : return "--.";
         case 'H' : return "....";
         case 'I' : return "..";
         case 'J' : return ".---";
         case 'K' : return "-.-";
         case 'L' : return ".-..";
         case 'M' : return "--";
         case 'N' : return "-.";
         case 'O' : return "---";
         case 'P' : return ".--.";
         case 'Q' : return "--.-";
         case 'R' : return ".-.";
         case 'S' : return "...";
         case 'T' : return "-";
         case 'U' : return "..-";
         case 'V' : return "...-";
         case 'W' : return ".--";
         case 'X' : return "-..-";
         case 'Y' : return "-.--";
         case 'Z' : return "--..";
         case '0' : return "-----";
         case '1' : return ".----";
         case '2' : return "..---";
         case '3' : return "...--";
         case '4' : return "....-";
         case '5' : return ".....";
         case '6' : return "-....";
         case '7' : return "--...";
         case '8' : return "---..";
         case '9' : return "----.";
         case '.' : return ".-.-.-";
         case ',' : return "--..--";
         case '?' : return "..--..";
         case ' ' : return " ";
         default : return "?";
      }
   }
}