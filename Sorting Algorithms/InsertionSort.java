import java.util.*;

public class InsertionSort{
public static void main (String[] args){

int[] arr= { 24, 6, 47, 35, 2, 14 };
System.out.println("Unsorted Array is : "+ Arrays.toString(arr));
insertionSort(arr);
System.out.println("Sorted Array is : "+ Arrays.toString(arr));
}

public static int[] insertionSort(int[] list){

int i,j,key,temp;
for(i=1;i<list.length;i++){
key=list[i];
j=i-1;
while(j>=0 && key < list[j]){
//let's swap elements 
temp = list[j];
list[j]=list[j+1];
list[j+1]=temp;

j--;
}
}
return list;
}
}