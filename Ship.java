public class Ship {
   
   private String n;
   private String y;
   
   public Ship(String nameIn, String yearIn) {
      
      n = nameIn;
      y = yearIn;
   }
   
   public void setName(String nameIn) {
      n = nameIn;
   }
   public void setYearBuilt(String yearIn) {
      y = yearIn;
   }
   public String getName() {
      return n;
   }
   public String getYearBuilt() {
      return y;
   }
   
   public String toString() {
      return "The ship's name is: " + n + "." +
         "\nThe year the ship was built was: " + y + ".";
   }
}