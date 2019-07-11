import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // initialize scanner for reading from console
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // initialize empty inputStrings map where the Integer will represent each time the string has been added
        Map<String, Integer> inputStrings = new HashMap<>();

        // I chose a while loop instead of a do while because the user may wish to exit the program before
        // he enters an input value
        while (!input.equalsIgnoreCase("quit")) {

            // check if the key already exists
            if (inputStrings.containsKey(input)) {
                // get its count
                int temp = inputStrings.get(input).intValue();
                // increment
                temp++;

                // display a message to the user about the count
                System.out.println("You have added this string: " + temp + " times");
                // update the value for the key
                inputStrings.put(input, temp);
            } else {
                // insert the key with an initial value of 1
                inputStrings.put(input, 1);
            }

            // read the next input from the user
            input = scanner.nextLine();
        }
    }
}
