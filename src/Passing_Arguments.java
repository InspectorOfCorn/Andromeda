// Passing Arguments to methods
//  Passing to a method by copy
//      The method receives a copy of the argument
//  Passing to a method by reference
//      The method receives a reference to the original object

// Passing a method to a copy of argument
public class Passing_Arguments {
    public static void main(String[] args) {
        int original[] = {10,20,30};
        System.out.println("Original before: " + original[0]);
        incrementValue(original);
        System.out.println("Original after: " + original[0]);
    }
    public static void incrementValue(int[] inMethod) {
        inMethod[0]++;
        System.out.println("In method: " + inMethod[0]);
    }

}

