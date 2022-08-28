/*. Write a Java program to return a string where every appearance of
the lowercase word 'is' has been replaced with 'is not'.
 Sample Output:
 The given string is: it is a string
 The new string is: it is not a string */

class test7
{
       public static void main(String args[])
         {
               String s="it is a string";
               String s1=s.replace("is","is not");
               System.out.println(s1);
         }
}
