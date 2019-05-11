package example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SimpleFileWriteExample {
    public static void main(String[] args) {
        String relativePath = "out.txt";
        File file = new File(relativePath);
        String message1 = "message1";
        String message2 = "message2";
        String message3 = "message3";

        try{
            FileWriter  fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message1);
            bufferedWriter.write(message2);
            bufferedWriter.close();// trebuie pus .close() ca sa scrie in fisier, altfel le tine intr-un buffer

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
