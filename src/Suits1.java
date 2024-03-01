import java.util.Arrays;
public class Suits1 {
    public static void main(String[] args) {
        System.out.println("First exercise: ");
        int[] numbers = {37, 43, 12};
        firstExercise(numbers);

        System.out.println();
        System.out.println("Second exercise: ");
        int[] wholeNumbers = {33, 37};
        secondExercise(wholeNumbers);


        System.out.println();
        System.out.println("Third exercise: ");
        int x = 59;
        int y = 12;
        int z = 49;
        thirdExercise(x, y, z);
    }

    public static void firstExercise(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest number: " + numbers[0]);
        System.out.println("Second smallest number: " + numbers[1]);
    }

    public static void secondExercise(int[] wholeNumbers) {
        boolean isDivisibleBy3 = false;
        for (int i : wholeNumbers) {
            if (i % 3 == 0) {
                isDivisibleBy3 = true;
                break;
            }
        }
        System.out.println(isDivisibleBy3);
    }

    public static void thirdExercise(int x, int y, int z) {
        int iterations = 0;

        while (y < 50000 && iterations < 5) {
            x = x * 2 + y;
            y = x + y + z;
            iterations++;
//            System.out.println(iterations + ". iteration");
//            System.out.println("x: " + x);
//            System.out.println("y: " + y);
        }
        if (y > 50000 && iterations < 5) {
            System.out.println("Stopped because of y exceeding 50000, y = " + y + ", iterations: " + iterations);
        } else if (y > 50000 && iterations == 5) {
            System.out.println("Stopped because y is exceeding 50000 and 5 iterations are done, y = " + y + ", iterations: " + iterations);
        } else {
            System.out.println("Stopped because of 5 iterations, y = " + y);
        }
    }
}