package Assignment3;

import java.util.Arrays;

/**
 * Problem 4
 * This program is a recursive solution to return max value from the given array.
 */
public class Problem4
{

    private static int getMaxNumber(int[] arr, int maxNum)
    {
        if(arr.length == 0)
        {
            System.out.println("Invalid input. At least one input number is required.");
            return 0;
        }

        maxNum = Math.max(maxNum, arr[0]);
        if(arr.length == 1)
        {
            return maxNum;
        }
        else
        {
            return getMaxNumber(Arrays.copyOfRange(arr,1,arr.length),maxNum);
        }

    }

    public static int getMaxNumber(int[] arr)
    {
        return getMaxNumber(arr, Integer.MIN_VALUE);
    }

    static void main(String[] args)
    {
        int[] inputArray = {5, -3, 12, 1, -9, 4 };
        int maxNumber = getMaxNumber(inputArray);
        System.out.println(maxNumber);
    }
}
