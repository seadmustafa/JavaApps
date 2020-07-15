import java.util.*;

class VowelConsonantCounter {
  public static void main(String[] args) {
    findIt("Hello world");
  }
  
  public static void findIt(String word) {
    int vowel_counter=0;
    int consonants_counter=0;
    for(int i = 0;i<word.length();i++){
     if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')  {
      vowel_counter++;
    }
    else if (word.charAt(i) >= 'a' && word.charAt(i)<='z') {
      consonants_counter++;
    }
     
    }
    System.out.println("This word has "+vowel_counter+ " vowels and " + consonants_counter +" consonants!" );

  }
   
}
