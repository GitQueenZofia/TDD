
import org.example.StringCalculator;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertThrows;

public class StringCalculatorTests {
    StringCalculator calculator;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    @DisplayName("Empty string should return 0.")
    public void emptyString() throws Exception {
        int value = calculator.Calculate("");
        Assertions.assertEquals(0, value);
    }

    @Test
    @DisplayName("Single number returns the value.")
    public void singleNumber() throws Exception {
        int value = calculator.Calculate("1");
        Assertions.assertEquals(1, value);
    }

    @Test
    @DisplayName("Two numbers, comma delimited, returns the sum.")
    public void twoNumbersComma() throws Exception {
        int value = calculator.Calculate("5,10");
        Assertions.assertEquals(15, value);
    }



}