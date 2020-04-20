public class Swap {
  
  public static void main(String[] args) {
        //swap two variables without using temp
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("a: " + a + "\n" + "b:" + b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("a: " + a + "\n" + "b:" + b);
        
        //swap two variables without using temp 
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: " + a + "\n" + "b:" + b);
    }

}
