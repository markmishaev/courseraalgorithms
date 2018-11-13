import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountNumberOfInversionsTest {

    @Test
    public void findInversionsByBruteForce1() {

        int[] array = {3, 2, 1};

        List<Pair> expectedInversions = new ArrayList<>();
        expectedInversions.add(new Pair(3, 2));
        expectedInversions.add(new Pair(3, 1));
        expectedInversions.add(new Pair(2, 1));

        List<Pair> actualInversions = CountNumberOfInversions.findInversionsByBruteForce(array);

        assertThat(actualInversions, is(expectedInversions));
    }

    @Test
    public void findInversionsByBruteForce2() {

        int[] array = {1, 3, 5, 2, 4, 6};

        List<Pair> expectedInversions = new ArrayList<>();
        expectedInversions.add(new Pair(3, 2));
        expectedInversions.add(new Pair(5, 2));
        expectedInversions.add(new Pair(5, 4));

        List<Pair> actualInversions = CountNumberOfInversions.findInversionsByBruteForce(array);

        assertThat(actualInversions, is(expectedInversions));
    }

    @Test
    public void mergeSort() {

        int[] array = {1, 3, 5, 2, 4, 6};
        int inversionsCount = CountNumberOfInversions.mergeSort(array, array.length);

        Assert.assertTrue(inversionsCount == 3);
    }
}