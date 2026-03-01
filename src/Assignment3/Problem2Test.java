package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test
{
    @Test
    void reverseArray()
    {
        int[] input1 = {1,5,2,20,14,19,6};
        int[] input2 = {-1,4,-5,22,9,-5,14};
        int[] expectedOutput1 = {6,19,14,20,2,5,1};
        int[] expectedOutput2 = {14,-5,9,22,-5,4,-1};
        int[] reverseArray1 = Problem2.reverseArray(input1);
        int[] reverseArray2 = Problem2.reverseArray(input2);
        assertArrayEquals(expectedOutput1, reverseArray1);
        assertArrayEquals(expectedOutput2, reverseArray2);
    }

}