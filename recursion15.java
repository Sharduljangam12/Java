//Friends pairing problem
public class recursion15 {
    public static int pairFriends(int n) {
        if( n <= 1) {
            return 1;
        }

        return pairFriends(n-1) + (n-1) + pairFriends(n-2);
    }

    public static void man(String args[]) {
        int n =3;
        System.out.println(pairFriends(n));
    }
}
