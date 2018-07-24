package bombey77.motovilov.com.calculator.controller;

import java.math.BigDecimal;

import bombey77.motovilov.com.calculator.model.BigDecimalValue;
import bombey77.motovilov.com.calculator.model.Calculator;

/**
Get all values from view and send them back after calculation
 */
public class Controller {

    private BigDecimal result;
    private BigDecimalValue bigDecimalValue;

    public Controller(BigDecimalValue bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public void operation(BigDecimal x, BigDecimalValue.OperationType operationType) {
        /*if operationType button wasn't pressed and first value is null then write this value
        into first value and into temporary variable*/
        if (bigDecimalValue.getKeeperValuesByOperationType() == null) {
            if (bigDecimalValue.getFirstValue() == null) {
                bigDecimalValue.setFirstValue(x);
                setResult((BigDecimal) bigDecimalValue.getFirstValue());
            }
            bigDecimalValue.setKeeperOperationType(operationType);
        } else {
            /*if operationType button was pressed and first value not null then write this value
            into second value and into temporary variable. Calculate first value and second value.*/
            if (bigDecimalValue.getSecondValue() == null) {
                bigDecimalValue.setSecondValue(x);
                Calculator calculator = new Calculator(bigDecimalValue);
                setResult(calculator.calculate());
                bigDecimalValue.setFirstValue(getResult());
            }
            bigDecimalValue.setSecondValue(null);
//            bigDecimalValue.setKeeperOperationType(null);
        }
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getResult() {
        return result;
    }

}
