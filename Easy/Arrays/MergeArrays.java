import java.util.*;

//Merge (or add) two arrays into one . 
//We can solve this problem in two ways . 

public class MergeArrays {
  public static void main(String args[]) {
    String a[] = { "a", "b", "c" };
    String b[] = { "d", "e" };
System.out.println("------------------------------------");

//Let's print out elements of a and b arrays . 

System.out.println("First array elements are : " + Arrays.toString(a));
System.out.println("Second array elements are : " +Arrays.toString(b));
System.out.println("First Way ");
    List<String> list = new ArrayList<String>(Arrays.asList(a));
    list.addAll(Arrays.asList(b));
    Object[] c = list.toArray();
    System.out.println(Arrays.toString(c)); 
 
System.out.println("Second Way ");
     int len = a.length+b.length;
    String d[] = new String[len];

for(int i = 0;i<a.length;i++){
d[i]=a[i];

}
for(int j = 0;j<b.length;j++){
d[j+a.length]=b[j];
}
System.out.println(Arrays.toString(d));
 
  }
}
