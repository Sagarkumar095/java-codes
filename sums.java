import java.util.*;
public class sums {

    public static void main(String[] args)
    {


    System.out.println(" Enter the number");
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int mod=0;
while(n>0)
{
    mod=n%10;
    sum+=mod;
    n=n/10;

}
System.out.println("The sum of digits is ="+ sum);



public int maximumMatch(int[][] G)
{
    // Code here
    
    
     int m = G.length;
    int n = G[0].length;
    int[] match = new int[n];
    int result = 0;
    
    Arrays.fill(match, -1);

    for (int u = 0; u < m; u++) {
      boolean[] vis = new boolean[n];
      if (bfs(u, G, match, vis)) result++;
    }
    return result;
}

private static boolean bfs(int u, int[][] g, int[] match, boolean[] vis) {
    for (int v = 0; v < g[0].length; v++) {
        if (g[u][v] == 1 && !vis[v]) {
            vis[v] = true;
            if (match[v] == -1 || bfs(match[v], g, match, vis)) {
              match[v] = u;
              return true;
            }
        }
    }
    return false;

    }
    
}






class Solution{
	public static int countPaths(int n){
		//code here
		
		
		  if(n==1)

      return 0;

  long mod=1000000007;

  long curr=3, prev=0;

  for(int i=3;i<=n;i++)

  {

      long temp=curr;

      curr=(curr*2+prev*3) %mod;

      prev=temp;

  }

  return (int)(curr);
		
	
	}	
}