import org.junit.Assert;
import org.junit.Test;
public class KaratsubaMultiplicationTest {

    @Test
    public void multiply() {
        Assert.assertEquals(7006652,KaratsubaMultiplication.multiply(1234, 5678));
        Assert.assertEquals(100,KaratsubaMultiplication.multiply(10, 10));
        Assert.assertEquals(1,KaratsubaMultiplication.multiply(1, 1));
        Assert.assertEquals(0,KaratsubaMultiplication.multiply(0, 1000));
    }
}