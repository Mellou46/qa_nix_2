package ua.com.alevel.unit4_hw;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello world";
        String d = "";
        System.out.println(s);
        System.out.println(myReverse(s));
        //System.out.println("jdkbv^: " + mySubstring(s,d));

    }

    public static String myReverse(String src){
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
