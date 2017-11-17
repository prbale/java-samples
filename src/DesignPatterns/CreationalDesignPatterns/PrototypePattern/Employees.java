package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description : Prototype pattern provides a mechanism to copy the original object to a new object
 *    and then modify it according to our needs. Prototype pattern uses java cloning to copy object.
 *
 * Created by Prashant on 19-10-2017.
 */
public class Employees implements Cloneable {

  private List<String> employeeList;

  public Employees() {
    employeeList = new ArrayList<>();
  }

  public Employees(List<String> list) {
    employeeList = list;
  }

  public void loadData() {
    employeeList.add("Prashant");
    employeeList.add("Amar");
    employeeList.add("Anish");
    employeeList.add("Drup");
  }

  public List<String> getEmployeeList() {
    return employeeList;
  }

  @Override protected Object clone() throws CloneNotSupportedException {

      List<String> temp = new ArrayList<>();

      for(String s : getEmployeeList()) {
          temp.add(s);
      }

      return new Employees(temp);
  }
}
