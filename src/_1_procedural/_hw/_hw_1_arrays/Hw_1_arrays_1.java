/**
 *       Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
 *       и печатает результат. Цикличность означает, что последний элемент массива становится самым
 *       первым его элементом.
 */

package _1_procedural._hw._hw_1_arrays;

import java.util.Arrays;

public class Hw_1_arrays_1 {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7,8};
        System.out.println("Первоначальный массив: " + Arrays.toString(inputArray));
        shiftElementRigth(inputArray);
        System.out.println("Массив со смещенным последним элементом: " + Arrays.toString(inputArray));
    }

    static void shiftElementRigth(int[] arr) {
        int a = arr.length;
        if (a <= 1) {
            return;
        }
        int lastItem= arr[a - 1];
        for (int i = a - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastItem;
    }
}
