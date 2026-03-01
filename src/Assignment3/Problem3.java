package Assignment3;

/**
 * Problem 3
 * This program uses recursive solution to check whether the given number is Palindrome or not.
 */
public class Problem3
{
    private static int getReverse(int num, int reversed)
    {
        if(num == 0)
        {
            return reversed;
        }
        else
        {
            return getReverse(num/10,(reversed*10)+ num%10);

        }
    }

    private static int getReverse(int num)
    {
        return getReverse(num,0);
    }

    static void main(String[] args)
    {
        int inputNumber = Integer.parseInt(IO.readln("Enter your number: "));
        boolean result = getReverse(inputNumber) == inputNumber;
        if(result)
        {
            System.out.printf("The given number %d is a palindrome number.",inputNumber);
        }
        else
        {
            System.out.printf("The given number %d is not a palindrome number.",inputNumber);
        }
    }
}
