import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rege1 {
    public static void main(String[] args)
    {
        Pattern p=Pattern .compile("[^a-z0-9]");
        Matcher m=p.matcher("ab&ec3456");
        while(m.find())
        {
            System.out.println(m.start()+"="+m.group());
        }
    }
    
}
