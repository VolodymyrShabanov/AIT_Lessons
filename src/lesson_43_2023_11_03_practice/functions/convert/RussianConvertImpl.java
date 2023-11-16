package lesson_43_2023_11_03_practice.functions.convert;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class RussianConvertImpl implements Convert{
    @Override
    public String from(int x, int y, int z) {
        return "Точка в координатах: (" + x + ", " + y + ", " + z +")";
    }
}
