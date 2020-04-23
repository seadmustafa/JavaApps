
//Java program to calculate the average value of array elements.
public class Average {
public static void main(String[] args) {   
 
       int[] array =  {20, 30, 75, 35, -16, 44 , -80};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i < array.length ; i++)
        sum = sum + array[i];
       //calculate average value
        double average = sum / array.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}