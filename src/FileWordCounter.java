import java.io.*;

public class FileWordCounter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:/A.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:/B.txt"));
            String line;
            int lineCount = 0;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                if (words.length % 2 == 0) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    writer.write("null");
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            double avgWordsPerLine = (double) wordCount / lineCount;
            writer = new BufferedWriter(new FileWriter("D:/B.txt"));
            writer.write("Average number of words per even line: " + avgWordsPerLine);
            writer.newLine();
            writer.close();
            System.out.println("File processing complete.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
