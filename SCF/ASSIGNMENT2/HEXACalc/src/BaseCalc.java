
public interface BaseCalc {
    String add(String firstNumber,String secondNumber);
    String subtract(String firstNumber,String secondNumber);
    String multiply(String firstNumber,String secondNumber);
    String divide(String firstNumber,String secondNumber);
    int toDecimal(String baseNumber);
    String toBase(int decimalNumber);
}
