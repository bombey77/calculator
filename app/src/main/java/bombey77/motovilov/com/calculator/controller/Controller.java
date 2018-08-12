package bombey77.motovilov.com.calculator.controller;

import java.math.BigDecimal;

import bombey77.motovilov.com.calculator.R;
import bombey77.motovilov.com.calculator.model.BigDecimalValue;
import bombey77.motovilov.com.calculator.model.Calculator;
import bombey77.motovilov.com.calculator.view.MainActivity;

/**
Get all values from view and send them back after calculation
 */
public class Controller {

    private BigDecimalValue bigDecimalValue;
    private BigDecimalValue.OperationType temporaryOperationType;
    private StringBuffer stringBufferResult = new StringBuffer();
    private boolean functionButton = false;
    private MainActivity mainActivity;

    public Controller(BigDecimalValue bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public void operation(BigDecimal x, BigDecimalValue.OperationType operationType) {
        /*if operationType button wasn't pressed and first value is null then write this value
        into first value and into temporary variable*/
        if (bigDecimalValue.getOperationType() == null) {
            if (bigDecimalValue.getFirstValue() == null) {
                bigDecimalValue.setFirstValue(x);
            }
            temporaryOperationType = operationType;
            bigDecimalValue.setOperationType(temporaryOperationType);
            addDigit(String.valueOf(x));
        } else {
            /*if operationType button was pressed and first value not null then write this value
            into second value and into temporary variable. Calculate first value and second value.*/
            if (bigDecimalValue.getSecondValue() == null) {
                bigDecimalValue.setSecondValue(x);
                Calculator calculator = new Calculator(bigDecimalValue);
                clearStringBuffer();
                addDigit(String.valueOf(calculator.calculate()));
                bigDecimalValue.setFirstValue(calculator.calculate());
                bigDecimalValue.setOperationType(operationType);

            }
            bigDecimalValue.setSecondValue(null);
        }
    }

    public void onButtonClickListener(MainActivity mainActivity, int button, StringBuffer value) {
        this.mainActivity = mainActivity;
        BigDecimal valueFromEditText = new BigDecimal(String.valueOf(value));
        switch (button) {
            case R.id.btnPercent:
                break;
            case R.id.btnRoot:
                break;
            case R.id.btnXSquare:
                break;
            case R.id.btnHafXSquare:
                break;
            case R.id.btnCE:
                break;
            case R.id.btnC:
            //delete last sign/character from EditText
            case R.id.btnClean:
                break;

            case R.id.btnPlusMinus:
                break;
            case R.id.btnComma:
                break;
            case R.id.btnEquals:
                break;

            case R.id.btnDivide:
                break;

            case R.id.btnMultyply:
                break;

            case R.id.btnSubtract:
                break;

            case R.id.btnPlus:
//                if (functionButton == true) return;
                operation(valueFromEditText, BigDecimalValue.OperationType.ADD);
                functionButton = true;
                System.out.println("--- PLUS ---");
                break;
        }
    }

    /**
     Add a new digit after any numeric button was pressed
     */
    public StringBuffer addDigit(String number) {
        stringBufferResult.append(number);
        return stringBufferResult;
    }

    /**
     Clear StringBuffer
     */
    public void clearStringBuffer() {stringBufferResult.delete(0, stringBufferResult.length());}

    public StringBuffer getStringBufferResult() {
        return stringBufferResult;
    }
}

