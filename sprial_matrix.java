import java.util.*;
public class sprial_matrix {

    // Function Definition
    static void spiralPrint(int row,int col,int mat[][])
    {
        List<Integer>list=new ArrayList<>();
  int top=0,bottom=row-1;
  int left=0,right=col-1;

while(top<=bottom&& left<=right)
{
for(int i=left;i<=right;i++)
{
 list.add(mat[top][i]);
}
top++;
// 
for(int i=top;i<=bottom;i++)
{
    list.add(
        mat[i][right]);
}
right--;
//
if(top<=bottom)
{
for(int i=right;i>=left;i--)
{
    list.add(mat[bottom][i]);
}
}
bottom--;
if(left<=right)
{
    for(int i=bottom;i>=top;i--)
    {
        list.add(mat[i][left]);
    }
}
left++;
}
// print spiral matrix
for(int i=0;i<list.size();i++)
{
    System.out.print(list.get(i)+" ");
}

}
    public static void main(String[] args)
    {

        
        int r = 4;
        int c = 4;
        int mat[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        // Function Call
        spiralPrint(r, c, mat);

    }
    
}
