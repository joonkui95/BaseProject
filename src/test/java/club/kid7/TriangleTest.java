package club.kid7;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void getTypeEquilateralTriangle() throws Exception {
        // Arrange
        Triangle triangle = new Triangle(5, 5, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("正三角形", result);
    }

}
