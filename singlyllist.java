import java.util.LinkedList;

public class singlyllist {
    Node head;
    static class Node{  // class node create
        int data;
        Node next;
        Node(int d)   // create constructor
        {
            data=d;
            next=null;
        }
    }
// create method to insert a new nodes
public static singlyllist insert(singlyllist list,int data)
{
    Node newnode=new Node(data);// new node
    if(list.head==null){
        list.head=newnode;
    }
    else
    {
        Node last=list.head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newnode;
    }
    return list;
} 
public static void printlist(singlyllist list)
{
    Node temp=list.head;
    System.out.println("Linked list is+ ");
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
    public static void main(String[] args)
    {
        singlyllist list=new singlyllist(); // empty list 
        list=insert(list,1); // insert values in ll
        list=insert(list,5);
 printlist(list);// for print

    }
    
}
