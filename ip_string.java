public class ip_string {
    // define generateip method
    static String GenerateIp(String str)
    {
        String ip="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='.')
            {
                ip+="[.]";
            }
            else{
                ip+=ch;
            }

        }

return ip;
    }
    public static void main(String[] args)
    {

        String str="255.100.50.0";
        System.out.println(GenerateIp(str));
    }
    
}










