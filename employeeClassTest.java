public class employeeClassTest {

   public static void main(String[] args) {

      Employee sue = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee mark = new Employee("Make Jones", 39119, "IT", "Programmer");
      Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

      empOut(sue);
      empOut(mark);
      empOut(joy);
   }

   public static void empOut(Employee emp) {
      System.out.println(emp.getName() + " | " + emp.getID() + " | "
                       + emp.getDepartment() + " | " + emp.getPosition());
   }
}
