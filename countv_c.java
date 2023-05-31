public class countv_c {
    public static int count(String str)
    {
        int vowel=0;
        
            //  for(int i=0;i<str.length();i++)
            //  {
            //      char ch=str.charAt(i);
            //      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            //      {
            //          vowel++;
            //      }
            //  }
            String regex="[aeiou]";
            
            boolean res=str.matches(regex);
            if(res)
            {
                vowel++;
            }


        //int cosonant=0;
        return vowel;
        
    }
    public static void main(String[]args)
    {
        String str="star";
        System.out.println(count(str));
    }
    
}
