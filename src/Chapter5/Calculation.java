package Chapter5;


public interface Calculation<T> {

    void setNumber1(Number val);
    void setNumber2(Number val);
    void setNumber1(Calculation<T> val);
    void setNumber2(Calculation<T> val);

    T getResult();
}
