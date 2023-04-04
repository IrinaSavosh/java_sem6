package seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class one{
  
   public static void main(String[] args) {
      var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
      var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
      var u = new HashSet<Integer>(a); u.addAll(b);// помести все из "а" и добавь из "b"
      var r = new HashSet<Integer>(a); r.retainAll(b); // помести все из "а" и оставь только значения
      //                                                  из "b"
      var s = new HashSet<Integer>(a); s.removeAll(b);// помести все из "а" и оставь только значения, 
      //                                               которых нет в "b"
      // System.out.println(a); // [1, 2, 3, 4, 5, 6]
      // System.out.println(b); // [17, 2, 3, 5, 7, 11]
      // System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
      // System.out.println(r); // [2, 3, 5, 7]
      // System.out.println(s); // [1, 4, 6]
      boolean res = a.addAll(b);
      System.out.println(res);
      mainTwo(args);

   }
   public static void mainTwo(String[] args) {
      var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
      var b = new TreeSet<>(Arrays.asList('u',3,17,'f',2,11,5));
      System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
      System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
      System.out.println(a.contains(1)); // true
   }

   public static void mainThree(String[] args) {
      var a = new LinkedHashSet<>(Arrays.asList('k','I',2,3,8,4,5));
      var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
      a.add(28);
      System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
      System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
      }
}
