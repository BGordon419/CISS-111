public class Employee {

   private String name;
   private int idNumber;
   private String department;
   private String position;

   public Employee() {
      name = "";
      idNumber = 0;
      department = "";
      position = "";
   }
   public Employee(String nam, int id) {
      name = nam;
      idNumber = id;
      department = "";
      position = "";
   }
   public Employee(String nam, int id, String dep, String pos) {
      name = nam;
      idNumber = id;
      department = dep;
      position = pos;
   }

   public String getName() {
      return name;
   }
   public int    getID() {
      return idNumber;
   }
   public String getDepartment() {
      return department;
   }
   public String getPosition() {
      return position;
   }

   public void   setName(String nam) {
      name = nam;
   }
   public void   setID(int id) {
      idNumber = id;
   }
   public void   setDepartment(String dep) {
      department = dep;
   }
   public void   setPositon(String pos) {
      position = pos;
   }
}
