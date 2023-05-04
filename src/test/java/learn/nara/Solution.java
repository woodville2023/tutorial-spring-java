package learn.nara;

import java.util.Scanner;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;



/*
 * Create the Circle, Square, Rectangle and ShapeFactory class.
 */
public class Solution {
  public static void main(String[] args) {
    new Solution().doTask(args);
  }
  private void doTask(String [] args){
    Circle circle = new Circle();
    Square square = new Square();
    Rectangle rectangle = new Rectangle();

    ((Shape)circle).drawShape();
    ((Shape)square).drawShape();
    ((Shape)rectangle).drawShape();

    System.out.println();

    ShapeFactory factory = new ShapeFactory();

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      String type = in.next();
      factory.drawShape(type);
    }
  }

  static class ShapeFactory{
    void drawShape(String type){
      if("Square".equals(type) ){
        new Square().drawShape();

      }else
      if("Rectangle".equals(type) ){
        new Rectangle().drawShape();
      }else
      if("Circle".equals(type) ){
        new Circle().drawShape();
      } else{
        System.out.println("Drawing a "+type+" is not supported");
      }
    }
  }

 static abstract class Shape{
    abstract void drawShape();
  }
  static class Square extends Shape{
    void drawShape(){
      System.out.println("Drawing a Square");
    }
  }

  static class Circle extends Shape{
    void drawShape(){
      System.out.println("Drawing a Circle");
    }
  }

  static class Rectangle extends Shape{
    void drawShape(){
      System.out.println("Drawing a Rectangle");
    }
  }




}

