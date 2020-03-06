/**
 *        Заданы 2 массива целых чисел произвольной длины.
 *        Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 *        Пример:
 *        1-й массив: {1, 2, 3, 4, 5}
 *        2-й массив: {5, 6, 7}
 *        Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */

package _1_procedural._hw._hw_1_arrays;

import java.util.Arrays;

public class Hw_1_arrays_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7};
        System.out.println("1-й массив: " + Arrays.toString(arr1));
        System.out.println("2-й массив: " + Arrays.toString(arr2));
        int[] arr3 = arraysConnection(arr1, arr2);
        System.out.println("Результат: " + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("Результат (отсортированный): " + Arrays.toString(arr3));

    }

    static int[] arraysConnection(int[] arr1, int[] arr2) {
        int lengthFirstArray = arr1.length;
        int lengthSecondArray = arr2.length;
        int lengthRezArray = lengthFirstArray + lengthSecondArray;
        int[] rezArray = new int[lengthRezArray];
        int i = 0, j = 0;
        while (i < lengthRezArray) {
            if (j < lengthFirstArray) {
                rezArray[i++] = arr1[j];
            }
            if (j < lengthSecondArray) {
                rezArray[i++] = arr2[j];
            }
            j++;
        }
        return rezArray;
    }
}
