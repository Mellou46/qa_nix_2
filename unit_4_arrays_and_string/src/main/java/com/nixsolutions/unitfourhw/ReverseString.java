package com.nixsolutions.unitfourhw;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Hello world";
        String d = "";
        System.out.println(s);
        System.out.println(myReverse(s));
    }

    public static String myReverse(String src)
    {

        String result = "";
        for (int i = 0; i < src.length(); i++) {
            result = src.charAt(i) + result;
        }

        return result;
    }
//    public static String mySubstring(String src, String dest){
//
//    }
//    public static String reverse(String src, int firstIndex, int lastIndex){
//
//    }
}
