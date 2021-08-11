package com.nixsolutions.unitthreehw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {

    public void run() {

        /*2. реализуйте задачу, которая принимает строку с консоли и вычленяет все символы латиницы/кириллицы и
        сортирует их, указывая количество вхождений каждого символа. Пример: Входные данные: 1w4tt!7
        Выходные данные: 1. t - 2; 2. w - 1*/

        System.out.println("Введите символы с клавиатуры:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Вы ввели: " + s);
        String res = s.replaceAll("[0-9!@#$%^&*()_+./<>,;:'\" ?]", "").toLowerCase();
        System.out.println("Строка без числовых знаков выглядит так: " + res);
        System.out.println("***************************");
        System.out.println("Упорядоченный результат: " + count(res));
    }

    public static Map<Character, Integer> count(String s) {

        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            Integer n = result.get(c);
            result.put(c, n == null ? 1 : n + 1);
        }

        return result;
    }
}
