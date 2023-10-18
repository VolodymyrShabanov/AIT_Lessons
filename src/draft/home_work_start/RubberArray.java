package draft.home_work_start;
/*
@date 28.09.2023
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.Random;

public class RubberArray<T> {
    private T[] array;
    private int cursor;
    static final int MULTIPLIER = 2;

    Random random = new Random();

    public RubberArray() {
        array = (T[]) new Object[10];
    }

    public RubberArray(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    public void add(T number) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor++] = number;
    }


    public void add(T... ints) {
        for (T value : ints) {
            add(value);
        }
    }

    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
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

    public int length() {
        return cursor;
    }

    public int indexOf(T number) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i; // как сравнивать скорей всего нужно использовать "equals"
        }
        return -1;
    }

    public int lastIndexOf(T number) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i; // как сравнивать скорей всего нужно использовать "equals"
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public boolean remove(T value) {
        int index = indexOf(value); // как сравнивать скорей всего нужно использовать "equals"
        removeByIndex(index);
        return index >= 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void trim() {
        System.out.println("Текущий array1: " + Arrays.toString(array));
        array = toArray();
        System.out.println("Текущий array2: " + Arrays.toString(array));
    }

    public T removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new IllegalArgumentException("Некорректный индекс");
        }

        T value = array[index];

        T[] result = (T[]) new Object[array.length - 1];

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else { // i >= index
                result[i] = array[i + 1];
            }
        }

        cursor--;
        array = result;
        return value;
    }
}


/* Это какой- то шлак - что то пошло не так
*

    public <T extends Comparable<T>> T minValue(T[] array) {
        T min = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public <T extends Comparable<T>> T maxValue(T[] array) {
        T max = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public <T extends Number> T summArray(T[] array) {
        Double sum = 0.0;
        for (int i = 0; i < cursor; i++) {
            sum += array[i].doubleValue();
        }
        return (T) sum;

    }

}

* */

/*
-+ 1. Динамическое изменение размера массива
-- 2. Добавление элемента (значения) в массив
-- 9. Добавлять в массив сразу несколько элементов
-- 3. Поиск значений в массиве
-- 3.1. Поиск последнего вхождения элемента
-- 4. Удаление элемента по значению из массива
-- 5. Удаление элемента по индексу из массива
6. Найти мин, макс, среднее, сумму элементов
-- 7. Количество элементов в массиве
-- 8. Строковое представление массива (для вывода в консоль, например)
-- 10. Добавить в массив Х случайных значений
-- 11. Добавить в массив Х случайных значений в диапазоне от 0 до У;
-- 12. Вернуть наш резиновый массив в виде обычного массива


 */


/*
        int[] ints = new int[1000];
        int[] ints1 = {1, 2, 3, 4, 5};
        int number = 100;
        // добавь значение number в конец массива
        // {1, 2, 3, 4, 5, 100};
        // удаление элемента по значение (5) -> {1, 2, 3, 4, 100};

        // добавь в массив 6,7,8,9 -> {1, 2, 3, 4, 100, 6, 7, 8, 9};


        for (int i = 0; i < ints.length; i++) {

*/