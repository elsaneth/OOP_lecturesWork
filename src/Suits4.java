import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Suits4 {
    public static void main(String[] args) {
        System.out.println("FIRST EXERCISE: ");
        first();

        System.out.println();
        System.out.println("SECOND EXERCISE: ");
        second();

    }

    public static void first() {
        try {
            BufferedReader file1 = new BufferedReader(new FileReader("src/in1.txt"));
            BufferedReader file2 = new BufferedReader(new FileReader("src/in2.txt"));

            String line1 = file1.readLine();
            List<String> lines1 = new ArrayList<>();

            String line2 = file2.readLine();
            List<String> lines2 = new ArrayList<>();

            int lines1Length = 0;
            while (line1 != null) {
                lines1.add(line1);
                line1 = file1.readLine();
                lines1Length = lines1.size();
            }
            if (lines1Length >= 4) {
                System.out.println("4th row in 1st file is: " + lines1.get(3));
            } else {
                System.out.println("In file 1 there are not enough rows (4)!");
            }

            while (line2 != null) {
                lines2.add(line2);
                line2 = file2.readLine();
                lines1Length = lines2.size();
            }
            if (lines1Length >= 4) {
                System.out.println("4th row in 2n file is: " + lines2.get(3));
            } else {
                System.out.println("In file 2 there are not enough rows (4)!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void second() {
        Path path = Paths.get("src/in3.txt");

        try {
            Scanner scanner = new Scanner(path);
            List<Integer> numbers = new ArrayList<>();

            // add numbers from in3.txt into list
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int nr = scanner.nextInt();
                    numbers.add(nr);
                } else {
                    scanner.next();
                }
            }
            // add list numbers into out.txt
            File file = new File("src/out.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(new FileWriter(file));

            for (int num : numbers) {
                pw.println(num);
            }
            pw.close();

            // print all lines from out.txt
            Path pathOut = Paths.get("src/out.txt");
            List<String> lines = Files.readAllLines(pathOut);
            System.out.println("Out file: " + lines);

        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
