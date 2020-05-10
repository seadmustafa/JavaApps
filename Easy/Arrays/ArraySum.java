import java.util.*;

//Java program to calculate the sum of array elements.

public class ArraySum{

public static void main (String[] args){

int sum=0;

int[] array = { 24, 6, 47, 35, 2, 14 };
for(int i=0;i<array.length;i++) {
sum +=array[i];
}

System.out.println("Sum of Array is: " + sum);

}
}