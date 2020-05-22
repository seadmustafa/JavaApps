public class MoveZeros
{
	 static void moveZeroElementToEnd(int[] arr)
	 {  
		 // declare and initialize.
		 int size = arr.length;  
	     int count = 0;  
	  
	     // access all array elements.
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	  
	 public static void main(String[] args) 
	 {  
	     // take default elements in array.
	     int[] arr = {1, 3, 5, 0, 0, 7,0, 11, 0, 6, 0, 0, 12, 10, 0, 2};  
System.out.print("Original Array : ");  
for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " ");  	     
moveZeroElementToEnd(arr);   
	     System.out.println(""); 
	     // print elements after moving 0's to end
	     System.out.print("Array after moving zeros to end : ");  
	  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " ");  
	 }  
}