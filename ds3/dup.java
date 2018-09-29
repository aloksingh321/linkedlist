import java.util.Scanner;
import java.util.*;
class Node
{ 
int data;
 Node next;
 Node(int d)
 {
   data=d;
   next=null;
 } 
} 
class Linkedlist
{ 
Node head; 
public Node createnode(int n,Scanner obj)
{
 Node p=head;
  for(int i=0;i<n;i++)
  {
    int s= obj.nextInt();
    Node temp=new Node(s);
   
    temp.next=null;
    if(head==null)
    {
      head=temp;
      p=temp;
    } 
    else
    {
      p.next=temp;
      p=temp;
    }
   
  }
    return head;
}

public void duplicates()
{
  Node temp=head;
  Node temp1=null;
  Node r=null;
  while(temp.next!=null)
  {
    if(temp.data==temp.next.data)
    {
      r=temp.next.next;
     temp.next=r; 
    }   
    else
    { 
    temp=temp.next;
    }
  }
}

public void display(Node q)
{
Node temp=head;
while(temp!=null)
{
  System.out.print(temp.data);
   temp=temp.next;  
}
}
}
class Main
{
  public static void main(String args[])
  {
  Scanner obj = new Scanner(System.in);
  Linkedlist a = new Linkedlist();
  System.out.println("Enter the number u want to enter bro):-");
  int n = obj.nextInt();
  Node q=null,m=null,e=null;
   q=a.createnode(n,obj);
  a.duplicates();
  System.out.println("duplicates Element are  removed ");
  a.display(q);
  }
}