package Assignment3;

/**
 * ProbLem 1
 * This program uses Recursion to find the minimum character in the given string input.
 */
public class Problem1
{
    static void main(String[] args)
    {
        String input = IO.readln("Enter your input to find the minimum character: ");
        Character minChar = getMinimumCharacter(input);
        System.out.println("The minimum character is: "+minChar);
    }

    public static Character getMinimumCharacter(String str)
    {
        if(str == null || str.isEmpty())
        {
            return null;
        }
        else if (str.length() == 1) {
            return str.charAt(0);
        }
        else
        {
            Character min = getMinimumCharacter(str.substring(1));
            return (min.compareTo(str.charAt(0)) > 0 ? str.charAt(0):min);
        }
    }
}
