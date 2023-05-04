package learn.nara;

import learn.nara.Solution.Circle;
import learn.nara.Solution.Rectangle;
import learn.nara.Solution.Shape;
import learn.nara.Solution.Square;

public class ShapeFactory {
  public void drawShape(String type) {


    if("Square".equals(type)){
      ((Shape)new Square()).drawShape();

    }else
    if("Circle".equals(type)){
      ((Shape)new Circle()).drawShape();

    } else
    if("Rectangle".equals(type)){
      ((Shape)new Rectangle()).drawShape();

    }
  }
}
