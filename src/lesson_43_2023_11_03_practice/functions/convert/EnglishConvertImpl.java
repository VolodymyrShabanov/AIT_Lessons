package lesson_43_2023_11_03_practice.functions.convert;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class EnglishConvertImpl implements Convert{
    @Override
    public String from(int x, int y, int z) {
        return "Point in coordinates: (" + x + ", " + y + ", " + z +")";
    }
}
