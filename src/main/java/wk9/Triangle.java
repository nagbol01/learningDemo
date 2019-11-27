package wk9;

public class Triangle {

  private int width;

  public Triangle(int width) {
    this.width = width;
  }

  public int getArea() {
    if (this.width == 1) {
      return 1;
    }

    Triangle smallerTriangle = new Triangle(this.width - 1);
    return smallerTriangle.getArea() + this.width;
  }
}
