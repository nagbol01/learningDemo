package employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  private String name; // employee’s name; non-null
  private Employee lineManager; // employee’s direct manager; null means none

  public Employee(String name, Employee lineManager) {
    this.name = name;
    this.lineManager = lineManager;
  }

  public Employee(String name) { // constructor for the CEO
    this(name, null); // the CEO has no line manager
  }

  public Employee getLineManager() {
    return this.lineManager;
  }

  public Employee getCEO() {
    if (lineManager == null) {
      return this;
    }
    return this.lineManager.getCEO();
  }

  public Employee getCEOLoop() {
    Employee temporary = this;

    while (temporary.lineManager != null) {
      temporary = temporary.lineManager;
    }
    return temporary;
  }

  public List<Employee> getCommandChain() {
    List<Employee> result = new ArrayList<Employee>();
    fillCommandChain(result);
    return result;
  }

  private void fillCommandChain(List<Employee> chain) {
    Employee temporary = this;
    chain.add(temporary);
    if (temporary.lineManager != null) {
      temporary.lineManager.fillCommandChain(chain);

    }
  }

  public List<Employee> getCommandChainLoop() {
    List<Employee> result = new ArrayList<Employee>();
    Employee tempi = this;
    while (tempi.lineManager != null) {
      result.add(tempi);
      tempi = tempi.lineManager;
    }

    if (tempi.lineManager == null) {
      result.add(tempi);
    }

    return result;
  }

  @Override
  public String toString() {
    return this.name; // omits the line manager
  }


}
