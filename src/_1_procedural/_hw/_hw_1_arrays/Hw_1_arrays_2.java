/**
 *  Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
 *  и возвращающую новый массив без повторяющихся числел, и печатающую результат.
 *  В результирующем массиве не должно быть дубликатов.
 */

package _1_procedural._hw._hw_1_arrays;

import java.util.Arrays;

public class Hw_1_arrays_2 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,1,0,1,3,3,4,5,2,-2,0,3,1,7,6};
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        System.out.println("Массив без дубликатов: " + Arrays.toString(removeDuplicates(arr)));
    }

    static int[] removeDuplicates(int[] inputArray) {
        int[] removeIndexes = new int[inputArray.length];
        int deletionCounter = 0;
        for (int i = 0, size = inputArray.length; i < size; i++) {
            for (int j = i + 1, size2 = inputArray.length; j < size2; j++) {
                if (inputArray[j] == inputArray[i]) {
                    removeIndexes[j] = 1;
                    deletionCounter++;
                    break;
                }
            }
        }
        int[] resArray = new int[inputArray.length - deletionCounter];
        int count = 0;
        for (int i = 0, size = removeIndexes.length; i < size; i++) {
            if (removeIndexes[i] == 0) {
                resArray[count++] = inputArray[i];
            }
        }
        return resArray;
    }
}
