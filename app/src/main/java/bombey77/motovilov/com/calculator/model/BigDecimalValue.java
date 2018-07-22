package bombey77.motovilov.com.calculator.model;

import java.util.EnumMap;

public class BigDecimalValue implements Value {

    EnumMap<Keeper, Object> keeperValues = new EnumMap<>(Keeper.class);


    private enum Keeper {
        FIRST_VALUE, SECOND_VALUE, OPERATION;
    }

    public enum OperationType {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public void setKeeperOperationType(OperationType operationType) {
        this.keeperValues.put(Keeper.OPERATION, operationType);
    }

    public Object getKeeperValuesByOperationType() {
        return keeperValues.get(Keeper.OPERATION);
    }

    @Override
    public void setFirstValue(Object firstValue) {
        keeperValues.put(Keeper.FIRST_VALUE, firstValue);
    }

    @Override
    public void setSecondValue(Object secondValue) {
        keeperValues.put(Keeper.SECOND_VALUE, secondValue);
    }

    @Override
    public Object getFirstValue() {
        return keeperValues.get(Keeper.FIRST_VALUE);
    }

    @Override
    public Object getSecondValue() {
        return keeperValues.get(Keeper.SECOND_VALUE);
    }

}
