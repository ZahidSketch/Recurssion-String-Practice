public class StringReverse {

    static String reverseString(String str, int n) {
        if(n == str.length()) return "";
        String ans = reverseString(str, n + 1);
        return ans + str.charAt(n);
    }
    public static void main(String[] args){
        System.out.println(reverseString("hello meri jaan", 0));
    }
}
