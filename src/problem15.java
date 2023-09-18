import java.io.*;
import java.util.Scanner;

public class problem15{
    public static void main(String[] args) {
        try {
            File inputFile = new File("A.txt");
            Scanner scanner = new Scanner(inputFile);

            File outputFile = new File("B.txt");
            FileWriter fileWriter = new FileWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int numWords = line.trim().split("\\s+").length;
                int numChars = line.replaceAll("\\s+","").length();
                int diff = Math.abs(numWords - numChars);

                if (diff % 2 == 1) {
                    fileWriter.write(Integer.toString(diff) + "\n");
                }
            }

            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}