import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {

        int arr[] = {12, 11, 13, 5, 6, 7};
        int sortedArr[] = {5,6,7,11,12,13};

        MergeSort.sort(arr, 0, arr.length-1);

        Assert.assertArrayEquals(sortedArr, arr);
    }
}