import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> inputStrings = new HashMap<>();

        while (!input.equalsIgnoreCase("quit")) {

            if (inputStrings.containsKey(input)) {
                int temp = inputStrings.get(input).intValue();
                temp++;

                System.out.println("You have added this string: " + temp + " times");
                inputStrings.put(input, temp);
            } else {
                inputStrings.put(input, 0);
            }

            input = scanner.nextLine();
        }
    }
}
