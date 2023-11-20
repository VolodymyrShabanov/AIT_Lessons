package lesson_51_2023_11_16.cat;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Volodymyr Sh on 16.11.2023
 * project name: AIT_Lessons
 */
public class CatsWriterReader {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Cat", 9, true),
        new Cat("John", 2, false),
        new Cat("Maria", 7, false),
        new Cat("Boris", 4, true),
        new Cat("Hanna", 6, true)
        ));

        File path = new File("src/lesson_51_2023_11_16/cat");
        path.mkdir();
        File file = new File(path, "cats.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        writeCatsToFile(cats, file);

        List<Cat> newCat = readFromFile(file);
    }

    private static List<Cat> readFromFile(File file) {
        List<Cat> cats = new ArrayList<>();

        try(FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                Cat cat = parseCatFromString(line);
                cats.add(cat);
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cats;
    }

    private static Cat parseCatFromString(String line) {
        String[] strings = line.split("\\|");
        System.out.println("arrayStr: " + Arrays.toString(strings));
        return new Cat(strings[0], Integer.parseInt(strings[1]), Boolean.valueOf(strings[2]));
    }

    private static void writeCatsToFile(List<Cat> cats, File file) {
        file.delete();
        try {
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        for (Cat cat : cats){
            try(FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
            {
             String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
             bufferedWriter.write(toWrite);
             bufferedWriter.newLine();

            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
