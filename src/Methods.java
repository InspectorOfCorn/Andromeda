import java.util.Scanner;

public class Methods {

//    Main methods have a required signature in console applications. the name has to main all lower case.
//    I't has to return void ("nothing"). Make sure to call datatype and args. Ex (String[] args) String is data type
//    Name of parameter doesn't matter.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        double d1 = getInput(sc , "Enter a numeric value 1: ");

        double d2 = getInput(sc , "Enter a numeric value 2: ");

        double result = d1 / d2;

        System.out.print("The answer is " + result);
    }
// Custom methods allow one to reuse code \\ !!!!!!!
    public static double getInput(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }
}
