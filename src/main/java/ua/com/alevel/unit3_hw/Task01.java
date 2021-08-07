package ua.com.alevel.unit3_hw;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
     /*1. реализуйте задачу, которая принимает строку с консоли и вычленяет все числа и находит их сумму
    Пример: Входные данные: 1w4tt!7 --> Выходные данные: 12*/
        System.out.println("Введите символы с клавиатуры:");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Вы ввели:" + s);

        int onlyDigits = Integer.parseInt(s.replaceAll("[^0-9]", ""));
//        System.out.println("Одни цифры: " + onlyDigits);
        int sum = 0;
        while (onlyDigits > 0) {
            sum = sum + onlyDigits % 10;
            onlyDigits = onlyDigits / 10;
        }
        System.out.println("Сумма всех чисел в вашей строке:" + sum);
    }

}
