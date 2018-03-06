package ru.stqa.ptt.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
    Point p1 = new Point(6,12);
    Point p2 = new Point(17,25);

    System.out.println("Расстояние между двумя точками = " + distance(p1, p2));
  }

  public static double distance(Point p1, Point p2) {
    double distance = Math.sqrt((p2.a-p1.a)*(p2.a-p1.a)+(p2.b-p1.b)*(p2.b-p1.b));
    return distance;
  }
}