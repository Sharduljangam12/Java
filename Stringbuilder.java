import java.util.*;

public class Stringbuilder{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //..Insert char
        sb.insert(0, 'S');
        System.out.println(sb);
    }
}
/*Declaration
 StringBuilder sb = new StringBuilder("Apna College");
 System.out.println(sb);
 */

 /*GEt a character from Index
  StringBuilder sb = new StringBuikder("Tony");
  //Set char
  System.out.println(sb.charAt(0));
  */

  /*Set a character at Index
   StringBuilder sb = new StringBuilder("Tony");
   //Get char
   sb.setCharAt(0, 'P');
   System.out.println(sb);
   */

   /*Delete char at some Index
    import java.util.*;
    public class Strings {
    public static void main(String args[]){
    String Builder sb = new StringBuilder("tony");
    //Insert char
    sb.insert(0, "B");
    system.out.println(sb);

    ..delete char
    sb.delete(0,1);
    System.out.println(sb);
    }
    }
    */

    /* Append a char it means to add something at the end
     import java.util.*;

     public class Strings {
      public static void main(String args[]) {
       StringBuilder sb = new StringBuilder("Tony");
       sb.append("Stark");
       System.out.println(sb);
      }
     }
     */

     /*Print length of String
      import java.util.*;

      public class Strings {
      public static void main(String args){
       StringBuilder sb = new StringBuilder("Tony");
       sb.append("Stark");
       System.out.println(sb);

       System.out.println(sb.length());
      }
      }
      */