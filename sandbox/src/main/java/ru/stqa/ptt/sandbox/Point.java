package ru.stqa.ptt.sandbox;

public class Point {

  public double a;
  public double b;

  public Point(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double distance() {
    return ((this.a * this.b) + (this.a * this.b));
  }

}