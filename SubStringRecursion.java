import java.util.ArrayList;

public class SubStringRecursion {
    static ArrayList<String> subString(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char ch = s.charAt(0);
        // recursion work
        ArrayList<String> smallAns = subString(s.substring(1));
        // self work
        for (String str : smallAns) {
            ans.add(str);      // Substrings without the first character
            ans.add(ch + str); // Substrings with the first character
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(subString("abc"));
        System.out.println(list);
    }
}
