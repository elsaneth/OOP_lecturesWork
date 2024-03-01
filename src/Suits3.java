import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Suits3 {
    public static void main(String[] args) {
//         polnud vaja teha
        System.out.println("1. ÜLESANNE, MIDA POLNUD VAJA TEHA: ");
        startFirstVariantFirstExercise();
//         1. ülesanne
        System.out.println("2. ÜLESANNE: ");
        startFirst();
//         2. ülesanne
        System.out.println("3. ÜLESANNE: ");
        secondExercise();
//         3. ülesanne
        System.out.println("4. ÜLESANNE: ");
        thirdExercise();
    }

    // polnud vaja teha
    public static void startFirstVariantFirstExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput;
        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
            System.out.println(firstVariantFirstExercise(userInput));
        } else {
            System.out.println("Your input is not integer.");
        }
    }

    public static String firstVariantFirstExercise(int number) {
        String result = "Suurem kui 100";
        if (number < 100) {
            result = "Väiksem kui 100";
        } else if (number == 100) {
            result = "Täpselt 100!";
        }
        return result;
    }

    // 1. ülesanne
    public static void startFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String input2 = scanner.nextLine();
        System.out.println(firstExercise(input1, input2));
    }

    public static String firstExercise(String word1, String word2) {
        String result = "Two strings are not equal";
        if (Objects.equals(word1, word2)) {
            result = "Two strings are equal";
            return result;
        } else {
            return result;
        }
    }

    // 2. ülesanne
    public static void secondExercise() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number: ");
            String input1 = scanner.next();
            try {
                int number1 = Integer.parseInt(input1);
                while (true) {
                    System.out.println("Enter second number: ");
                    String input2 = scanner.next();
                    try {
                        int number2 = Integer.parseInt(input2);
                        int sum = number1 + number2;
                        if (sum % 2 == 0) {
                            System.out.println("Sum " + sum + " is even");
                        } else {
                            System.out.println("Sum " + sum + " is odd");
                        }
                        break;
                    } catch (NumberFormatException ne) {
                        System.out.println("2. input is not an integer. Please enter a valid integer.");
                    }
                }
                break;
            } catch (NumberFormatException ne) {
                System.out.println("1. input is not an integer. Please enter a valid integer.");
            }
        }
    }

    // 3. ülesanne
    public static void thirdExercise() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter array length: ");
            String input = scanner.next();
            try {
                int length = Integer.parseInt(input);
                if (length >= 1 && length <= 5) {
                    int[] numbers = new int[length];
                    String resultArray = null;
                    int sum = 0;
                    for (int i = 0; i < length; i++) {
                        System.out.println("Enter " + (i + 1) + ". integer to add into array: ");
                        String input2 = scanner.next();
                        try {
                            int number = Integer.parseInt(input2);
                            numbers[i] = number;
                            sum = 0;
                            for (int nr : numbers) {
                                sum += nr;
                            }
                            if (i != (length - 1)) {
                                System.out.println("Array at the moment: " + Arrays.toString(numbers));
                            }
                            resultArray = Arrays.toString(numbers);
                        } catch (NumberFormatException ne) {
                            System.out.println("Input is not integer. Please enter a valid integer.");
                        }
                    }
                    System.out.println("Final array: " + resultArray);
                    System.out.println("Sum of array elements: " + sum);
                    break;
                } else {
                    System.out.println("Input is out of range (1-5). Please enter a valid integer. ");
                }
            } catch (NumberFormatException ne) {
                System.out.println("Input is not integer. Please enter a valid integer.");
            }
        }
    }
}