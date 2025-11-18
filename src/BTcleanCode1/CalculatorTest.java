package BTcleanCode1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static BTcleanCode1.Calculator.MULTIPLICATION;
import static BTcleanCode1.Calculator.SUBTRACTION;
import static org.junit.Assert.assertEquals;
import static org.w3c.dom.events.MutationEvent.ADDITION;

public class CalculatorTest {
    private static final char DIVISION = '/';

    @Test
    @DisplayName("Test phép cộng: 1 + 1 = 2")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        int expected = 2;

        // Sử dụng hằng số đã định nghĩa trong lớp Calculator
        int result = Calculator.calculate(firstOperand, secondOperand, (char) ADDITION);

        assertEquals(expected, result);
    }

    // 2. Test cho phép trừ
    @Test
    @DisplayName("Test phép trừ: 2 - 1 = 1")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, SUBTRACTION);

        assertEquals(expected, result);
    }

    // 3. Test cho phép nhân
    @Test
    @DisplayName("Test phép nhân: 2 * 2 = 4")
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, MULTIPLICATION);

        assertEquals(expected, result);
    }

    // 4. Test cho phép chia
    @Test
    @DisplayName("Test phép chia: 6 / 3 = 2")
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, DIVISION);

        assertEquals(expected, result);
    }
}
