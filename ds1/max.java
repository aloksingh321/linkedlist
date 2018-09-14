class Main {
  public static void main(String[] args) {
   String s="aloksingh";
   char a[]=s.toCharArray();
   char result=0;
   int i;
   int count[]= new int[1000];
   for(i=0;i<a.length;i++)
   {
       count[a[i]]++;
   }
   int max=-1;
   for(i=0;i<a.length;i++)
   {
     if(max<count[a[i]])
     {
       max=count[a[i]];
       result = a[i];
     }
   }
   System.out.println(result);   
  }
}