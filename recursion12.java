//Print all the permutations of a string
public class recursion12 {
    public static void printPermutation(String str, int idx, String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermuatation(newStr, idx+1, perm+currChar);
        }
    }

    public static void main(String args[]) {
        Striing str = "abc";
        printPermutation(str, 0, "");
    }
}
//Time complexity = O(n*n!)