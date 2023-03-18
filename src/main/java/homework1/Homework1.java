package homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        findMaxAndMin();
        difineYear();
        changeArray();
    }


    private static void findMaxAndMin() {
        /*Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
        int[] array = {8, 3, 5, 7, 8, 9, 2, 5, 4, 5, 11};
        int maxCount = array[0];
        int minCount = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxCount) {
                maxCount = array[i];
            }
            if (array[i] < minCount) {
                minCount = array[i];
            }
        }
        System.out.printf("Максимально число -> %d, минимально число -> %d", maxCount, minCount);
    }

    private static void difineYear() {
//        Написать метод, который определяет, является ли год високосным,
//        и возвращает boolean (високосный - true, не високосный - false).
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    private static void changeArray() {
        int[] nums = {3, 2, 2, 3, 5, 6};
        int[] newArray = new int[nums.length];
        int val = 3;
        int countStart = 0;
        int countFinish = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                newArray[countFinish] = val;
                countFinish--;
            }else{
                newArray[countStart] =nums[i];
                countStart++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
