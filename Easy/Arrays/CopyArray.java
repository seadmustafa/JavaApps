import java.util.*; 

//This is a Java program to copy an array by iterating the array.

public class CopyArray{
 public static void main(String[] args) {
   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int[] new_array = new int[array.length];     
 
   System.out.println("Source Array : "+Arrays.toString(array));     
   
   for(int i=0; i < array.length; i++) {
    new_array[i] = array[i];
}
   System.out.println("New Array: "+Arrays.toString(new_array));
 }
 }