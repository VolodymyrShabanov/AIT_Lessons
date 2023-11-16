package lesson_51_2023_11_16;

import java.io.File;
import java.io.IOException;

/**
 * Created by Volodymyr Sh on 16.11.2023
 * project name: AIT_Lessons
 */
public class FileIO {
    public static void main(String[] args) {
        File firstDir = new File("./files");

        // mkdir() - created directory.
        System.out.println(firstDir.mkdir());


        // mkdirs()
        File pathDir = new File("./files/db/new");
        System.out.println(pathDir.mkdirs());

        pathDir = new File("./src/lesson_51_2023_11_16/test");
        File file = new File(pathDir, "text.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // delete() - deletes a file or directory
        //System.out.println(file.delete());

        // deleteOnExit() - deletes a file or directory when the VM shuts down

    }
}
