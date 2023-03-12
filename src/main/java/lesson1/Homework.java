package lesson1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*printName();*/
        printArray();
    }

    private static void printArray() {
        int[] array = {1,1,0,1,1,1,0,1,1,1,1,1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            }else {
                count = 0;
                }
            }
        System.out.println(maxCount);
    }

    public static  void printName(){
        Scanner inputName = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = inputName.nextLine();
        System.out.println("Привет, " + name);

    }

}
