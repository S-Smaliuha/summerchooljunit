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
        main.java.Rectangle rectangle = new Rectangle(1, 5);
        Assert.assertEquals(5, rectangle.getArea());
    }

    public void testGetDiagonal() {
        main.java.Rectangle rectangle = new Rectangle(5,2);
        Assert.assertEquals(10, rectangle.getArea());
    }

    public void testisQuadrat() {
        main.java.Rectangle rectangle = new Rectangle(4,5);
        Assert.assertEquals(false, rectangle.isQuadrat());
    }

    public void testIsLine() {
        main.java.Rectangle rectangle = new Rectangle(0,1);
        Assert.assertEquals(true, rectangle.isLine());
    }
}