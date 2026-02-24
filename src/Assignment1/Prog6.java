package Assignment1;

/**
 * Prog6
 * This program prints the second-largest number in an array.
 */
public class Prog6 {
    void main()
    {
        int arraySize = Integer.parseInt(IO.readln("Enter the size of the array: \n"));
        int[] input = new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            input[i]= Integer.parseInt(IO.readln());
        }
        int secondSmallestNumber = Integer.MAX_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for(int i=0;i< input.length;i++) // 10 9 8 7 6
        {
            if(input[i] < smallestNumber)
            {
                secondSmallestNumber = smallestNumber;
                smallestNumber = input[i];
            }
            if(input[i] < secondSmallestNumber && input[i] > smallestNumber)
            {
                secondSmallestNumber = input[i];
            }
        }
        System.out.println("The second largest number is "+ secondSmallestNumber);
    }
}
