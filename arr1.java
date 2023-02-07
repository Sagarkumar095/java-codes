import java.util.Scanner;

public class arr1 {
    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
int i,j;

int m=3;  // no of rows
int n=3;   // No of Column
int arr[][]=new int[m][n];
System.out.println("Enter the first  array element");
for(i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    {
        arr[i][j]=sc.nextInt();
    }
}
// print an array element

System.out.println(" the array element are: ");

for(i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    {
       System.out.print(arr[i][j]);
    }

System.out.println();
}                // input second array element
int arr2[][]=new int[m][n];

System.out.println("Enter the Second array element");
for( i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    {
arr2[i][j]=sc.nextInt();
    }
}


System.out.println(" the array element are: ");

for(i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    {
       System.out.print(arr2[i][j]);
    }

System.out.println();
}
System.out.println("the sum of the two matrix are");
int sum[][]=new int[m][n];
// int i,j;
for( i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    for(int k=0;k<m;k++)
    {
    {

sum[i][j]+=arr[i][k]*arr2[k][j];
    }
}
}
for( i=0;i<m;i++)
{
    for( j=0;j<n;j++)
    {
System.out.print(sum[i][j]+" ");
    }
    System.out.println();
}  
    
}
}