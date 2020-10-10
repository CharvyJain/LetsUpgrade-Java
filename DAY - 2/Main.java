public class Main {
  public static void main (String[]args) {

    Employee one = new Employee();
      one.name = "Charvy Jain";
      one.age = 20;
      one.city = "Mumbai";

    Employee two = new Employee ();
      two.name = "Siya Joshi";
      two.age = 20;
      two.city = "Delhi";

      one.display ();
      two.display ();
  }
}
