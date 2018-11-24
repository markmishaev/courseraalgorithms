import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class ClosestPairTest {

    @Test
    public void ClosestPair() {

        int n = 10;
        Point2D[] points = new Point2D[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double x = ThreadLocalRandom.current().nextInt(1, 100);
            double y = ThreadLocalRandom.current().nextInt(1, 100);
            points[i] = new Point2D(x, y);
        }

        ClosestPair closestPair = new ClosestPair(points);
    }
}