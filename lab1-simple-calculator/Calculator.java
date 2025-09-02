import java.math.BigDecimal;
import java.util.Scanner;


public class Calculator {

    private BigDecimal total = BigDecimal.ZERO;
    private String operator = "";


    private void add(BigDecimal x) {
        total = total.add(x);
    }

    private void subtract(BigDecimal x) {
        total = total.subtract(x);
    }

    private void multiply(BigDecimal x) {
        total = total.multiply(x);
    }

    private void divide(BigDecimal x) {
        if (x.equals(BigDecimal.ZERO)) {
            System.out.println("Divided by zero");
        }
        total = total.divide(x);
    }

    public void handleNumber(BigDecimal number) {
        if (operator.isEmpty()) {
            total = number;
            return;
        }
        switch (operator) {
            case "+":
                add(number);
                break;
            case "-":
                subtract(number);
                break;
            case "*":
                multiply(number);
                break;
            case "/":
                divide(number);
                break;
        }
        operator = "";
    }

    public void handleOperator(String operator) {
        switch (operator) {
            case "+":
            case "-":
            case "*":
            case "/":
                this.operator = operator;
                break;
            case "=":
                operator = "";
                System.out.println(total);
                break;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                return;
            }
            try {
                BigDecimal number = new BigDecimal(input);
                calculator.handleNumber(number);
            } catch (NumberFormatException e) {
                calculator.handleOperator(input);
            }

        }

    }


}