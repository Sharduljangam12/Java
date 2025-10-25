//Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
public class toowerofhanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if( n == 1) {
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }

        //transfertop n-1 from src to helper using dest as 'helper'
        towerofHanoi(n-1, src, dest, helper);

        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);

        //transfer n-1 fromhelper to dest using src as 'helper'
        towerofHanoi(n-1, helper, src, dest);

    }
    public staic void main(String args[]) {
        int n = 4;
        towerofHanoi(n, "A", "B", "C");
    }
}
