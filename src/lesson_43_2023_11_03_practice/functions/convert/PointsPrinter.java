package lesson_43_2023_11_03_practice.functions.convert;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class PointsPrinter {

    public void printAll(Point[] points, Convert convert){
        for (int i = 0; i < points.length; i++) {

            Point current = points[i];

            String pointToPint = convert.from(current.getX(), current.getY(), current.getZ());

            System.out.println(pointToPint);
        }

    }
}
