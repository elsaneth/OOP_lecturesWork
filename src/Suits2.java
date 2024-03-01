public class Suits2 {
    public static void main(String[] args) {
        System.out.println("FIRST EXRECISE");
        int[] numbers = {2, 4, 1, 5, 3};
        int result1 = firstExercise(numbers);
        System.out.println(result1);

        int i = 1, j = 2;
        System.out.println((i+j));

        System.out.println();
        System.out.println("SECOND EXERCISE");
        String s1 = "kapsas";
        String s2 = "sibul";
        String result2 = secondExercise(s1, s2);
        System.out.println(result2);

        System.out.println();
        System.out.println("THIRD EXERCISE");
        int[] integers = {2, 3, 4, 1, 2, 7};
        Boolean result3 = thirdExercise(integers);
        System.out.println(result3);
    }

    public static int firstExercise(int[] numbers) {
        int arraySize = numbers.length;
        int result = 0;
        if (arraySize != 0 && arraySize != 1) {
            int secondNr = numbers[1];
            int lastNr = numbers[numbers.length-1];
            result = secondNr * lastNr;

            System.out.println("Second nr: " + secondNr);
            System.out.println("Last nr: " + lastNr);
            System.out.println("Result " + secondNr + " * " + lastNr + ":");
        } else if (arraySize == 1) {
            result = numbers[0];
            System.out.println("Array size is one. Result: ");
        } else {
            System.out.println("Array size is zero. Result: ");
        }
        return result;
    }

    public static String secondExercise(String s1, String s2) {
        String result = "";
        // lisasin lisaks ülesandes mainitule ka tingimuse, et s1 ei või olla tühi
        if (!s2.isEmpty() && !s1.isEmpty()) {
            char firstOfSecond = s2.charAt(0);
            char lastOfFirst = s1.charAt(s1.length() -1);
            System.out.println("First string: '" + s1 + "'" + " Last char of firstr: " + lastOfFirst);
            System.out.println("Second string: '" + s2 + "'" + " First char of second: " + firstOfSecond);
            if (firstOfSecond == lastOfFirst) {
                s1 = s1.substring(0, s1.length() -1);
                s2 = s2.substring(1);
                System.out.println("Last char of first string equals to first char of second string. Result: ");
                result = s1 + s2;
            } else {
                s2 = s2.substring(1);
                System.out.println("Last char of first string is NOT equal to first char of second string. Result: ");
                result = s1 + s2;
            }
        } else {
            if (s2.isEmpty()) {
                System.out.println("Second string is empty. Result: ");
                result = s1;
            } else {
                System.out.println("First string is empty. Result: ");
                result = s2;
            }
        }
        return result;
    }

    public static boolean thirdExercise(int[] numbers) {
        boolean result = false;
        for (int i = 0; i < numbers.length - 2; i ++) {
            if (numbers[i+1] == numbers[i] + 1 && numbers[i + 2] == numbers[i] + 2){
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("There are not 3 consecutive numbers. Result: ");
        } else {
            System.out.println("There are 3 consecutive numbers. Result: ");
        }
        return result;
    }
}
