package bombey77.motovilov.com.calculator.model;

//public class Calculator {
//
//    private Values values;
//
//    public Calculator(Values values) {
//        this.values = values;
//    }
//
//    /**
//     * Depends on operation method count result between first and second values.
//     * @return result between operation.
//     */
//    public BigDecimal calculate() {
//        BigDecimalMathematicalOperations mathematicalOperations = new BigDecimalMathematicalOperations();
//        BigDecimal res = null;
//        Values.OperationType operationType = (Values.OperationType) values.
//                getOperationType();
//        switch (operationType) {
//            case ADD:
//                res = (BigDecimal) mathematicalOperations.add(values.getFirstValue(),
//                        values.getSecondValue());
//                break;
//            case SUBTRACT:
//                res = (BigDecimal) mathematicalOperations.subtract(values.getFirstValue(),
//                        values.getSecondValue());
//                break;
//            case MULTIPLY:
//                res = (BigDecimal) mathematicalOperations.multiply(values.getFirstValue(),
//                        values.getSecondValue());
//                break;
//            case DIVIDE:
//                res = (BigDecimal) mathematicalOperations.divide(values.getFirstValue(),
//                        values.getSecondValue());
//                break;
//        }
//        return res;
//    }
//}
