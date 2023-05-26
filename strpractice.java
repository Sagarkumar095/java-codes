public class strpractice {
    
     
    public static void main (String[] args)
    {
        String str="  My Name is Sagar   Kumar dsklf";

      
        String []s=str.split("\\s+");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        System.out.println(s.length);
    }
    
}
