package bombey77.motovilov.com.calculator.model;

import java.math.BigDecimal;
import java.util.EnumMap;

public class BigDecimalValue implements Value {

    EnumMap<Keeper, BigDecimal> keeperValues = new EnumMap<>(Keeper.class);

    private enum Keeper {
        FIRST_VALUE, SECOND_VALUE, OPERATION
    }

    @Override
    public void setFirstValue(Object firstValue) {
        keeperValues.put(Keeper.FIRST_VALUE, (BigDecimal) firstValue);
    }

    @Override
    public void setSecondValue(Object secondValue) {
        keeperValues.put(Keeper.SECOND_VALUE, (BigDecimal) secondValue);
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
