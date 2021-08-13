package com.nixsolutions.unitthreehw;

import java.util.Scanner;

public class PrimitivesHomeWorkMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер таска, который хотите посмотреть (от 1 до 3)");
        int taskNumber = scanner.nextInt();
        if (taskNumber == 1) {
            new Task01().run();
            }
            else if (taskNumber == 2) {
                new Task02().run();
            }
            else new Task03().run();
    }
}
