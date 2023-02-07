 import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) 
    {
       // File myfile=new File("//home//heypoppy//Desktop//sagar.txt ");
    //     if(myfile.createNewFile())      // Create a New File
    //     {
    //         System.out.println("File successfully created");
    //     }
    //     else
    // {
    //     System.out.println("File already exits");
    // }                                           //// check File exits
    // if(myfile.exists())
    // {
    //     System.out.println("File Name "+myfile.getName());
    //     System.out.println("File Location "+myfile.getAbsolutePath());
    //     System.out.println("length of File "+myfile.length());
    //     System.out.println("File readable "+myfile.canRead());
    // }


try {
    
 
    FileWriter file=new FileWriter("//home//heypoppy//Desktop//javafile.txt");
    try{

    file.write(" Java is high level programming language");
         
     }
      finally
      {
          file.close();
      }
      System.out.println("successfully data wrote in file");
    

    
}
    catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }
}
}

