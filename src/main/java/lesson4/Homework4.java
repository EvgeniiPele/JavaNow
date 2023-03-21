package lesson4;

import java.util.*;


public class Homework4 {
    public static void main(String[] args) {
        rememberLines();
        upendList();
    }



    private static void rememberLines() {
        //    Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        Stack<String> stack = new Stack<>();

        while (flag) {
            System.out.println("Введите строку: ");
            String inputLines = in.next();
            stack.push(inputLines);
            System.out.println("Хотите ввести следующую строку? ");
            String choiseUser = in.next();
            switch (choiseUser) {
                case "нет":
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
        System.out.println(stack);
        System.out.println(stack.size());

        boolean secondFlag = true;
        while (secondFlag) {
            System.out.println("Введите комманду:\n" +
                    "'print' - вывести строки на экран\n" +
                    "'revert' - удалить последнюю введенную строку\n" +
                    "'stop' - выйти из программы -> ");
            String nextLine = in.next();
            switch (nextLine) {
                case "stop":
                    System.out.println("Программа завершена!");
                    secondFlag = false;
                    break;
                case "print":
                    for (int i = 0; i <= stack.size()+1; i++) {
                        System.out.println(stack.pop());
                    }
                    break;
                case "revert":
                    System.out.println("Строка " + stack.pop() + " удалена");
                    break;
            }

        }
    }
    private static void upendList() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> changeling = new LinkedList<>();
        changeling.add("Its");
        changeling.add("list");
        changeling.add("will");
        changeling.add("challenge");
        changeling.add("!");
        System.out.println(changeling);
        LinkedList<String> newList = new LinkedList<>();
        for (int i = changeling.size()-1; i >=0 ; i--) {
            newList.add(changeling.get(i));
        }
        System.out.println(newList);

    }
}




