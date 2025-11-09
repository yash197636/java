
import java.io.*;

 class FileCopy {
    public static void main(String[] args) {
        String inputFile = "input.txt";   // Source file
        String outputFile = "output.txt"; // Destination file

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Preserve line breaks
            }
            System.out.println("Data copied successfully from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}