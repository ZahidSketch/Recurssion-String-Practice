public class SubStrings {

    static void SubString(String str,String currAns){

        // base case
        if(str.length() == 0){
            System.out.println(currAns);
            return;
        }
        // self work
        char currChar=str.charAt(0);
        String remString = str.substring(1);
        // recursion work
        SubString(remString,currAns+currChar);

        SubString(remString,currAns);



    }
    public static void main(String[] args){

        SubString("abc","");
    }
}
