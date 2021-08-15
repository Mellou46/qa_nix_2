package com.nixsolutions.unitfourhw;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите перевернуть: ");
        String s = scanner.nextLine();
        System.out.println("Введите подстроку с помощью которой хотите создать паттерн переворота строки: ");
        String d = scanner.nextLine();
        System.out.println("Введите номер первого символа для переворота строки: ");
        int firstIndex = scanner.nextInt();
        System.out.println("Введите номер последнего символа для переворота строки: ");
        int lastIndex = scanner.nextInt();
        System.out.println("Исходная строка: " + s);
        System.out.println("Исходная подстрока: " + d);
        System.out.println("Реверс строки: " + myReverse(s));
        System.out.println("Реверс строки по подстроке: " + mySubstringReverse(s, d));
        System.out.println("Реверс строки по индексу: " + indexReverse(s, firstIndex, lastIndex));
    }

    public static String myReverse(String src) {
        String result = "";
        for (int i = 0; i < src.length(); i++) {
            result = src.charAt(i) + result;
        }

        return result;
    }

    public static String mySubstringReverse(String src, String dest) {
        char[] destArray = dest.toCharArray();
        String resultString;
        String tmpDestStr = "";
        String tmpFirstPart = Arrays.toString(src.split(dest)).replaceAll(", |\\[|]", "");
        for (int i = destArray.length - 1; i >= 0; i--) {
            tmpDestStr += destArray[i];
        }
        resultString = tmpFirstPart + src.replace(src, tmpDestStr);
        return resultString;
    }


    public static String indexReverse(String src, int firstIndex, int lastIndex) {
        String tmp = src.substring(firstIndex, lastIndex + 1);
        String[] words = tmp.split(" ");
        String reversedString = "";
        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        reversedString = reversedString.substring(0, reversedString.length() - 1);
        return src.replace(tmp, reversedString);
    }
}
