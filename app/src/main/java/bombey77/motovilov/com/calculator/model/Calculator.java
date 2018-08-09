package bombey77.motovilov.com.calculator.model;

import java.math.BigDecimal;


public class Calculator {

    private BigDecimalValue bigDecimalValue;

    public Calculator(BigDecimalValue bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public BigDecimal calculate() {
        BigDecimalMathematicalOperations mathematicalOperations = new BigDecimalMathematicalOperations();
        BigDecimal res = null;
        BigDecimalValue.OperationType operationType = (BigDecimalValue.OperationType) bigDecimalValue.
                getKeeperValuesByOperationType();
        switch (operationType) {
            case ADD:
                res = (BigDecimal) mathematicalOperations.add(bigDecimalValue.getFirstValue(),
                        bigDecimalValue.getSecondValue());
                break;
            case SUBTRACT:
                res = (BigDecimal) mathematicalOperations.subtract(bigDecimalValue.getFirstValue(),
                        bigDecimalValue.getSecondValue());
                break;
        }
        return res;
    }
}
