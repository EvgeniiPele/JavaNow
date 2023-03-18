package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import com.google.common.math.Stats;



public class Homework3 {
    public static void main(String[] args) {
        deleteNumbers();
        findMaxAndMin();
        stringAndNumbers();
    }



    private static void deleteNumbers() {
        /*Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)*/
        final Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(100));
        }
        System.out.println(nums);
        nums.removeIf(x -> x % 2 ==0);
        System.out.println(nums);
    }

    private static void findMaxAndMin() {
        /*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/
        final Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(100));
        }
        System.out.println(nums);
        System.out.printf("%d -> максимальное число \n", Collections.max(nums));
        System.out.printf("%d -> минимальное число\n", Collections.min(nums));
        int sum = 0;

        double avg = Stats.meanOf(nums);
        System.out.printf("%s -> среднее арифметическое", String.valueOf(avg));
    }
    private static void stringAndNumbers() {
        /*Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.*/
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add("Hi");
        arr.add(1);
        arr.add(0);
        arr.add("my");
        arr.add("little");
        arr.add(25);
        arr.add("pony");
        arr.add(33);
        System.out.println(arr);
        arr.removeIf(x -> x.getClass() == Integer.class);
        System.out.println(arr);
    }
}
