package bombey77.motovilov.com.calculator.model;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BigDecimalMathematicalOperationsTest {

    static BigDecimalMathematicalOperations mo;

    @BeforeClass
    public static void initialization() {
        mo = new BigDecimalMathematicalOperations();
    }

    @Test
    public void add() {
        BigDecimal actual = (BigDecimal) mo.add(
                new BigDecimal(10), new BigDecimal(15));
        BigDecimal expected = new BigDecimal(25);
        assertEquals(expected, actual);
    }

    @Test
    public void subtract() {
        BigDecimal actual = (BigDecimal)mo.subtract(new BigDecimal(6), new BigDecimal(3));
        BigDecimal expected = new BigDecimal(3);
        assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        BigDecimal actual = (BigDecimal)mo.multiply(new BigDecimal(6), new BigDecimal(2));
        BigDecimal expected = new BigDecimal(12);
        assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        BigDecimal actual = (BigDecimal)mo.divide(new BigDecimal(9), new BigDecimal(3));
        BigDecimal expected = new BigDecimal(3);
        assertEquals(expected, actual);
    }

    @Test
    public void notNull() {
        BigDecimal actual = (BigDecimal)mo.add(new BigDecimal(32), new BigDecimal(33));
        assertNotNull(actual);
    }
}