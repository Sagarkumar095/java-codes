import java.util.*;
public class count_small {

    public static boolean checkparenthesis(String str)
    {

         Stack<Character>stack=new Stack<>();
         for(int i=0;i<str.length();i++)
         {
             char ch=str.charAt(i);
             if(ch=='('|| ch=='{'|| ch=='[')
             {
               stack.push(ch);
               
             }
            else if(!stack.empty()&& ch=='}'&& ch==stack.peek()|| ch==')'&& ch==stack.peek()|| ch==']'&& ch== stack.peek() )
             { stack.pop();
                 
             }
             else
             {
                 stack.push(ch);
             }
        
                          }

            if(stack.empty())
            {
                return true;
            } 
            else
            {
            return false;
            }
         
    }
    public static void main(String [] args)
    {



        String str="(){{}}";
        System.out.println(checkparenthesis(str));
    }
}
