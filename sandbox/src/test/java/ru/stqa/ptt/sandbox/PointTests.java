package ru.stqa.ptt.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(6,12);
    Point p2 = new Point(17,25);
    Point p3 = new Point (0, 33);
    Point p4 = new Point (-2, 5);
    Assert.assertEquals(p1.distance(p2), 17.029386365926403);
    Assert.assertEquals(p2.distance(p3), 18.788294228055936);
    Assert.assertEquals(p3.distance(p4), 28.071337695236398);

    }
}
