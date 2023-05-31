import java.util.Scanner;
import java.util.Arrays;
public class anagram {
    public static void main (String[] args)
    {
        String str="sagarkumar";
    String str1="kumsagarar";
//     //check both string are anagram or not
// // 1st method using sortin method                    o(nlogn) o(1)
// if(checkanagram(str,str1))
// {
//     System.out.println("both strings are anagram");
// }
// else
// {
//     System.out.println("Both strings are not anagram");
// }
   

//     }

//     public static boolean checkanagram(String str,String str1)
//     {
//     char s1[]=str.toCharArray();
//    char s2[]=str1.toCharArray();
//    Arrays.sort(s1);
// Arrays.sort(s2);

// if(s1.length!=s2.length)
// {
//     return false;
    
// }
// for(int i=0;i<s1.length&& i<s2.length;i++)
// {
    
//     if(s1[i]!=s2[i])
//     {
//         return false;
//     }
// }
// return true;

         // 2 nd method count array   o(n)  o(1)


         if(checkanagram(str,str1))
         {
             System.out.println("Both Strings are Anagram");
         }
         else
         {
             System.out.println("BOth strings are not anagrams");
         }


} 
public static boolean checkanagram(String str,String str1)
{

// first check both length of both string
 if(str.length()!=str1.length())
 {
     return false;
 }
 // create two count array and initialize as 0
 int count[]=new int [256];
 int count1[]=new int[256];
 Arrays.fill(count,0);
 Arrays.fill(count1,0);

 // count frequency of every char in both strings

 for(int i=0;i<str.length()&& i<str1.length();i++)
 {
     count[i]++;
     count1[i]++;
 }
// compare both frequency 
for(int i=0;i<count.length;i++)
{
    if(count[i]!=count1[i])
    {
        return false;
    }
}

    return true;
} 
    
}
