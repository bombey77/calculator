package bombey77.motovilov.com.calculator.model;

import java.math.BigDecimal;

public class BigDecimalMathematicalOperations implements MathematicalOperations {

    @Override
    public Object add(Object x, Object y) {
        if (x == null || y == null) throw new IllegalArgumentException();
        BigDecimal res = ((BigDecimal)x).add((BigDecimal)y);
        return res;
    }

    @Override
    public Object subtract(Object x, Object y) {
        if (x == null || y == null) throw new IllegalArgumentException();
        BigDecimal res = ((BigDecimal)x).subtract((BigDecimal)y);
        return res;
    }

    @Override
    public Object multiply(Object x, Object y) {
        if (x == null || y == null) throw new IllegalArgumentException();
        BigDecimal res = ((BigDecimal)x).multiply((BigDecimal)y);
        return res;
    }

    @Override
    public Object divide(Object x, Object y) {
        if (x == null || y == null) throw new IllegalArgumentException();
        BigDecimal res = ((BigDecimal)x).divide((BigDecimal)y);
        return res;
    }


}
