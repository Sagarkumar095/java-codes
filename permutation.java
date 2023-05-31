public class permutation {

    public static void  printpermuatation(String prefix,String str)
    {
 
        int len=str.length();
        if(len==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<len;i++)
        {
            printpermuatation(prefix+str.charAt(i), str.substring(0,1)+str.substring(i+1,len));
        }
    }
    public static void main(String[] args)
    {
         String str="123";
         String prefix="";
         printpermuatation(prefix,str);
    }
    
}
