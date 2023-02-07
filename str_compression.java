public class str_compression {

    public static String compress(String str)
    {
       String cmp="";
      

       for(int i=0;i<str.length();i++)
       {
        Integer count=1; // int is a class bcz tostring() return all type class into a string
           while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1))
           {
               count++;
               i++;
           }
           cmp+=str.charAt(i);
           if(count>1)
           {
               cmp=cmp+count.toString();  // if char is >1 then add freq 
           }
       }
       return cmp;
    }
    public static void main(String [] args)
    {

        String s1="aaabbccd";
        System.out.println(compress(s1));
    }
    
}
