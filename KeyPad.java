public class KeyPad {

    public static void combination(String s, String[] k, String res) {

        if(s.length() == 0) {
            System.out.println(res+" ");
            return;
        }
        int currNumber = s.charAt(0) - '0';
        String choices = k[currNumber];
        for(int i = 0; i < choices.length(); i++) {
            combination(s.substring(1), k, res + choices.charAt(i));
        }
    }

    public static void main(String[] args){
        String s = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(s,kp,"");
    }
}
