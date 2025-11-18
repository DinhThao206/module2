package BTcleanCode1;

public class Calculator {

    private static final char ADDITION = '+';
    static final char SUBTRACTION = '-';
    static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';


    public static int calculate(int firstOperand, int secondOperand, char operator) {
        // Sử dụng các hằng số đã tách để tăng cường khả năng đọc và bảo trì
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

}