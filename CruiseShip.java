public class CruiseShip extends Ship
{
   private int passengers;
   
   public CruiseShip(String n, String y, int p)
   {
      super(n, y);
      passengers = p;
   }
   public void setPassengers(int inP)
   {
      passengers = inP;
   }
   public int getPassengers()
   {
      return passengers;
   }
   public String toString()
   {
      return("The ship's name is: " + getName() + ".\nThe ship's maximum passenger count is: " + passengers + ".");
   }
}