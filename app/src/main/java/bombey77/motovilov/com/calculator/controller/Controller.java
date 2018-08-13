package bombey77.motovilov.com.calculator.controller;

/**
Get all values from view and send them back after calculation
 */
//public class Controller {
//
//    private Values values;
//    private Values.OperationType temporaryOperationType;
//    private StringBuffer stringBufferResult = new StringBuffer();
//    private boolean functionButton = false;
//    private MainActivity mainActivity;
//
//    public Controller(Values values) {
//        this.values = values;
//    }
//
//    public void operation(BigDecimal x, Values.OperationType operationType) {
//        /*if operationType button wasn't pressed and first values is null then write this values
//        into first values and into temporary variable*/
//        if (values.getOperationType() == null) {
//            if (values.getFirstValue() == null) {
//                values.setFirstValue(x);
//            }
//            temporaryOperationType = operationType;
//            values.setOperationType(temporaryOperationType);
//            addDigit(String.valueOf(x));
//        } else {
//            /*if operationType button was pressed and first values not null then write this values
//            into second values and into temporary variable. Calculate first values and second values.*/
//            if (values.getSecondValue() == null) {
//                values.setSecondValue(x);
//                Calculator calculator = new Calculator(values);
//                clearStringBuffer();
//                addDigit(String.valueOf(calculator.calculate()));
//                values.setFirstValue(calculator.calculate());
//                values.setOperationType(operationType);
//
//            }
//            values.setSecondValue(null);
//        }
//    }
//
//    public void onButtonClickListener(MainActivity mainActivity, int button, StringBuffer value) {
//        this.mainActivity = mainActivity;
//        BigDecimal valueFromEditText = new BigDecimal(String.valueOf(value));
//        switch (button) {
//            case R.id.btnPercent:
//                break;
//            case R.id.btnRoot:
//                break;
//            case R.id.btnXSquare:
//                break;
//            case R.id.btnHafXSquare:
//                break;
//            case R.id.btnCE:
//                break;
//            case R.id.btnC:
//            //delete last sign/character from EditText
//            case R.id.btnClean:
//                break;
//
//            case R.id.btnPlusMinus:
//                break;
//            case R.id.btnComma:
//                break;
//            case R.id.btnEquals:
//                break;
//
//            case R.id.btnDivide:
//                break;
//
//            case R.id.btnMultyply:
//                break;
//
//            case R.id.btnSubtract:
//                break;
//
//            case R.id.btnPlus:
////                if (functionButton == true) return;
//                operation(valueFromEditText, Values.OperationType.ADD);
//                functionButton = true;
//                System.out.println("--- PLUS ---");
//                break;
//        }
//    }
//
//    /**
//     Add a new digit after any numeric button was pressed
//     */
//    public StringBuffer addDigit(String number) {
//        stringBufferResult.append(number);
//        return stringBufferResult;
//    }
//
//    /**
//     Clear StringBuffer
//     */
//    public void clearStringBuffer() {stringBufferResult.delete(0, stringBufferResult.length());}
//
//    public StringBuffer getStringBufferResult() {
//        return stringBufferResult;
//    }
//}

