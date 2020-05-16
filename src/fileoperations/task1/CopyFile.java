package fileoperations.task1;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        String fileContent = readFile("testData/test.txt");
        saveTextToFile(fileContent, "testData/copy.txt");

        copyFile("testData/test.txt", "testData/copy2.txt");

    }

    public static String readFile(String pathToFile) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(pathToFile));
        String output = "";
        String line = reader.readLine();
        while (line != null) {
            output = output + line + '\n';
            line = reader.readLine();
        }
        reader.close();
        return output;
    }

    public static void saveTextToFile(String text, String pathToFile) throws IOException {
        FileWriter writer = new FileWriter(pathToFile);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(text);
        bw.close();
    }

    public static void copyFile(String inputFilePath, String destinationFilePath) throws IOException {
        String fileContent = readFile(inputFilePath);
        saveTextToFile(fileContent, destinationFilePath);
    }
}
