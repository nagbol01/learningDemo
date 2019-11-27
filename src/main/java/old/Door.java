package old;

/**
 * Class to represent a old.Door with name, state, and area.
 */
public class Door{

  // fields with access modifiers
  private String name;
  private String state;


  // methods
  public void open() {
    this.state = "open";
  }
  public void close() {
    this.state = "close";
  }

  // constructors
  public Door(String name, String state) {
    this.name = name;
    this.state = state;
  }

  // accessors
  public String getName() {
    return name;
  }
  public String getState() {
    return state;
  }

  //mutators
  public void setName(String newName) {
    name = newName;
  }
  public void setState(String newState) {
    state = newState;
  }

}