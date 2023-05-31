
import java.util.*;
public class add_mulmatrix {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // input for first matrix
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("enter the matrix elements"+row+" "+ col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
        {
              matrix[i][j]=sc.nextInt();
        }
        }
// input for second matrix
System.out.println("enter the row");
int row1=sc.nextInt();
System.out.println("Enter the col");
int col1=sc.nextInt();
int matrix2[][]=new int[row1][col1];
System.out.println("enter the matrix elements"+row1+" "+ col1);
for(int i=0;i<row1;i++)
{
    for(int j=0;j<col1;j++)
{
      matrix2[i][j]=sc.nextInt();
}
}

if(col==row1) // Multiplication
{
    int mul[][]=new int [row][col1];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col1;j++)
        {
            for(int k=0;k<col;k++)
            {
                mul[i][j]=matrix[i][k]*matrix[k][j];
            }
        }
    }
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col1;j++)
        {
            System.out.print(mul[i][j]+" ");
        }
        System.out.println();
    }

}
else
{
    System.out.println(" not possible for multiplication");
}
// // for addition
// int finalmatrix[][]=new int[row][col1];
// for(int i=0;i<row;i++)
// {
//     for(int j=0;j<col;j++)
//     {
//         finalmatrix[i][j]=matrix[i][j]+matrix2[i][j];
//     }
// }
// int n=finalmatrix.length;
// int m=finalmatrix[0].length;
// // print addition of matrix
// for(int i=0;i<n;i++)
// {
//     for(int j=0;j<m;j++)
//     {
//         System.out.print(finalmatrix[i][j]+" ");
//     }
//     System.out.println();
// }
    }
    
}
