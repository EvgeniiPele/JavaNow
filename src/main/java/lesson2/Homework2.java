package lesson2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Homework2 {
    public static void main(String[] args) {
//        System.out.println(isPolindome("а роза упала на лапу Азора"));
        writeTest();

    }



    private static boolean isPolindome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    private static void writeTest() {
        StringBuilder text = new StringBuilder();
        text.append("TEST".repeat(100));

        String filePath = "src/main/java/lesson2/test.txt";

        try {
            Files.write(Paths.get(filePath), text.toString().getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}

