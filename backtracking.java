//print all Permutations
//Time complexity = O(n*n!)
//This is Backtracking using recursion
public class backtracking {
    public static void printPermutation(String str, int idx, String perm) {
        if(str.length() == 0) {
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char currChar =str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, 0, "");
    }
}
