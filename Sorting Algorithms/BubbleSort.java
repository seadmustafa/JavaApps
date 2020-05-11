import java.util.*;

public class BubbleSort {
public static void main (String[] args){

int[] arr = { 24, 6, 47, 35, 2, 14 };
System.out.println("Unsorted Array is : "+ Arrays.toString(arr));
bubbleSort(arr);
System.out.println("Sorted Array is : "+ Arrays.toString(arr));
}

public static int[] bubbleSort(int[] list){

int i,j,temp=0;
for(i=0;i<list.length-1;i++){
for(j=0;j<list.length-i-1;j++){

if(list[j]>list[j+1]){
temp = list[j];
list[j]=list[j+1];
list[j+1]=temp;
}
}

}
return list;
}
}
