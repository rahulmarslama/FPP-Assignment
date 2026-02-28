package Assignment3;

import java.util.Arrays;

public class Problem2
{
    private static int[] reverseArray(int[] arr,int start,int end)
    {
        if(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr,++start,--end);
        }
        return arr;
    }

    private static int[] reverseArray(int[] arr)
    {
        return reverseArray(arr,0,arr.length-1);
    }

    static void main(String[] args)
    {
        int[] inputArray = new int[]{1,5,2,20,14,19,6};
        System.out.println(Arrays.toString(reverseArray(inputArray)));
    }
}
