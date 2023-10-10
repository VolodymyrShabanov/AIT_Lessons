package lesson_23_2023_10_06_practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(Arrays.toString(array));

        //swapMinMax(array);
        //selectionSort(array);
        bubbleSort(array);
        //System.out.println(Arrays.toString(array));


    }



    public static void bubbleSort (int [] array) {

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

    public static void swapMinMax(int[] array) {
        int min = array[0];
        int minIndex = 0;

        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }

            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

//        int max = array[0];
//        int maxIndex = 0;
//        for (int j = 1; j < array.length; j++) {
//            if (max < array[j]) {
//                max = array[j];
//                maxIndex = j;
//            }
//        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

    }

    public static void selectionSort(int [] array){

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1 ; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }


    public static void mergeSort(int[] array) {
    /*
    Алгоритм сортировки слиянием выглядит следующим образом:
    Входной массив разбивается на две части одинакового размера;
    Каждый из подмассивов сортируется отдельно, по этому же принципу,
    то есть производится повторное разбитие до тех пор, пока длина подмассива не достигнет единицы.
    В таком случае каждый единичный массив считается отсортированным;
    После этого осуществляется слияние всех подмассивов в один, в результате чего получаем отсортированные данные.
    */


        int n = 2;
        int[] arrayNew = new int[array.length];

        while (n <= array.length) {

            for (int count = 0; count < array.length; count += n) {
                int indArrLeft = count;
                int indArrRiht = n / 2 + count;
                int k = 0;

                while (indArrLeft < n / 2 + count && indArrRiht < n + count) {
                    if (array[indArrLeft] > array[indArrRiht]) {
                        arrayNew[k + count] = array[indArrRiht];
                        indArrRiht++;
                    } else {
                        arrayNew[k + count] = array[indArrLeft];
                        indArrLeft++;
                    }
                    k++;
                }

                while (indArrLeft < n / 2 + count) {
                    arrayNew[k + count] = array[indArrLeft];
                    indArrLeft++;
                    k++;
                }

                while (indArrRiht < n + count) {
                    arrayNew[k + count] = array[indArrRiht];
                    indArrRiht++;
                    k++;
                }
            }

            for (int i = 0; i < array.length; i++) {
                array[i] = arrayNew[i];
            }

            System.out.println(Arrays.toString(array));

            n *= 2;
        }
    }


    }
