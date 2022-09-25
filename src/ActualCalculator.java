import java.util.Scanner;

public class ActualCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var i1 = getInput(s, "Enter the first value: ");
        var i2 = getInput(s, "Enter the second value: ");
        var operator = getOperand(s, "What would you like to do? \n" +
                "+ - / *");
        //OMG I LOVE SWITCH CASES
        switch (operator) {
            case "+":
                System.out.println("Your result is: " + Addition(i1,i2));
                break;
            case "-":
                System.out.println("Your result is: " + Subtraction(i1,i2));
                break;
            case "*":
                System.out.println("Your result is: " + Multiplication(i1,i2));
                break;
            case "/":
                System.out.println("Your result is: " + Division(i1,i2));
                break;
        }
    }
    public static double getInput(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }
    public static String getOperand(Scanner s, String prompt) {
        System.out.println(prompt);
        return s.next();
    }
    private static double Addition(double i1, double i2) {
        return i1 + i2;
    }
    private static double Subtraction(double i1, double i2) {
        return i1 - i2;
    }
    private static double Multiplication(double i1, double i2) {
        return i1 * i2;
    }
    private static double Division(double i1, double i2) {
        return i1 / i2;
    }
}
