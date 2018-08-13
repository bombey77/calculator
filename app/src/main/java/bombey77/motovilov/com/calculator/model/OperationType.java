package bombey77.motovilov.com.calculator.model;

public class OperationType implements Operation {

    private Type[] type = new Type[1];

    @Override
    public void setOperation(Object object) {
        type[0] = (Type)object;
    }

    @Override
    public Object getOperation() {
        return type[0];
    }

    enum Type {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
}
