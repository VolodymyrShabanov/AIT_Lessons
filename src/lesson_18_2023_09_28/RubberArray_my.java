
package lesson_18_2023_09_28;

import java.util.Arrays;
import java.util.Random;

public class RubberArray_my {
    int[] array;

    int cursor;

    Random random = new Random();

    public RubberArray_my() {
        array = new int[4];

    }

    public RubberArray_my(int sizeDefault) {
        array = new int[sizeDefault];
    }

    void add(int... ints) {
        /* можем обращаться ка с массивом
        for (int i = 0; i < ints.length; i++) {
            ints[i];
        }
         */
        ints[0] = 8888;
        for (int value : ints) {
            add(value);
        }
    }

    void addRandomValues(int count, int bound) {
        for (int i = 0; i < count; i++) {
            add(random.nextInt(bound));

        }
    }

    void addRandomValues(int count) {
        addRandomValues(count, 100);
    }


    void expandArray() {
//        int[] newArray = Arrays.copyOf(array, array.length * 2); // встроенный функционал создает новы массив и копирует в него данные предыдущего
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }

        return result;
    }

    int length() {
        return cursor;
    }

    int lengthOllElements() {
        return array.length;
    }

    int indexOf(int number) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    int lastIndexOf(int number) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    boolean contains(int value) {
        return indexOf(value) >= 0;

    }


    void add(int number) {
        System.out.println("cursor = " + cursor);
        if (cursor > array.length * 0.9) { //
            expandArray();
        }
        array[cursor++] = number;
    }

    int removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) return Integer.MIN_VALUE;
        int value = array[index];

        int[] result = new int[array.length - 1];

//        for (int i = 0; i < index; i++) {
//            result[i] = array[i];
//        }
//
//        for (int i = index+1; i < cursor; i++) {
//            result[i-1] = array[i];
//        }
        System.out.println("cursor = " + cursor);
        System.out.println("array.length = " + array.length);

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else {
                result[i] = array[i + 1]; // ??????
            }
        }

        cursor--;
        array = result;
        return value;
    }


    boolean remove(int value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >=0;
    }


    int [] toArray () {
        int[] result = new int [cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];

        }
        return result;
    }

    void trim () { // обрезает массив до длины - cursor
        System.out.println("Текущий array 1 до обработки " + Arrays.toString(array));
        array = toArray();
        System.out.println("Текущий array 2 после обработки " + Arrays.toString(array));
        System.out.println("cursor = " + cursor);

    }

}


    /*
    -+ 1. Динамическое изменение размера массива;
    -- 2. Добавление элемента/значения в массив;
    -- 3. Поиск значений в массиве;
    -- 4. Удаление элемента из массива по значению;
    -- 5. Удаление элементов из массива по индексу;
    6. Найти мин, макс, среднее, сумму элементов;
    -- 7. Количество элементов в массиве;
    -- 8. Строковое представление массива (для вывода в консоль);
    -- 9. Добавить в массив несколько значений;
    -- 10. Добавить в массив Х рандомные значений
    -- 11. Добавить в массив Х рандомные значений в диапазоне от 0 до Y
    -- 12. Вернуть наш резиновый массив в виде обычного массива

    */


