public class Arrays1 {
    public static void main(String args[]) {
        //Declaration statement
        int[] marks = new int[3];
        //int marks[] = new int[3];
        //int marks[] = {97, 98, 96};
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 96;

        //loop
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
