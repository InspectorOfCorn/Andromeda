// Looping through collections of data

public class Loops {
    public static void main(String[] args) {
//        Array of Strings
        String[] months = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };
//        \\ // Iterative Loop \\ //
//        to loop through a list take Array length but remember no () because it's an array
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);}

//      \\ // Enhanced For Loop \\ //
//        for (var month : months) {
//            System.out.println(month);
//        }
//
//      \\ // While Loop \\ //
//        var whileCounter = 0;
//        while (whileCounter < months.length) {
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//            }
//
//      \\ // Do Loop // \\
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
            } while (doCounter < months.length);
        }
    }
