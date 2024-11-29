package Chapter5;

public abstract class AbstractCalculation<T> implements Calculation<T> {
    protected Number number1;
    protected Number number2;

    @Override
    public void setNumber1(Number val) {
        this.number1 = val;
    }

    @Override
    public void setNumber2(Number val) {
        this.number2 = val;
    }

    @Override
    public void setNumber1(Calculation<T> val) {
        this.number1 = (Number) val.getResult();
    }

    @Override
    public void setNumber2(Calculation<T> val) {
        this.number2 = (Number) val.getResult();
    }

    protected abstract char getOperator();

    @Override
    public String toString() {
        return "" + this.number1 + this.getOperator() + this.number2;
    }
}
