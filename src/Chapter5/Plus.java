package Chapter5;

public class Plus extends AbstractCalculation<Double> {
    @Override
    public Double getResult() {
        return super.number1.doubleValue() + super.number2.doubleValue();
    }

    @Override
    protected char getOperator() {
        return '+';
    }
}
