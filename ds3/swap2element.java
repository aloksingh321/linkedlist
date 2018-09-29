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
public void swap()
{
Node r=head;
Node y=head;
Node t=null;
while(r.next!=null)
{
t=r;
  r=r.next;
  }
 int f=t.next.data ;
     t.next.data=y.data;
     y.data=f;
}

public void display(Node q)
{
Node temp=head;
System.out.println("element after swapping:- ");
while(temp!=null)
{
  System.out.print(temp.data+" ");
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
  Node q=null;
  q=a.createnode(n,obj);
  a.swap();
  a.display(q);
  
  }
}