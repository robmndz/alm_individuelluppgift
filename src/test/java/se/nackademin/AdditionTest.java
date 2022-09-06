package se.nackademin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    Addition addition = new Addition();

    

    @Test
    void addTwoNumbersTest() {

        // Given
        int num1 = 2;
        int num2 = 4;

        // When
        int result = addition.addTwoNumbers(num1, num2);

        //Then
        assertEquals(result,6);
    }
}