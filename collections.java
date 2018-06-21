import java.util.*;
  class collec{
  public static void main(String[] args)
  {
        HashSet<Integer> v1 = new HashSet<Integer>();
          v1.add(1);
          v1.add(2);
          v1.add(3);
          v1.add(4);
          System.out.println("contents of set 1 "+v1);
          HashSet<Integer> v2 = new HashSet<Integer>();
          v2.add(1);
          v2.add(3);
          v2.add(6);
          v2.add(8);
          System.out.println("contents of set 2"+v2);
          v1.retainAll(v2);
          System.out.println("Common contents");
          System.out.println(v1);
     }
}
