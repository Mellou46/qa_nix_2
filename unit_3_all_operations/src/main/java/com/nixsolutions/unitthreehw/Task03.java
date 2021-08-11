package com.nixsolutions.unitthreehw;

import java.util.Scanner;

public class Task03 {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересующий Вас урок: ");
        int i = scanner.nextInt();
        if (i <= 10) {
            //int i = 2;
            i = i * 45 + (i / 2) * 5 + ((i + 1) / 2 - 1) * 15;
            System.out.println("Kонец урока: " + (i / 60 + 9) + ":" + (i % 60));
        }

        else System.out.println("Вы ввели слишком большое число. Введите урок от 1 до 10.");
    }
}
