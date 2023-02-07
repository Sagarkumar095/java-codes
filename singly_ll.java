import java.util.Scanner;

public class singly_ll {

 static class Node  // create class (structue)
 {
    int data;
    Node next;
    Node(int data)// constructor create
    {
this.data=data;
this.next=null;
    } 
 } 
 Node head=null;   // head is a variable 
public void creation() // method for create ll
{

    int data,n;
    do{
    System.out.println("enter the data");

    Scanner sc=new Scanner(System.in);
    data=sc.nextInt();
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
    System.out.println("do u want to add more data if yes then press 1");
    n=sc.nextInt();
}
    while(n==1);
}
public void display()
{

Node temp=head;
if(head==null)
{
    System.out.println("ll does not exist");
} 
else
{
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}  
}
    public static void main(String[] args)
    {
        singly_ll list=new  singly_ll();
        list.creation();  // creating ll
        list.display();    // print ll
    }
    
}
