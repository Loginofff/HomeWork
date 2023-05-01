// Java program to show how to compare Strings
// using library function
public class Test2
{ public static void main(String[] args)
{
    String s1 = "Chorot26";
    String s2 = "Chorot26";
    String s3 = "Shyam";
    String s4 = "ABC";

    System.out.println(" Comparing strings with compareTo:");
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));
}
}