package test.second;
public class Pattern13
{
	int n=1;int m=4;
public static void main(String[] args) 
{
Pattern13 pt = new Pattern13();
pt.avoid(5);
pt.deserve(1);
}
private void avoid(int i) 
{
if(i>=1)
{
	Pattern13.decide(i,n);
	System.out.println();
	n=n+1;
	i--;
	avoid(i);
}
}
public static void decide(int j,int k)
{
if(k>=1)
{
System.out.print("*"+" ");
decide(j,k-1);
}
}
public void deserve(int a)
{
if(a<=4)
{
Pattern13.sum(a,m);
System.out.println();
a++;
m=m-1;
deserve(a);
}	
}
public static void sum(int b,int c)
{
if(c>=1)
{
	System.out.print("*"+" ");
	sum(b,c-1);
}
}
}
/* OUTPUT:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
