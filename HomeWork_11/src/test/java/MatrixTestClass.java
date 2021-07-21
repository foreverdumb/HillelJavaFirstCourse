import com.hillel.homework_11.utils.MatrixUtilClass;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTestClass {
    @Test
    public void testIsSquare() {
        int n0 = 2;
        int n1 = 2;
        int[][] array = new int[n0][n1];
        int result = MatrixUtilClass.isMatrixSquare(array);
        Assert.assertEquals(0, result);
    }
}
