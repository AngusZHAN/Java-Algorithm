package LeetCode;

public class ReverseString {
    //反转字符串
    public static void reverseString(char[] str) {
        for (int i = 0, len = str.length - 1; i <= len; i++, len--) {
            char temp = str[i];
            str[i] = str[len];
            str[len] = temp;
        }
    }
}