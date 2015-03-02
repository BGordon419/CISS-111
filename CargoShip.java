public class CargoShip extends Ship {
   
   private int tonnage;
   
   public CargoShip(String nameIn, String yearIn, int tons) {
      
      super(nameIn, yearIn);
      tonnage = tons;
   }
   
   public void setTonnage(int tons) {
      
      tonnage = tons;
   }
   public int getTonnage() {
      return tonnage;
   }
   public String toString() {
      
      return "The ship's name is: " + getName() + ".\nThe ship's cargo capacity is: " + tonnage + ".";
   }
}