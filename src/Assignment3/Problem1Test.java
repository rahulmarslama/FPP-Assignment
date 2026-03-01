package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test
{
    @Test
    void getMinimumCharacterTest()
    {
        Character minChar = Problem1.getMinimumCharacter("akel");
        assertEquals('a', minChar);
    }

}