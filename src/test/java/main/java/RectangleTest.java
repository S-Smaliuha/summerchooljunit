package main.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest extends TestCase {
    @Test
    public void testGetArea(){
        main.java.Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals(12, rectangle.getArea());
    }

    public void testGetPerimetr() {
        main.java.Rectangle rectangle = new Rectangle(5, 5);
        Assert.assertEquals(25, rectangle.getArea());
    }

    public void testGetDiagonal() {
        main.java.Rectangle rectangle = new Rectangle(5,5);
        Assert.assertEquals(25, rectangle.getArea());
    }

    public void testisQuadrat() {
        main.java.Rectangle rectangle = new Rectangle(5,5);
        Assert.assertEquals(true, rectangle.isQuadrat());
    }

    public void testGetWidth() {
        main.java.Rectangle rectangle = new Rectangle(5,0);
        Assert.assertEquals(0, rectangle.getWidth());
    }
}