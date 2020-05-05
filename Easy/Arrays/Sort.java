import java.util.*;

public class Sort{
//Here is a simple sort problem to find the highest number.

public static void main (String[] args){
//Array initialization
int[] aryNums = { 24, 6, 47, 35, 2, 14 };
//To sort automatically all array's elements we need to use Arrays.sort() method . 

Arrays.sort(aryNums);
int lastArrayNumber = aryNums.length - 1;

//then we print the highest element of our array

System.out.println("Highest Number: " + aryNums[lastArrayNumber]);

}
}
