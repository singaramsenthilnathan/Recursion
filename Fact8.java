public class Fact8
{
public static void main(String[]args)
{
int a[]={10,20,40,30,50,60,70};
for(int i=0,j=a.length-1;i<j;i++,j--)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
}
}

/* OUTPUT:
c:\java>java Fact8
70 60 50 30 40 20 10
*/