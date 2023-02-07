public class pattern1 {
    public static void printpattern1(int row,int col)
    {
        for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) 
            {
				if((i==1 || i==col) || (j==1 || j==col))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
			
		
	}
    }

    public static void printpattern(int row ,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // print   the pattern
        // ****
        // ****
        // ****
        // ****
        int col=10;


        int row=10;
        //printpattern(row,col); // print round star
        printpattern1(row,col);
    }
    
}
