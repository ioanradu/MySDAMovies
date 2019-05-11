package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SimpleFileReadExample {
    public static void main(String[] args) {

        String absolutePath = "D:\\SDA_Projects\\MySDAMoves\\movies.txt";
        String relativePath = "movies.txt";

        File file = new File(relativePath);

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = bufferReader.readLine();
            while (line != null) {
                System.out.println(line);
                ;
                line = bufferReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}