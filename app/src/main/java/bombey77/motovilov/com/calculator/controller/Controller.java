package bombey77.motovilov.com.calculator.controller;

import java.math.BigDecimal;

import bombey77.motovilov.com.calculator.model.BigDecimalValue;
import bombey77.motovilov.com.calculator.model.Calculator;

public class Controller {

    private BigDecimal result;
    private BigDecimalValue bigDecimalValue;

    public Controller(BigDecimalValue bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public void operation(BigDecimal x, BigDecimalValue.OperationType operationType) {
        if (bigDecimalValue.getKeeperValuesByOperationType() == null) {
            if (bigDecimalValue.getFirstValue() == null) {
                bigDecimalValue.setFirstValue(x);
                setResult((BigDecimal) bigDecimalValue.getFirstValue());
            }
            bigDecimalValue.setKeeperOperationType(operationType);
        } else {
            if (bigDecimalValue.getSecondValue() == null) {
                bigDecimalValue.setSecondValue(x);
                Calculator calculator = new Calculator(bigDecimalValue);
                setResult(calculator.calculate());
            }
            bigDecimalValue.setFirstValue(null);
            bigDecimalValue.setSecondValue(null);
            bigDecimalValue.setKeeperOperationType(null);
        }
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getResult() {
        return result;
    }

}
