package bombey77.motovilov.com.calculator.model;

import java.util.EnumMap;

public class KeeperOfValues implements Values {

    private EnumMap<Numbers, Object> keeper =
            new EnumMap<Numbers, Object>(Numbers.class);


    @Override
    public void setFirstValue(Object object) {
        keeper.put(Numbers.FIRST_VALUE, object);
    }

    @Override
    public void setSecondValue(Object object) {
        keeper.put(Numbers.SECOND_VALUE, object);
    }


    @Override
    public Object getFirstValue() {
        return keeper.get(Numbers.FIRST_VALUE);
    }

    @Override
    public Object getSecondValue() {
        return keeper.get(Numbers.SECOND_VALUE);
    }

    enum Numbers {
        FIRST_VALUE, SECOND_VALUE;
    }
}
