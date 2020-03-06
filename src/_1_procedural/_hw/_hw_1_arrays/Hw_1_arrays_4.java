/**
 *    Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 *    и возвращает одномерный массив со всеми элементами двумерного.
 */

package _1_procedural._hw._hw_1_arrays;

import java.util.Arrays;

public class Hw_1_arrays_4 {
    static int count = 0;
    static int counter = 0;

    public static void main(String[] args) {
        int[][] inputArray = {{1, 2, 3}, {4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13}, {14,15}};
        System.out.println("Исходный двумерный массив:");
        for (int[] i : inputArray) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Преобразованный массив: " + Arrays.toString(linearize(inputArray)));
    }

    static int[] linearize(int[][] a) {
        int size = a.length;
        for(int i = 0; i < size; i++){
            count += a[i].length;
        }
        int[] rezArray = new int[count];
        for(int i = 0; i < size; i++) {
            if(i == 0) {
                System.arraycopy(a[0], 0, rezArray, 0, a[0].length);
                counter = a[0].length;
                continue;
            }
            System.arraycopy(a[i], 0, rezArray, counter, a[i].length);
            counter += a[i].length;
        }
        return rezArray;
    }
}

