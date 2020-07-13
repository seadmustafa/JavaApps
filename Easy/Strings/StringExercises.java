class StringExercises {
  public static void main(String[] args) {
    String str= "Hello Java!";
    System.out.println(str);
    int first_index=str.charAt(0);
    System.out.println("ASCII Code of "+ (char)first_index + " is " +first_index); 
    //We can use also codePointAt method  to print ASCII code of the character at the specified index. 
    int val2 = str.codePointAt(0);
    System.out.println("ASCII Code of "+ (char)first_index + " is "+val2);

    int str_length = str.length();
    System.out.println("This is length of String : "+str_length);
    System.out.println("Java is index of: "+str.indexOf("Java"));
    System.out.println("Lower of String : "+str.toLowerCase());
    System.out.println("Uppercase of String : "+str.toUpperCase());
    System.out.println("Does string contains a ? - "+str.contains("a"));
    System.out.println("Does string ends with a ? - "+str.endsWith("a"));
    System.out.println("Tell me the Hash Code of String "+str.hashCode());
    System.out.println("Is this String empty ? - "+str.isEmpty());
    String new_str = "           I'm learning Java";
    System.out.println(new_str);
    System.out.println("Let's remove whitespace of "+ new_str);
    System.out.println(new_str.trim());
    new_str=new_str.trim();
    System.out.println(new_str.replace('a', 'o'));
    System.out.println(new_str.substring(13,17));
  }
}
