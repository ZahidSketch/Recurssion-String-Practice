import java.util.Scanner;

public class Palindrome {
    static String reverseString(String str, int n) {
        if(n == str.length()) return "";
        String ans = reverseString(str, n + 1);
        return ans + str.charAt(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = reverseString(str, 0);
        if(str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
