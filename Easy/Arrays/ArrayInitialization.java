
class ArrayInitialization {

public static void main (String[] args) {
// We can declare in three different ways . 
int[] firstarray = new int [5];
firstarray[0] = 1;
firstarray[1] = 2;
firstarray[2] = 3;
firstarray[3] = 4;
firstarray[4] = 5;

//looping through first array
for (int i = 0 ; i< firstarray.length;i++){
System.out.println(firstarray[i]);
}

System.out.println("**********************");

//int[] secondarray = {10,20,30,40,50};

int[] secondarray =new int[] {10,20,30,40,50};

//looping through second array
for (int i = 0 ; i< firstarray.length;i++){

System.out.println(secondarray[i]);
}
System.out.println("**********************");

//looping through third array
int[] thirdarray = new int[] {100,200,300,400,500};

for (int t:thirdarray)
{
System.out.println(t);
}
}
}
