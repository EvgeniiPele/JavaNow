package lesson5;

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        phoneBook();
        repeatedNames();
    }

    private static void repeatedNames() {
        /*Пусть дан список сотрудников:
        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.*/
        List<String> people = new ArrayList<>();
        people.add("Иван Иванов");
        people.add("Светлана Петрова");
        people.add("Кристина Белова");
        people.add("Анна Мусина");
        people.add("Анна Крутова");
        people.add("Иван Юрин");
        people.add("Петр Лыков");
        people.add("Павел Чернов");
        people.add("Петр Чернышов");
        people.add("Мария Федорова");
        people.add("Марина Светлова");
        people.add("Мария Савина");
        people.add("Мария Рыкова");
        people.add("Марина Лугова");
        people.add("Анна Владимирова");
        people.add("Иван Мечников");
        people.add("Петр Петин");
        people.add("Иван Ежов");
        System.out.println(people);
        Map<String, Integer> sortedPeople = new HashMap<>();
        String[] keys = {};
        String[] names = new String[18];
        for (int i = 0; i < people.size(); i++) {
            keys = people.get(i).split(" ");
            names[i] = keys[0];
            sortedPeople.put(keys[0],0);
        }

            for (String word : names) {
                if (!sortedPeople.containsKey(word)) {
                    sortedPeople.put(word, 0);
                }
                sortedPeople.put(word, sortedPeople.get(word) + 1);
            }
        sortedPeople.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        }


    private static void phoneBook() {
//        Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        Map<String, String> directory = new HashMap<>();
        directory.put("+7963253125", "Иванов Иван");
        directory.put("+79201546123", "Сидорова Лариса");
        directory.put("+79203216547", "Иванов Иван");
        directory.put("+79302654789", "Петров Петр");
        directory.put("+79993663322", "Кириллов Сергей");
        directory.put("+79856545231", "Мартова Мария");
        for (HashMap.Entry<String, String> pair : directory.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
