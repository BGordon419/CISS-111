public class ShipDemo
{
   public static void main(String[] args)
   {
      Ship[] boats = new Ship[3];
      int x;
      
      boats[0] = new Ship("The Santa Maria", "1492");
      boats[1] = new CruiseShip("The Titanic", "1911", 3327);
      boats[2] = new CargoShip("The Exxon Valdez", "1985", 214861);
      
      for(x = 0; x < 3; x++)
      {
         System.out.println(boats[x].toString() + "\n");
      }
   }
}