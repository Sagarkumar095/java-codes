public class str_capital {
             // to print all word first char is capital
      public static String capital(String s)
      {
          StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));// first char is uppercase
        sb.append(ch);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&i<s.length()-1)
            {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));

            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
          return sb.toString();
      }
    public static void main(String[] args)
    {
        //String str="something is better than nothing";
        String str="cse me it mec bca mca bba bcom";
        System.out.println(capital(str));
    }
}
