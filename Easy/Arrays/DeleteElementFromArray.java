import java.util.*;
public class DeleteElementFromArray{

public static void main (String[] args) {
    
 int[] array = {1,2,3,4,5,6,7,8};
 System.out.println(Arrays.toString(array));
 int index = 1;
 int[] newarray = new int[array.length-1];
 for(int i =0,k=0;i<array.length;i++){
 if (index==i){
 continue;
 }
 newarray[k++]=array[i];
 }
  System.out.println(Arrays.toString(newarray));

 }
    
    
    }
    
