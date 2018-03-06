package ru.stqa.ptt.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void distance() {
    Point p1 = new Point(6,12);
    Point p2 = new Point(17,25);
    Assert.assertEquals(p1.distance() + p2.distance(), 994.0);

    }
}
