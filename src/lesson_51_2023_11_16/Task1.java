package lesson_51_2023_11_16;

import java.io.*;

/**
 * Created by Volodymyr Sh on 16.11.2023
 * project name: AIT_Lessons
 */
public class Task1 {
    public static void main(String[] args) {
        File directory = new File("src/lesson_51_2023_11_16/practise");
        directory.mkdirs();

        for (int i = 1; i < 11; i++) {
            File file = new File(directory, "test_" + i + ".txt");

            try (FileWriter fileWriter = new FileWriter(file)) {
                file.createNewFile();
                fileWriter.write("Java" + i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        File[] files = directory.listFiles();

        for (File file : files) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line = bufferedReader.readLine();
                if (line != null && line.contains("Java7")) {
                    System.out.println("File name: " + file.getName());
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
