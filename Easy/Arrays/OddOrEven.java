import java.util.*;

//Java program to find even and odd elements in given array.

public class OddOrEven{
public static void main (String[] args){
int counter=0;
int[] array = { 24, 6, 47, 35, 2, 14 };

for(int i=0;i<array.length;i++) {
if(array[i]>0 && array[i]%2==0){
counter++;
}
}

System.out.println("Original array is :" + Arrays.toString(array));
System.out.println("Number of even elements in array is : " + counter);
System.out.println("Number of odd elements in array is : " + (array.length-counter));

}
}