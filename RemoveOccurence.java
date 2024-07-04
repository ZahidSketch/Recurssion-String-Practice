public class RemoveOccurence {

    public static String removeOccurence(String str, int n) {
        // Base Case
        if(n == str.length()) return "";
        // Small Ans
        String asn = removeOccurence(str, n + 1);
        // Self Work
        char currChar = str.charAt(n);
        if(currChar != 'a') return currChar + asn;

        return asn;

    }
    public static void main(String[] args) {
        System.out.println(removeOccurence("hello meri jaan", 0));
    }
}
