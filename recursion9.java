//print all the subsequeces of a string
public class recursion9 {
    public static coid printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
            System.out.print(res);
            return;
        }

        //choose
        printSubseq(str, idx+1; res+str.chartAt(idx));

        //don't choose
        printSubseq(str, idx+1, res);
    }
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";

        printSubseq(str1, 0, "");
    }
}
//Time complexity = O(2^n)