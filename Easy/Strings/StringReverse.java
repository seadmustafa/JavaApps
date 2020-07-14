import java.util.*;
class StringReverse {
  public static void main(String[] args) {
    String word = "Hello world!";
    String reversed_word = "";
    //First Way
    System.out.println(word);
    for(int i = word.length()-1;i>=0;i--){
      reversed_word += word.charAt(i); 
    }
    System.out.println(reversed_word);

    //Second Way
    StringBuffer sb = new StringBuffer();
    sb.append(word);
    sb.reverse();
    System.out.println(sb);

    //Third Way
    List<Character> lst= new ArrayList<>();
    char[] wordch = word.toCharArray(); 
for (int i = wordch.length-1;i>=0;i--){
	System.out.print(wordch[i]);
}	
	System.out.println();

  //Fourth Way
    for (char c: wordch) {
        lst.add(c); 
    }
    Collections.reverse(lst);
    ListIterator li = lst.listIterator(); 
      while (li.hasNext()) 
        System.out.print(li.next()); 
    }
}
